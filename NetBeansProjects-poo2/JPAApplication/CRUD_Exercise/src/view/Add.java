package view;

import crud_exercise.CRUD_Exercise;
import crud_exercise.Pessoa;
import crud_exercise.PessoaJpaController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Add extends javax.swing.JFrame {

    private final PessoaJpaController controller;
    
    public Add() {
        
        this.controller = new PessoaJpaController(CRUD_Exercise.getEntityManagerFactory());
        
        initComponents();
        
        addDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarPessoa();
            }
        });
    }
    
    private void salvarPessoa(){
        
        String nome = nameTxt.getText().trim();
        String idadeStr = ageTxt.getText().trim();
        String cidade = cityTxt.getText().trim();

        if (nome.isEmpty() || idadeStr.isEmpty() || cidade.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Por favor, preencha todos os campos!",
                "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int idade;
        
        try {
            idade = Integer.parseInt(idadeStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                "Idade deve ser um número inteiro!",
                "Erro de Formato", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setCidade(cidade);

        try {
            controller.create(pessoa);
            JOptionPane.showMessageDialog(this,
                "Pessoa cadastrada com sucesso! ID: " + pessoa.getId());
            nameTxt.setText("");
            ageTxt.setText("");
            cityTxt.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                "Erro ao cadastrar: " + ex.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        namLbl = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        ageLbl = new javax.swing.JLabel();
        cityTxt = new javax.swing.JTextField();
        cityLbl = new javax.swing.JLabel();
        addDataButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addButton.setText("Adicionar");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchButton.setText("Selecionar");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.setText("Excluir");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.setText("Atualizar");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Adicionar cadastro");

        namLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namLbl.setText("Nome:");

        ageLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ageLbl.setText("Idade:");

        cityLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cityLbl.setText("Cidade:");

        addDataButton.setText("Adicionar");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(cityLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(ageLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(namLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1))
                    .addComponent(addDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namLbl)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLbl)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLbl)
                    .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(addDataButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(searchButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addGap(18, 18, 18)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
        dispose();
        
        Update u = new Update();
        u.setLocationRelativeTo(null);
        u.setTitle("Pesquisa");
        u.setVisible(true);
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        dispose();
        
        Search s = new Search();
        s.setLocationRelativeTo(null);
        s.setTitle("Pesquisa");
        s.setVisible(true);
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        dispose();
        
        Delete d = new Delete();
        d.setLocationRelativeTo(null);
        d.setTitle("Pesquisa");
        d.setVisible(true);
        
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton addDataButton;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel namLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JPanel panel;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
