package view;

import crud_exercise.CRUD_Exercise;
import crud_exercise.Usuario;
import crud_exercise.UsuarioJpaController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    private final UsuarioJpaController controller;
    private boolean success = false;

    public Login() {
        
        this.controller = new UsuarioJpaController(CRUD_Exercise.getEntityManagerFactory());
                
        initComponents();

    }
    
    public boolean entrar(){
        
        String nome = userTxt.getText().trim();
        String senha = new String(passwordTxt.getPassword()).trim();

        Usuario usuario = controller.findUsuarioByNameAndPassword(nome, senha);

        if (usuario != null) {
            JOptionPane.showMessageDialog(this, "Login realizado com sucesso!");
            success = true;
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos.");
        }
        
        return success;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userTxt = new javax.swing.JTextField();
        userLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        passwordTxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });

        userLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userLbl.setText("Usuário:");

        passwordLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLbl.setText("Senha:");

        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginButton.setText("Entrar");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordLbl)
                        .addGap(18, 18, 18)
                        .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userLbl)
                        .addGap(18, 18, 18)
                        .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        entrar();
        
        if(success == true){
            
            dispose();
        
            Home h = new Home();
            h.setLocationRelativeTo(null);
            h.setTitle("Home");
            h.setVisible(true);
            
        }
        
        userTxt.setText("");
        passwordTxt.setText("");
        
    }//GEN-LAST:event_loginButtonActionPerformed

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JLabel userLbl;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
