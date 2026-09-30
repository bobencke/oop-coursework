package crud_exercise;

import crud_exercise.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class PessoaJpaController implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private final EntityManagerFactory emf;

    public PessoaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pessoa pessoa) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(pessoa);
            em.getTransaction().commit();
        } finally {
            if (em.isOpen()) em.close();
        }
    }

    public void edit(Pessoa pessoa) throws NonexistentEntityException {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(pessoa);
            em.getTransaction().commit();
        } catch (Exception ex) {
            Integer id = pessoa.getId();
            if (findPessoa(id) == null) {
                throw new NonexistentEntityException(
                    "A Pessoa com id " + id + " não existe.");
            }
            throw ex;
        } finally {
            if (em.isOpen()) em.close();
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Pessoa pessoa;
            try {
                pessoa = em.getReference(Pessoa.class, id);
            } catch (javax.persistence.EntityNotFoundException enfe) {
                throw new NonexistentEntityException(
                    "A Pessoa com id " + id + " não existe.", enfe);
            }
            em.remove(pessoa);
            em.getTransaction().commit();
        } finally {
            if (em.isOpen()) em.close();
        }
    }

    public Pessoa findPessoa(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pessoa.class, id);
        } finally {
            if (em.isOpen()) em.close();
        }
    }
    
    public List<Pessoa> findPessoaByName(String nome) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Pessoa> query = em.createQuery(
                "SELECT p FROM Pessoa p WHERE p.nome LIKE :nome", Pessoa.class);
            query.setParameter("nome", "%" + nome + "%");
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Pessoa> findPessoaEntities() {
        return findPessoaEntities(true, -1, -1);
    }

    public List<Pessoa> findPessoaEntities(int maxResults, int firstResult) {
        return findPessoaEntities(false, maxResults, firstResult);
    }

    private List<Pessoa> findPessoaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Pessoa> cq = em.getCriteriaBuilder().createQuery(Pessoa.class);
            Root<Pessoa> rt = cq.from(Pessoa.class);
            cq.select(rt);
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            if (em.isOpen()) em.close();
        }
    }

    public int getPessoaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Long> cq = cb.createQuery(Long.class);
            Root<Pessoa> rt = cq.from(Pessoa.class);
            cq.select(cb.count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            if (em.isOpen()) em.close();
        }
    }
}