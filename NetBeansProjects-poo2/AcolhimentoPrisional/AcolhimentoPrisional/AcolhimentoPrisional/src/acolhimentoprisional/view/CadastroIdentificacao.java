package acolhimentoprisional.view;

import acolhimentoprisional.dao.DetentoDAO;
import acolhimentoprisional.model.Detento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;


public class CadastroIdentificacao extends javax.swing.JFrame {

    public CadastroIdentificacao(Detento d) {
        initComponents();

        try {
            MaskFormatter mascaraDataNascimento = new MaskFormatter("##/##/####");
            mascaraDataNascimento.setPlaceholderCharacter('_');
            birthDateTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascaraDataNascimento));
        } catch (ParseException ex) {
            Logger.getLogger(CadastroIdentificacao.class.getName()).log(Level.SEVERE, null, ex);
        }

        nextPageB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proximaPagina(d);
            }
        });
    }

    
    public void proximaPagina(Detento d){

        d.setNomeCompleto(fullNameTxt.getText());
        d.setNomeSocial(socialNameTxt.getText());
        d.setNomeMae(momNameTxt.getText());
        d.setCpf(cpfTxt.getText());
        
        String dataNascimentoStr = birthDateTxt.getText();
        SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoMySQL = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date dataNascimento = formatoEntrada.parse(dataNascimentoStr);
            String dataNascimentoMySQL = formatoMySQL.format(dataNascimento);
            d.setDataNascimento(dataNascimentoMySQL);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroIdentificacao.class.getName()).log(Level.SEVERE, "Erro ao converter data de nascimento", ex);
        }
        
        d.setIdade(Integer.parseInt(ageTxt.getText()));
        d.setNacionalidade(nacionalityCB.getSelectedItem().toString());
        d.setPaisOrigem(countryTxt.getText());
        d.setEstadoCivil(civilStateCB.getSelectedItem().toString());
        d.setEtnia(raceCB.getSelectedItem().toString());
        d.setSexoBiologico(sexCB.getSelectedItem().toString());
        d.setIdentidadeDeGenero(genderCB.getSelectedItem().toString());
        d.setOrientacaoSexual(sexualOrientionCB.getSelectedItem().toString());
        
        dispose();
        
        CadastrosDadosSocioeconomicos cds = new CadastrosDadosSocioeconomicos(d);
        cds.setTitle("Dados Sociais e Econômicos");
        cds.setLocationRelativeTo(null);
        cds.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        respLbl = new javax.swing.JLabel();
        fullNameTxt = new javax.swing.JTextField();
        nextPageB = new javax.swing.JButton();
        dateLbl = new javax.swing.JLabel();
        procLbl = new javax.swing.JLabel();
        socialNameTxt = new javax.swing.JTextField();
        entryDateLbl = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        entryDateLbl2 = new javax.swing.JLabel();
        nacionalityCB = new javax.swing.JComboBox<>();
        entryDateLbl3 = new javax.swing.JLabel();
        momNameTxt = new javax.swing.JTextField();
        dateLbl1 = new javax.swing.JLabel();
        procLbl1 = new javax.swing.JLabel();
        civilStateCB = new javax.swing.JComboBox<>();
        entryDateLbl4 = new javax.swing.JLabel();
        procLbl2 = new javax.swing.JLabel();
        raceCB = new javax.swing.JComboBox<>();
        entryDateLbl5 = new javax.swing.JLabel();
        genderCB = new javax.swing.JComboBox<>();
        procLbl3 = new javax.swing.JLabel();
        sexCB = new javax.swing.JComboBox<>();
        entryDateLbl6 = new javax.swing.JLabel();
        sexualOrientionCB = new javax.swing.JComboBox<>();
        entryDateLbl7 = new javax.swing.JLabel();
        cpfTxt = new javax.swing.JTextField();
        dateLbl2 = new javax.swing.JLabel();
        countryTxt = new javax.swing.JTextField();
        otherTxt = new javax.swing.JTextField();
        ethnicityTxt = new javax.swing.JTextField();
        birthDateTxt = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        respLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        respLbl.setText("Nome Completo:");

        fullNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        nextPageB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nextPageB.setText("Próxima");
        nextPageB.setToolTipText("");
        nextPageB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageBActionPerformed(evt);
            }
        });

        dateLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dateLbl.setText("Nome Social:");

        procLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        procLbl.setText("Nacionalidade:");

        socialNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        entryDateLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl.setText("Data Nascimento:");

        ageTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        entryDateLbl2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl2.setText("Idade:");

        nacionalityCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nacionalityCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brasileiro(a)", "Naturalizado(a)", "Estrangeiro(a)" }));
        nacionalityCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalityCBActionPerformed(evt);
            }
        });

        entryDateLbl3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl3.setText("País:");

        momNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        dateLbl1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dateLbl1.setText("Nome da Mãe:");

        procLbl1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        procLbl1.setText("Estado Civil:");

        civilStateCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        civilStateCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "União Estável" }));

        entryDateLbl4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl4.setText("Outro:");

        procLbl2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        procLbl2.setText("Raça/Cor:");

        raceCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        raceCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Branco(a)", "Preto(a)", "Pardo(a)", "Amarelo(a)", "Indígena" }));

        entryDateLbl5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl5.setText("Etnia:");

        genderCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genderCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homem", "Mulher", "Homem Trans", "Mulher Trans/Travesti", "Não binário", "Não desejo informar" }));

        procLbl3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        procLbl3.setText("Sexo Biológico:");

        sexCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sexCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Intersexo", "Não desejo informar" }));
        sexCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexCBActionPerformed(evt);
            }
        });

        entryDateLbl6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl6.setText("Identidade de Gênero:");

        sexualOrientionCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sexualOrientionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Heterossexual", "Homossexual", "Bissexual", "Outro", "Não desejo informar" }));

        entryDateLbl7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl7.setText("Orientação Sexual:");

        cpfTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        dateLbl2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dateLbl2.setText("CPF:");

        countryTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        otherTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ethnicityTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        birthDateTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat(""))));
        birthDateTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entryDateLbl6)
                                    .addComponent(procLbl3)
                                    .addComponent(entryDateLbl7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sexualOrientionCB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderCB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sexCB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nextPageB)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(procLbl2)
                                            .addGap(70, 70, 70)
                                            .addComponent(raceCB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(entryDateLbl)
                                                        .addGap(18, 18, 18))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(procLbl)
                                                        .addGap(35, 35, 35)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(procLbl1)
                                                    .addGap(55, 55, 55)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(civilStateCB, 0, 1, Short.MAX_VALUE)
                                                .addComponent(birthDateTxt)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(nacionalityCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 2, Short.MAX_VALUE)))))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(entryDateLbl2)
                                        .addComponent(entryDateLbl3)
                                        .addComponent(entryDateLbl4)
                                        .addComponent(entryDateLbl5))
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(countryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(otherTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ethnicityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(respLbl)
                                    .addComponent(dateLbl)
                                    .addComponent(dateLbl1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(momNameTxt)
                                    .addComponent(fullNameTxt)
                                    .addComponent(socialNameTxt)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateLbl2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(respLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLbl)
                    .addComponent(socialNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLbl1)
                    .addComponent(momNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLbl2)
                    .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLbl)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryDateLbl2)
                    .addComponent(birthDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(procLbl)
                    .addComponent(nacionalityCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryDateLbl3)
                    .addComponent(countryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(procLbl1)
                    .addComponent(civilStateCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryDateLbl4)
                    .addComponent(otherTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(procLbl2)
                    .addComponent(raceCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryDateLbl5)
                    .addComponent(ethnicityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(procLbl3)
                    .addComponent(sexCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLbl6)
                    .addComponent(genderCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLbl7)
                    .addComponent(sexualOrientionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(nextPageB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextPageBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextPageBActionPerformed

    private void sexCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexCBActionPerformed

    private void nacionalityCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalityCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalityCBActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroIdentificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroIdentificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroIdentificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroIdentificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTxt;
    private javax.swing.JFormattedTextField birthDateTxt;
    private javax.swing.JComboBox<String> civilStateCB;
    private javax.swing.JTextField countryTxt;
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel dateLbl1;
    private javax.swing.JLabel dateLbl2;
    private javax.swing.JLabel entryDateLbl;
    private javax.swing.JLabel entryDateLbl2;
    private javax.swing.JLabel entryDateLbl3;
    private javax.swing.JLabel entryDateLbl4;
    private javax.swing.JLabel entryDateLbl5;
    private javax.swing.JLabel entryDateLbl6;
    private javax.swing.JLabel entryDateLbl7;
    private javax.swing.JTextField ethnicityTxt;
    private javax.swing.JTextField fullNameTxt;
    private javax.swing.JComboBox<String> genderCB;
    private javax.swing.JTextField momNameTxt;
    private javax.swing.JComboBox<String> nacionalityCB;
    private javax.swing.JButton nextPageB;
    private javax.swing.JTextField otherTxt;
    private javax.swing.JLabel procLbl;
    private javax.swing.JLabel procLbl1;
    private javax.swing.JLabel procLbl2;
    private javax.swing.JLabel procLbl3;
    private javax.swing.JComboBox<String> raceCB;
    private javax.swing.JLabel respLbl;
    private javax.swing.JComboBox<String> sexCB;
    private javax.swing.JComboBox<String> sexualOrientionCB;
    private javax.swing.JTextField socialNameTxt;
    // End of variables declaration//GEN-END:variables
}
