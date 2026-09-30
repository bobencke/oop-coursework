package revisaoprova2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PaginaInicial extends javax.swing.JFrame {

    public PaginaInicial() {
        initComponents();
                
        for (UF dia : UF.values()) {
            searchComboBox.addItem(dia.toString());
        }
        
        searchComboBox.setSelectedItem(null);
        
        addDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarContato();
            }
        });
        
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherTabela();
            }
        });
        
        dataTable.getSelectionModel().addListSelectionListener(e -> {
            
            if (!e.getValueIsAdjusting()) {
                int linhaSelecionada = dataTable.getSelectedRow();

                if (linhaSelecionada != -1) {
                    int linhaModelo = dataTable.convertRowIndexToModel(linhaSelecionada);

                    Object valor1 = dataTable.getModel().getValueAt(linhaModelo, 0);
                    Object valor2 = dataTable.getModel().getValueAt(linhaModelo, 1);
                    Object valor3 = dataTable.getModel().getValueAt(linhaModelo, 2);

                    nameResult.setText(valor1 != null ? valor1.toString() : "");
                    celResult.setText(valor2 != null ? valor2.toString() : "");
                    cityResult.setText(valor3 != null ? valor3.toString() : "");
                } else {
                    nameResult.setText("");
                    celResult.setText("");
                    cityResult.setText("");
                }
            }
        });

    }
    
    public void adicionarContato(){
        
        Adicionar a = new Adicionar();
        a.setTitle("Adicionar");
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        
    }
    
    
    public void preencherTabela(){
        
        if (searchComboBox.getSelectedItem() != null && !searchComboBox.getSelectedItem().toString().isEmpty()) {

            DefaultTableModel modelo = (DefaultTableModel) dataTable.getModel();
            modelo.setNumRows(0);
            dataTable.setRowSorter(new TableRowSorter<>(modelo));

            ContatoDAO cdao = new ContatoDAO();

            String ufSelecionado = searchComboBox.getSelectedItem().toString();

            for (Contato cont : cdao.getContatos(ufSelecionado)){

                    modelo.addRow(new Object[]{
                        cont.getNome(),
                        cont.getTelefone(),
                        cont.getCidade()
                    });

                }
            }else{
                JOptionPane.showMessageDialog(null, "Deve selecionar o estado!");
            }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchButton = new javax.swing.JButton();
        searchComboBox = new javax.swing.JComboBox<>();
        searchLbl = new javax.swing.JLabel();
        dataScrollPane = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        nameLbl = new javax.swing.JLabel();
        CelLbl = new javax.swing.JLabel();
        CityLbl = new javax.swing.JLabel();
        addDataButton = new javax.swing.JButton();
        nameResult = new javax.swing.JLabel();
        celResult = new javax.swing.JLabel();
        cityResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchButton.setText("Localizar");

        searchComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchComboBox.setToolTipText("");
        searchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchComboBoxActionPerformed(evt);
            }
        });

        searchLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchLbl.setText("Estado:");

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Telefone", "Cidade"
            }
        ));
        dataTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        dataScrollPane.setViewportView(dataTable);

        nameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLbl.setText("Nome:");
        nameLbl.setToolTipText("");

        CelLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CelLbl.setText("Telefone:");
        CelLbl.setToolTipText("");

        CityLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CityLbl.setText("Cidade:");
        CityLbl.setToolTipText("");

        addDataButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addDataButton.setText("Novo Registro");

        nameResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameResult.setToolTipText("");

        celResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        celResult.setToolTipText("");

        cityResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cityResult.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CelLbl)
                            .addComponent(CityLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(celResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLbl)
                        .addGap(31, 31, 31)
                        .addComponent(nameResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addDataButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dataScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLbl))
                .addGap(18, 18, 18)
                .addComponent(dataScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CelLbl)
                    .addComponent(celResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CityLbl)
                    .addComponent(cityResult))
                .addGap(18, 18, 18)
                .addComponent(addDataButton)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchComboBoxActionPerformed


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
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CelLbl;
    private javax.swing.JLabel CityLbl;
    private javax.swing.JButton addDataButton;
    private javax.swing.JLabel celResult;
    private javax.swing.JLabel cityResult;
    private javax.swing.JScrollPane dataScrollPane;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel nameResult;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JLabel searchLbl;
    // End of variables declaration//GEN-END:variables
}
