package crud_exercise;

import crud_exercise.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class UsuarioJpaController implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private final EntityManagerFactory emf;

    public UsuarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Usuario usuario) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } finally {
            if (em.isOpen()) em.close();
        }
    }

    public void edit(Usuario usuario) throws NonexistentEntityException {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(usuario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            Integer id = usuario.getId();
            if (findUsuario(id) == null) {
                throw new NonexistentEntityException(
                    "A Usuario com id " + id + " não existe.");
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
            Usuario usuario;
            try {
                usuario = em.getReference(Usuario.class, id);
            } catch (javax.persistence.EntityNotFoundException enfe) {
                throw new NonexistentEntityException(
                    "A Usuario com id " + id + " não existe.", enfe);
            }
            em.remove(usuario);
            em.getTransaction().commit();
        } finally {
            if (em.isOpen()) em.close();
        }
    }

    public Usuario findUsuario(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Usuario.class, id);
        } finally {
            if (em.isOpen()) em.close();
        }
    }
    
    public Usuario findUsuarioByNameAndPassword(String nome, String senha) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Usuario> query = em.createQuery(
                "SELECT u FROM Usuario u WHERE u.nome = :nome AND u.senha = :senha", Usuario.class);
            query.setParameter("nome", nome);
            query.setParameter("senha", senha);

            List<Usuario> result = query.getResultList();
            return result.isEmpty() ? null : result.get(0);
        } finally {
            if (em.isOpen()) em.close();
        }
    }


    public List<Usuario> findUsuarioEntities() {
        return findUsuarioEntities(true, -1, -1);
    }

    public List<Usuario> findUsuarioEntities(int maxResults, int firstResult) {
        return findUsuarioEntities(false, maxResults, firstResult);
    }

    private List<Usuario> findUsuarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Usuario> cq = em.getCriteriaBuilder().createQuery(Usuario.class);
            Root<Usuario> rt = cq.from(Usuario.class);
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

    public int getUsuarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Long> cq = cb.createQuery(Long.class);
            Root<Usuario> rt = cq.from(Usuario.class);
            cq.select(cb.count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            if (em.isOpen()) em.close();
        }
    }
    
}
