package acolhimentoprisional.view;

import acolhimentoprisional.model.Detento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;

public class CadastroAtendimento extends javax.swing.JFrame {


    public CadastroAtendimento() {
        initComponents();

        procLbl.setVisible(false);
        procTxt.setVisible(false);

        try {
            MaskFormatter mascaraData = new MaskFormatter("##/##/####");
            mascaraData.setPlaceholderCharacter('_');
            dateTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascaraData));
        } catch (ParseException ex) {
            Logger.getLogger(CadastroAtendimento.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            MaskFormatter mascaraData2 = new MaskFormatter("##/##/####");
            mascaraData2.setPlaceholderCharacter('_');
            entryDateTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascaraData2));
        } catch (ParseException ex) {
            Logger.getLogger(CadastroAtendimento.class.getName()).log(Level.SEVERE, null, ex);
        }

        transfYesRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procLbl.setVisible(true);
                procTxt.setVisible(true);
            }
        });

        nextPageB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proximaPagina();
            }
        });
    }

    
    public void proximaPagina(){
        
        Detento d = new Detento();
        
        d.setResponsavelAtendimento(respTxt.getText());
        
        String dataAtendimentoStr = dateTxt.getText();
        String dataEntradaStr = entryDateTxt.getText();

        SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoMySQL = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date dataAtendimento = formatoEntrada.parse(dataAtendimentoStr);
            Date dataEntrada = formatoEntrada.parse(dataEntradaStr);

            String dataAtendimentoMySQL = formatoMySQL.format(dataAtendimento);
            String dataEntradaMySQL = formatoMySQL.format(dataEntrada);

            d.setDataAtendimento(dataAtendimentoMySQL);
            d.setDataEntrada(dataEntradaMySQL);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroAtendimento.class.getName()).log(Level.SEVERE, "Erro ao converter datas", ex);
        }
        
        if(!procTxt.getText().isEmpty()){
            d.setProcedenciaTransferencia(procTxt.getText());
        }
        
        dispose();
        
        CadastroIdentificacao ca = new CadastroIdentificacao(d);
        ca.setTitle("Identificação");
        ca.setLocationRelativeTo(null);
        ca.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        respLbl = new javax.swing.JLabel();
        respTxt = new javax.swing.JTextField();
        dateLbl = new javax.swing.JLabel();
        timeLbl = new javax.swing.JLabel();
        timeTxt = new javax.swing.JTextField();
        entryDateLbl = new javax.swing.JLabel();
        transfYesRB = new javax.swing.JRadioButton();
        transfNoRB = new javax.swing.JRadioButton();
        transfLbl = new javax.swing.JLabel();
        nextPageB = new javax.swing.JButton();
        procTxt = new javax.swing.JTextField();
        procLbl = new javax.swing.JLabel();
        dateTxt = new javax.swing.JFormattedTextField();
        entryDateTxt = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        respLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        respLbl.setText("Responsável pelo Atendimento:");

        respTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        dateLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dateLbl.setText("Data:");

        timeLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        timeLbl.setText("Horário:");

        timeTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        entryDateLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl.setText("Data de Entrada na Unidade:");

        transfYesRB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfYesRB.setText("Sim");
        transfYesRB.setToolTipText("");
        transfYesRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfYesRBActionPerformed(evt);
            }
        });

        transfNoRB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfNoRB.setText("Não");
        transfNoRB.setToolTipText("");
        transfNoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfNoRBActionPerformed(evt);
            }
        });

        transfLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfLbl.setText("Transferência de Outra Unidade:");

        nextPageB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nextPageB.setText("Próxima");
        nextPageB.setToolTipText("");
        nextPageB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageBActionPerformed(evt);
            }
        });

        procTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        procLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        procLbl.setText("Procedência:");

        dateTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat(""))));
        dateTxt.setToolTipText("");
        dateTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTxtActionPerformed(evt);
            }
        });

        entryDateTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat(""))));
        entryDateTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transfLbl)
                        .addGap(28, 28, 28)
                        .addComponent(transfYesRB)
                        .addGap(18, 18, 18)
                        .addComponent(transfNoRB))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(procLbl)
                            .addGap(18, 18, 18)
                            .addComponent(procTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nextPageB))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(entryDateLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(entryDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(dateLbl)
                            .addGap(18, 18, 18)
                            .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timeLbl)
                            .addGap(18, 18, 18)
                            .addComponent(timeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(respLbl)
                            .addGap(18, 18, 18)
                            .addComponent(respTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(respLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLbl)
                    .addComponent(timeLbl)
                    .addComponent(timeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLbl)
                    .addComponent(entryDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transfLbl)
                    .addComponent(transfYesRB)
                    .addComponent(transfNoRB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextPageB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(procTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(procLbl)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transfYesRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfYesRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfYesRBActionPerformed

    private void transfNoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfNoRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfNoRBActionPerformed

    private void nextPageBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextPageBActionPerformed

    private void dateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTxtActionPerformed


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
            java.util.logging.Logger.getLogger(CadastroAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAtendimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLbl;
    private javax.swing.JFormattedTextField dateTxt;
    private javax.swing.JLabel entryDateLbl;
    private javax.swing.JFormattedTextField entryDateTxt;
    private javax.swing.JButton nextPageB;
    private javax.swing.JLabel procLbl;
    private javax.swing.JTextField procTxt;
    private javax.swing.JLabel respLbl;
    private javax.swing.JTextField respTxt;
    private javax.swing.JLabel timeLbl;
    private javax.swing.JTextField timeTxt;
    private javax.swing.JLabel transfLbl;
    private javax.swing.JRadioButton transfNoRB;
    private javax.swing.JRadioButton transfYesRB;
    // End of variables declaration//GEN-END:variables
}
