package crud_exercise;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import view.Login;

/*

    @author
    Bernardo Oliveira Bencke

    Login para entrar:

    usuario1
    senha123

*/

public class CRUD_Exercise {
    
    private static final EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("CRUD_ExercisePU");

    public static void main(String[] args) {
        
        Login lg = new Login();
        lg.setLocationRelativeTo(null);
        lg.setTitle("Login");
        lg.setVisible(true);
        
    }
    
    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }

    public static void close() {
        emf.close();
    }
    
}
