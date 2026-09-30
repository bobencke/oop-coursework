package view;

import crud_exercise.CRUD_Exercise;
import crud_exercise.Pessoa;
import crud_exercise.PessoaJpaController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Update extends javax.swing.JFrame {

    private final PessoaJpaController controller;
    
    public Update() {
        
        this.controller = new PessoaJpaController(CRUD_Exercise.getEntityManagerFactory());
        
        initComponents();

        updateDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarPessoa();
            }
        });

    }
    
    public void atualizarPessoa(){
        
        String idString = idTxt.getText().trim();
        String nome = nameTxt.getText().trim();
        String idadeString = ageTxt.getText().trim();
        String cidade = cityTxt.getText().trim();
        
        if(idString.isEmpty() || nome.isEmpty() || idadeString.isEmpty() || cidade.isEmpty()){
            JOptionPane.showMessageDialog(this, 
                "Por favor, preencha todos os campos!",
                "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int id;
        int idade;
        
        try{
            id = Integer.parseInt(idString);
            idade = Integer.parseInt(idadeString);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,
                "Os campos id e idade devem ser números inteiros!",
                "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Pessoa pessoa = new Pessoa();
        pessoa.setId(id);
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setCidade(cidade);
        
        try{
            controller.edit(pessoa);
            JOptionPane.showMessageDialog(this,
                "Pessoa alterada com sucesso! ID: " + pessoa.getId());
            idTxt.setText("");
            nameTxt.setText("");
            ageTxt.setText("");
            cityTxt.setText("");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,
                "Erro ao atualizar: " + ex.getMessage(),
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
        idLbl = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        nameLbl = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        ageLbl = new javax.swing.JLabel();
        cityTxt = new javax.swing.JTextField();
        cityLbl = new javax.swing.JLabel();
        updateDataButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jLabel1.setText("Atualizar cadastro");

        idLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idLbl.setText("Id:");

        nameLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLbl.setText("Nome:");

        ageLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ageLbl.setText("Idade:");

        cityLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cityLbl.setText("Cidade:");

        updateDataButton.setText("Atualizar");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(nameLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(idLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1))
                    .addComponent(updateDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLbl)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLbl)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLbl)
                    .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(updateDataButton)
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
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        dispose();
        
        Add a = new Add();
        a.setLocationRelativeTo(null);
        a.setTitle("Pesquisa");
        a.setVisible(true);
        
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

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
    }//GEN-LAST:event_updateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JPanel panel;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton updateDataButton;
    // End of variables declaration//GEN-END:variables
}
