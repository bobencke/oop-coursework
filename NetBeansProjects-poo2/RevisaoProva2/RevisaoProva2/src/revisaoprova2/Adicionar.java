package revisaoprova2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adicionar extends javax.swing.JFrame {

    public Adicionar() {
        initComponents();
        
        for (UF dia : UF.values()) {
            stateComboBox.addItem(dia.toString());
        }
        
        stateComboBox.setSelectedItem(null);
        
        addDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarContato();
            }
        });
        
    }
    
    public void criarContato(){
    
        Contato c = new Contato();
        ContatoDAO cd = new ContatoDAO();
        
        if(!nameTxt.getText().isEmpty() || !celTxt.getText().isEmpty() 
                || !cityTxt.getText().isEmpty() || !stateComboBox.getSelectedItem().toString().isEmpty()){
            
            c.setNome(nameTxt.getText());
            c.setTelefone(celTxt.getText());
            c.setCidade(cityTxt.getText());
            String ufStr = stateComboBox.getSelectedItem().toString();
            c.setUf(UF.valueOf(ufStr));
            
            cd.create(c);
            
        }
        
        dispose();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLbl = new javax.swing.JLabel();
        CelLbl = new javax.swing.JLabel();
        CityLbl = new javax.swing.JLabel();
        celTxt = new javax.swing.JTextField();
        cityTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        CityLbl1 = new javax.swing.JLabel();
        stateComboBox = new javax.swing.JComboBox<>();
        addDataButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLbl.setText("Nome:");
        nameLbl.setToolTipText("");

        CelLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CelLbl.setText("Telefone:");
        CelLbl.setToolTipText("");

        CityLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CityLbl.setText("Cidade:");
        CityLbl.setToolTipText("");

        CityLbl1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CityLbl1.setText("Estado:");
        CityLbl1.setToolTipText("");

        stateComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        stateComboBox.setSelectedIndex(-1);
        stateComboBox.setToolTipText("");

        addDataButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addDataButton.setText("Salvar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CelLbl)
                    .addComponent(CityLbl)
                    .addComponent(nameLbl)
                    .addComponent(CityLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(celTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(addDataButton)
                        .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CelLbl)
                    .addComponent(celTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CityLbl1)
                    .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addDataButton)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Adicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adicionar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CelLbl;
    private javax.swing.JLabel CityLbl;
    private javax.swing.JLabel CityLbl1;
    private javax.swing.JButton addDataButton;
    private javax.swing.JTextField celTxt;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JComboBox<String> stateComboBox;
    // End of variables declaration//GEN-END:variables
}
