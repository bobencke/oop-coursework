package acolhimentoprisional.view;

import acolhimentoprisional.dao.DetentoDAO;
import acolhimentoprisional.model.Detento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TelaConsulta extends javax.swing.JFrame {

    public TelaConsulta() {
        
        initComponents();
        
        createB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarRegistro();
            }
        });
        
        searchB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherTabela();
            }
        });
        
    }
    
    public void preencherTabela(){
    
        if (!searchTxt.getText().isEmpty()) {

            DefaultTableModel modelo = (DefaultTableModel) resultTable.getModel();
            modelo.setNumRows(0);
            resultTable.setRowSorter(new TableRowSorter<>(modelo));

            DetentoDAO dao = new DetentoDAO();

            String nomePesquisado = searchTxt.getText();
            

            for (Detento d : dao.lerRegistros(nomePesquisado)){
                
                System.out.println(d);

                    modelo.addRow(new Object[]{
                        d.getId(),
                        d.getNomeCompleto(),
                        d.getCpf(),
                        d.getIdade(),
                        d.getNomeMae()
                    });

                }
            
            }else{
                
                DefaultTableModel modelo = (DefaultTableModel) resultTable.getModel();
                modelo.setNumRows(0);
                resultTable.setRowSorter(new TableRowSorter<>(modelo));

                DetentoDAO dao = new DetentoDAO();

                String nomePesquisado = searchTxt.getText();


                for (Detento d : dao.lerTodosRegistros(nomePesquisado)){

                    System.out.println(d);

                        modelo.addRow(new Object[]{
                            d.getId(),
                            d.getNomeCompleto(),
                            d.getCpf(),
                            d.getIdade(),
                            d.getNomeMae()
                        });

                }
            
            }
    
    }
    
    public void criarRegistro(){
        
        Detento d = new Detento();
        
        CadastroAtendimento ca = new CadastroAtendimento();
        ca.setTitle("Atendimento");
        ca.setLocationRelativeTo(null);
        ca.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLbl = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        createB = new javax.swing.JButton();
        searchB = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLbl.setText("Nome:");

        searchTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        createB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createB.setText("Cadastrar");

        searchB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchB.setText("Buscar");

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Idade", "Nome Mãe"
            }
        ));
        scrollPane.setViewportView(resultTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLbl)
                        .addGap(18, 18, 18)
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(createB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createB;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTable resultTable;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JButton searchB;
    private javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables
}
