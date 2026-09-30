package view;

import DAO.CidadeDAO;
import DAO.EstadoDAO;
import DAO.InfoDAO;
import ifdm_project.Info;
import ifdm_project.LeitorCSV;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class IFDM_Interface extends javax.swing.JFrame {

    public IFDM_Interface() {

        initComponents();
        
        importCSVButton.addActionListener(e -> importarCSV());
        ufComboBox.addActionListener(e -> atualizarComboCidade()); 
        cityComboBox.addActionListener(e -> atualizarDadosCidade());
        calculateData.addActionListener(e -> calcularMediaEstado());
        
        atualizarComboUF();
        
    }
    
    private void importarCSV() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File[] files = fileChooser.getSelectedFiles();
            LeitorCSV leitor = new LeitorCSV();
            leitor.importarCSV(Arrays.asList(files));
            atualizarComboUF();
        }
    }

    private void atualizarComboUF() {
        ufComboBox.removeAllItems();
        EstadoDAO estadoDAO = new EstadoDAO();
        List<String> siglas = estadoDAO.buscarTodasSiglas();
        for (String sigla : siglas) {
            ufComboBox.addItem(sigla);
        }
        if (!siglas.isEmpty()) {
            ufComboBox.setSelectedIndex(0);
        }
    }

    private void atualizarComboCidade() {
        String siglaUF = (String) ufComboBox.getSelectedItem();
        if (siglaUF == null) return;

        cityComboBox.removeAllItems();
        CidadeDAO cidadeDAO = new CidadeDAO();
        List<String> listaCidades = cidadeDAO.buscarNomesPorUF(siglaUF);
        for (String nome : listaCidades) {
            cityComboBox.addItem(nome);
        }
        if (!listaCidades.isEmpty()) {
            cityComboBox.setSelectedIndex(0);
        }

        calcularMediaEstado();
    }

    private void calcularMediaEstado() {
        String siglaUF = (String) ufComboBox.getSelectedItem();
        if (siglaUF == null) return;

        InfoDAO infoDAO = new InfoDAO();
        Map<String, Double> medias = infoDAO.calcularMediaIndicadoresPorEstado(siglaUF);

        double medEdu = medias.getOrDefault("Educação", 0.0);
        double medSau = medias.getOrDefault("Saúde", 0.0);
        double medEmp = medias.getOrDefault("Emprego", 0.0);
        double medGer = medias.getOrDefault("Geral", 0.0);

        stateEducationTF.setText(String.format("%.3f", medEdu));
        stateHealthTF.setText(   String.format("%.3f", medSau));
        stateIncomeTF.setText(   String.format("%.3f", medEmp));
        stateIFDMLabelTF.setText(String.format("%.3f", medGer));
    }

    private void atualizarDadosCidade() {
        String siglaUF    = (String) ufComboBox.getSelectedItem();
        String nomeCidade = (String) cityComboBox.getSelectedItem();
        if (siglaUF == null || nomeCidade == null) return;

        InfoDAO infoDAO = new InfoDAO();
        Map<String, Info> indicadores = infoDAO.buscarUltimosIndicadoresDaCidade(nomeCidade, siglaUF);

        Info infoEdu = indicadores.get("Educação");
        Info infoSau = indicadores.get("Saúde");
        Info infoEmp = indicadores.get("Emprego");
        Info infoGer = indicadores.get("Geral");

        cityEducationTF.setText(infoEdu != null ? String.format("%.3f", infoEdu.getValor()) : "");
        cityHealthTF.setText(   infoSau != null ? String.format("%.3f", infoSau.getValor()) : "");
        cityIncomeTF.setText(   infoEmp != null ? String.format("%.3f", infoEmp.getValor()) : "");
        cityIFDMTF.setText(     infoGer != null ? String.format("%.3f", infoGer.getValor()) : "");

        cityStateRankTF.setText(infoGer != null ? String.valueOf(infoGer.getRankingEstado() + "º") : "");
        cityNationRankTF.setText(infoGer != null ? String.valueOf(infoGer.getRankingNacional() + "º") : "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        ufLabel = new javax.swing.JLabel();
        ufComboBox = new javax.swing.JComboBox<>();
        cityLabel = new javax.swing.JLabel();
        ufInfoLabel = new javax.swing.JLabel();
        cityComboBox = new javax.swing.JComboBox<>();
        ufStateRankLabel = new javax.swing.JPanel();
        stateHealthLabel = new javax.swing.JLabel();
        stateEducationLabel = new javax.swing.JLabel();
        stateIncomeLabel = new javax.swing.JLabel();
        stateIFDMLabel = new javax.swing.JLabel();
        stateIFDMLabelTF = new javax.swing.JTextField();
        stateIncomeTF = new javax.swing.JTextField();
        stateEducationTF = new javax.swing.JTextField();
        stateHealthTF = new javax.swing.JTextField();
        cityInfoLabel = new javax.swing.JLabel();
        calculateData = new javax.swing.JButton();
        importCSVButton = new javax.swing.JButton();
        cityfPanel = new javax.swing.JPanel();
        cityHealthLabel = new javax.swing.JLabel();
        cityEducationLabel = new javax.swing.JLabel();
        cityIncomeLabel = new javax.swing.JLabel();
        cityIFDMLabel = new javax.swing.JLabel();
        cityStateRanklabel = new javax.swing.JLabel();
        cityNationRankLabel = new javax.swing.JLabel();
        cityNationRankTF = new javax.swing.JTextField();
        cityStateRankTF = new javax.swing.JTextField();
        cityIFDMTF = new javax.swing.JTextField();
        cityIncomeTF = new javax.swing.JTextField();
        cityEducationTF = new javax.swing.JTextField();
        cityHealthTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ufLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ufLabel.setText("UF:");

        cityLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cityLabel.setText("Cidade:");

        ufInfoLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ufInfoLabel.setText("Informações do estado selecionado");

        ufStateRankLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));

        stateHealthLabel.setText("Saúde:");

        stateEducationLabel.setText("Educação:");

        stateIncomeLabel.setText("Renda:");

        stateIFDMLabel.setText("IFDM:");

        javax.swing.GroupLayout ufStateRankLabelLayout = new javax.swing.GroupLayout(ufStateRankLabel);
        ufStateRankLabel.setLayout(ufStateRankLabelLayout);
        ufStateRankLabelLayout.setHorizontalGroup(
            ufStateRankLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ufStateRankLabelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ufStateRankLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ufStateRankLabelLayout.createSequentialGroup()
                        .addComponent(stateHealthLabel)
                        .addGap(67, 67, 67)
                        .addComponent(stateHealthTF, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                    .addGroup(ufStateRankLabelLayout.createSequentialGroup()
                        .addComponent(stateIFDMLabel)
                        .addGap(71, 71, 71)
                        .addComponent(stateIFDMLabelTF))
                    .addGroup(ufStateRankLabelLayout.createSequentialGroup()
                        .addComponent(stateIncomeLabel)
                        .addGap(66, 66, 66)
                        .addComponent(stateIncomeTF))
                    .addGroup(ufStateRankLabelLayout.createSequentialGroup()
                        .addComponent(stateEducationLabel)
                        .addGap(48, 48, 48)
                        .addComponent(stateEducationTF)))
                .addGap(20, 20, 20))
        );
        ufStateRankLabelLayout.setVerticalGroup(
            ufStateRankLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ufStateRankLabelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ufStateRankLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateHealthLabel)
                    .addComponent(stateHealthTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(ufStateRankLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateEducationLabel)
                    .addComponent(stateEducationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ufStateRankLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateIncomeLabel)
                    .addComponent(stateIncomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ufStateRankLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateIFDMLabel)
                    .addComponent(stateIFDMLabelTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        cityInfoLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cityInfoLabel.setText("Informações da cidade selecionada");

        importCSVButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        importCSVButton.setText("Importar Arquivo IFDM");
        
        calculateData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        calculateData.setText("Apurar Médias");

        cityfPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));

        cityHealthLabel.setText("Saúde:");

        cityEducationLabel.setText("Educação:");

        cityIncomeLabel.setText("Renda:");

        cityIFDMLabel.setText("IFDM:");

        cityStateRanklabel.setText("Ranking Estadual:");

        cityNationRankLabel.setText("Ranking Nacional:");

        javax.swing.GroupLayout cityfPanelLayout = new javax.swing.GroupLayout(cityfPanel);
        cityfPanel.setLayout(cityfPanelLayout);
        cityfPanelLayout.setHorizontalGroup(
            cityfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cityfPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cityfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cityfPanelLayout.createSequentialGroup()
                        .addComponent(cityNationRankLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cityNationRankTF))
                    .addGroup(cityfPanelLayout.createSequentialGroup()
                        .addComponent(cityHealthLabel)
                        .addGap(67, 67, 67)
                        .addComponent(cityHealthTF))
                    .addGroup(cityfPanelLayout.createSequentialGroup()
                        .addComponent(cityStateRanklabel)
                        .addGap(9, 9, 9)
                        .addComponent(cityStateRankTF))
                    .addGroup(cityfPanelLayout.createSequentialGroup()
                        .addComponent(cityIFDMLabel)
                        .addGap(71, 71, 71)
                        .addComponent(cityIFDMTF))
                    .addGroup(cityfPanelLayout.createSequentialGroup()
                        .addComponent(cityIncomeLabel)
                        .addGap(66, 66, 66)
                        .addComponent(cityIncomeTF))
                    .addGroup(cityfPanelLayout.createSequentialGroup()
                        .addComponent(cityEducationLabel)
                        .addGap(48, 48, 48)
                        .addComponent(cityEducationTF)))
                .addGap(20, 20, 20))
        );
        cityfPanelLayout.setVerticalGroup(
            cityfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cityfPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cityfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityHealthLabel)
                    .addComponent(cityHealthTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(cityfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityEducationLabel)
                    .addComponent(cityEducationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(cityfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityIncomeLabel)
                    .addComponent(cityIncomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(cityfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityIFDMLabel)
                    .addComponent(cityIFDMTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(cityfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityStateRanklabel)
                    .addComponent(cityStateRankTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(cityfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityNationRankLabel)
                    .addComponent(cityNationRankTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ufInfoLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ufLabel)
                                .addGap(10, 10, 10)
                                .addComponent(ufComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ufStateRankLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(importCSVButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityInfoLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(calculateData, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cityLabel)
                                    .addGap(10, 10, 10)
                                    .addComponent(cityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cityfPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importCSVButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ufLabel)
                    .addComponent(ufComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLabel)
                    .addComponent(cityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ufInfoLabel)
                    .addComponent(cityInfoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ufStateRankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityfPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Main assets ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IFDM_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IFDM_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IFDM_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IFDM_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IFDM_Interface().setVisible(true);
            }
        });
        
    }
                   
    private javax.swing.JComboBox<String> cityComboBox;
    private javax.swing.JLabel cityEducationLabel;
    private javax.swing.JTextField cityEducationTF;
    private javax.swing.JLabel cityHealthLabel;
    private javax.swing.JTextField cityHealthTF;
    private javax.swing.JLabel cityIFDMLabel;
    private javax.swing.JTextField cityIFDMTF;
    private javax.swing.JLabel cityIncomeLabel;
    private javax.swing.JTextField cityIncomeTF;
    private javax.swing.JLabel cityInfoLabel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel cityNationRankLabel;
    private javax.swing.JTextField cityNationRankTF;
    private javax.swing.JTextField cityStateRankTF;
    private javax.swing.JLabel cityStateRanklabel;
    private javax.swing.JPanel cityfPanel;
    private javax.swing.JButton importCSVButton;
    private javax.swing.JLabel stateEducationLabel;
    private javax.swing.JTextField stateEducationTF;
    private javax.swing.JLabel stateHealthLabel;
    private javax.swing.JTextField stateHealthTF;
    private javax.swing.JLabel stateIFDMLabel;
    private javax.swing.JTextField stateIFDMLabelTF;
    private javax.swing.JLabel stateIncomeLabel;
    private javax.swing.JTextField stateIncomeTF;
    private javax.swing.JComboBox<String> ufComboBox;
    private javax.swing.JLabel ufInfoLabel;
    private javax.swing.JLabel ufLabel;
    private javax.swing.JPanel ufStateRankLabel;
    private javax.swing.JButton calculateData;
    
}