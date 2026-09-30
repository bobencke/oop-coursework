package acolhimentoprisional.view;

import acolhimentoprisional.dao.DetentoDAO;
import acolhimentoprisional.model.Detento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CadastroTestesRapidos extends javax.swing.JFrame {

    public CadastroTestesRapidos(Detento d) {
        initComponents();
        
        nextPageB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proximaPagina(d);
            }
        });
    }
    
    public void proximaPagina(Detento d){
        
        List<String> testeHiv = new ArrayList<>();
        if (hivNaoRealizado.isSelected()) {
            testeHiv.add("Não realizado");
        } else {
            testeHiv.add(hivLote.getText());
            testeHiv.add(hivValidade.getText());
            testeHiv.add(hivReagente.isSelected() ? "Reagente" : "Não reagente");
        }
        d.setTesteHiv1_2(String.join(", ", testeHiv));
        
        List<String> testeHiv2 = new ArrayList<>();
        if (hiv2NaoRealizado.isSelected()) {
            testeHiv2.add("Não realizado");
        } else {
            testeHiv2.add(hiv2Lote.getText());
            testeHiv2.add(hiv2Validade.getText());
            testeHiv2.add(hiv2Reagente.isSelected() ? "Reagente" : "Não reagente");
        }
        d.setTesteHiv2_2(String.join(", ", testeHiv2));
        
        List<String> testeSifilis = new ArrayList<>();
        if (sifilisNaoRealizado.isSelected()) {
            testeSifilis.add("Não realizado");
        } else {
            testeSifilis.add(sifilisLote.getText());
            testeSifilis.add(sifilisValidade.getText());
            testeSifilis.add(sifilisReagente.isSelected() ? "Reagente" : "Não reagente");
        }
        d.setTesteSifilis(String.join(", ", testeSifilis));
        
        List<String> testeHepatiteB = new ArrayList<>();
        if (hepatiteBNaoRealizado.isSelected()) {
            testeHepatiteB.add("Não realizado");
        } else {
            testeHepatiteB.add(hepatiteBLote.getText());
            testeHepatiteB.add(hepatiteBValidade.getText());
            testeHepatiteB.add(hepatiteBReagente.isSelected() ? "Reagente" : "Não reagente");
        }
        d.setTesteHepatiteB(String.join(", ", testeHepatiteB));
        
        List<String> testeHepatiteC = new ArrayList<>();
        if (hepatiteCNaoRealizado.isSelected()) {
            testeHepatiteC.add("Não realizado");
        } else {
            testeHepatiteC.add(hepatiteCLote.getText());
            testeHepatiteC.add(hepatiteCValidade.getText());
            testeHepatiteC.add(hepatiteCReagente.isSelected() ? "Reagente" : "Não reagente");
        }
        d.setTesteHepatiteC(String.join(", ", testeHepatiteC));
        
        List<String> testeCovid = new ArrayList<>();
        if (covidNaoRealizado.isSelected()) {
            testeCovid.add("Não realizado");
        } else {
            testeCovid.add(covidLote.getText());
            testeCovid.add(covidValidade.getText());
            testeCovid.add(covidReagente.isSelected() ? "Reagente" : "Não reagente");
        }
        d.setTesteCovid(String.join(", ", testeCovid));
        
        String respostaGravidez= testeGravidezNaoRealizado.isSelected() 
        ? "Não realizado" 
        : testeGravidezPositivo.isSelected() ? "Positivo" : "Negativo";
        d.setTesteGravidez(respostaGravidez);
        
        d.setColetaEscarro(coletaEscarroSim.isSelected());
        
        d.setQueixa(queixasTxt.getText().trim().isEmpty() ? "Não" : queixasTxt.getText());
        
        d.setCondutaQueixa(condutaQueixaTxt.getText());
        
        d.setQueixaOdontologica(queixaOdontologica.getText().trim().isEmpty() ? "Não" : queixaOdontologica.getText());
        
        d.setAvaliacaoImediataDentista(avaliacaoDentista.isSelected());
        
        d.setCondutaDentista(condutaDentista.getText());
        
        d.setEncaminhamentosFinais(encaminhamentosFinais.getText());
        
        dispose();
        
        DetentoDAO dd = new DetentoDAO();
        dd.inserir(d);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        covidLote = new javax.swing.JTextField();
        entryDateLbl42 = new javax.swing.JLabel();
        entryDateLbl44 = new javax.swing.JLabel();
        entryDateLbl45 = new javax.swing.JLabel();
        transfYesRB6 = new javax.swing.JRadioButton();
        queixaOdontologica = new javax.swing.JTextField();
        entryDateLbl46 = new javax.swing.JLabel();
        transfNoRB8 = new javax.swing.JRadioButton();
        condutaDentista = new javax.swing.JTextField();
        covidValidade = new javax.swing.JTextField();
        entryDateLbl47 = new javax.swing.JLabel();
        covidReagente = new javax.swing.JRadioButton();
        transfYesRB25 = new javax.swing.JRadioButton();
        transfNoRB37 = new javax.swing.JRadioButton();
        avaliacaoDentista = new javax.swing.JRadioButton();
        covidNaoRealizado = new javax.swing.JRadioButton();
        entryDateLbl13 = new javax.swing.JLabel();
        entryDateLbl43 = new javax.swing.JLabel();
        entryDateLbl14 = new javax.swing.JLabel();
        transfYesRB23 = new javax.swing.JRadioButton();
        testeGravidezPositivo = new javax.swing.JRadioButton();
        testeGravidezNaoRealizado = new javax.swing.JRadioButton();
        entryDateLbl48 = new javax.swing.JLabel();
        encaminhamentosFinais = new javax.swing.JTextField();
        nextPageB = new javax.swing.JButton();
        entryDateLbl6 = new javax.swing.JLabel();
        entryDateLbl25 = new javax.swing.JLabel();
        hivLote = new javax.swing.JTextField();
        entryDateLbl26 = new javax.swing.JLabel();
        hivValidade = new javax.swing.JTextField();
        hivReagente = new javax.swing.JRadioButton();
        transfNoRB25 = new javax.swing.JRadioButton();
        hivNaoRealizado = new javax.swing.JRadioButton();
        entryDateLbl9 = new javax.swing.JLabel();
        entryDateLbl30 = new javax.swing.JLabel();
        hiv2Lote = new javax.swing.JTextField();
        entryDateLbl35 = new javax.swing.JLabel();
        hiv2Validade = new javax.swing.JTextField();
        hiv2Reagente = new javax.swing.JRadioButton();
        transfNoRB29 = new javax.swing.JRadioButton();
        hiv2NaoRealizado = new javax.swing.JRadioButton();
        entryDateLbl10 = new javax.swing.JLabel();
        entryDateLbl36 = new javax.swing.JLabel();
        sifilisLote = new javax.swing.JTextField();
        entryDateLbl37 = new javax.swing.JLabel();
        sifilisValidade = new javax.swing.JTextField();
        sifilisReagente = new javax.swing.JRadioButton();
        transfNoRB31 = new javax.swing.JRadioButton();
        sifilisNaoRealizado = new javax.swing.JRadioButton();
        entryDateLbl11 = new javax.swing.JLabel();
        entryDateLbl38 = new javax.swing.JLabel();
        hepatiteBLote = new javax.swing.JTextField();
        entryDateLbl39 = new javax.swing.JLabel();
        hepatiteBValidade = new javax.swing.JTextField();
        hepatiteBReagente = new javax.swing.JRadioButton();
        transfNoRB33 = new javax.swing.JRadioButton();
        hepatiteBNaoRealizado = new javax.swing.JRadioButton();
        entryDateLbl15 = new javax.swing.JLabel();
        transfYesRB24 = new javax.swing.JRadioButton();
        coletaEscarroSim = new javax.swing.JRadioButton();
        entryDateLbl16 = new javax.swing.JLabel();
        entryDateLbl17 = new javax.swing.JLabel();
        transfYesRB5 = new javax.swing.JRadioButton();
        queixasTxt = new javax.swing.JTextField();
        entryDateLbl12 = new javax.swing.JLabel();
        entryDateLbl18 = new javax.swing.JLabel();
        entryDateLbl40 = new javax.swing.JLabel();
        transfNoRB7 = new javax.swing.JRadioButton();
        hepatiteCLote = new javax.swing.JTextField();
        condutaQueixaTxt = new javax.swing.JTextField();
        entryDateLbl41 = new javax.swing.JLabel();
        hepatiteCValidade = new javax.swing.JTextField();
        hepatiteCReagente = new javax.swing.JRadioButton();
        transfNoRB35 = new javax.swing.JRadioButton();
        hepatiteCNaoRealizado = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        covidLote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        entryDateLbl42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl42.setText("Validade:");

        entryDateLbl44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl44.setText("Apresenta alguma queixa odontológica?");

        entryDateLbl45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl45.setText("Conduta:");

        transfYesRB6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfYesRB6.setText("Não");
        transfYesRB6.setToolTipText("");
        transfYesRB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfYesRB6ActionPerformed(evt);
            }
        });

        queixaOdontologica.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        queixaOdontologica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queixaOdontologicaActionPerformed(evt);
            }
        });

        entryDateLbl46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl46.setText("Qual(is):");

        transfNoRB8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfNoRB8.setText("Sim");
        transfNoRB8.setToolTipText("");
        transfNoRB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfNoRB8ActionPerformed(evt);
            }
        });

        condutaDentista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        condutaDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condutaDentistaActionPerformed(evt);
            }
        });

        covidValidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        entryDateLbl47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl47.setText("Necessita de avaliação imediata de dentista:");

        covidReagente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        covidReagente.setText("R");
        covidReagente.setToolTipText("");
        covidReagente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                covidReagenteActionPerformed(evt);
            }
        });

        transfYesRB25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfYesRB25.setText("Não");
        transfYesRB25.setToolTipText("");
        transfYesRB25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfYesRB25ActionPerformed(evt);
            }
        });

        transfNoRB37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfNoRB37.setText("NR");
        transfNoRB37.setToolTipText("");
        transfNoRB37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfNoRB37ActionPerformed(evt);
            }
        });

        avaliacaoDentista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        avaliacaoDentista.setText("Sim");
        avaliacaoDentista.setToolTipText("");
        avaliacaoDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaliacaoDentistaActionPerformed(evt);
            }
        });

        covidNaoRealizado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        covidNaoRealizado.setText("Não realizado");
        covidNaoRealizado.setToolTipText("");
        covidNaoRealizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                covidNaoRealizadoActionPerformed(evt);
            }
        });

        entryDateLbl13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl13.setText("Covid:");

        entryDateLbl43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl43.setText("Lote:");

        entryDateLbl14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl14.setText("Teste de gravidez:");

        transfYesRB23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfYesRB23.setText("Negativo");
        transfYesRB23.setToolTipText("");
        transfYesRB23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfYesRB23ActionPerformed(evt);
            }
        });

        testeGravidezPositivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        testeGravidezPositivo.setText("Positivo");
        testeGravidezPositivo.setToolTipText("");
        testeGravidezPositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testeGravidezPositivoActionPerformed(evt);
            }
        });

        testeGravidezNaoRealizado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        testeGravidezNaoRealizado.setText("Não realizado");
        testeGravidezNaoRealizado.setToolTipText("");
        testeGravidezNaoRealizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testeGravidezNaoRealizadoActionPerformed(evt);
            }
        });

        entryDateLbl48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl48.setText("Encaminhamentos Finais:");

        encaminhamentosFinais.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        encaminhamentosFinais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encaminhamentosFinaisActionPerformed(evt);
            }
        });

        nextPageB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nextPageB.setText("Próxima");
        nextPageB.setToolTipText("");
        nextPageB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageBActionPerformed(evt);
            }
        });

        entryDateLbl6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl6.setText("HIV (1/2):");

        entryDateLbl25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl25.setText("Lote:");

        hivLote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        entryDateLbl26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl26.setText("Validade:");

        hivValidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        hivReagente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hivReagente.setText("R");
        hivReagente.setToolTipText("");
        hivReagente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hivReagenteActionPerformed(evt);
            }
        });

        transfNoRB25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfNoRB25.setText("NR");
        transfNoRB25.setToolTipText("");
        transfNoRB25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfNoRB25ActionPerformed(evt);
            }
        });

        hivNaoRealizado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hivNaoRealizado.setText("Não realizado");
        hivNaoRealizado.setToolTipText("");
        hivNaoRealizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hivNaoRealizadoActionPerformed(evt);
            }
        });

        entryDateLbl9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl9.setText("HIV (2/2):");

        entryDateLbl30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl30.setText("Lote:");

        hiv2Lote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        entryDateLbl35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl35.setText("Validade:");

        hiv2Validade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        hiv2Reagente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hiv2Reagente.setText("R");
        hiv2Reagente.setToolTipText("");
        hiv2Reagente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hiv2ReagenteActionPerformed(evt);
            }
        });

        transfNoRB29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfNoRB29.setText("NR");
        transfNoRB29.setToolTipText("");
        transfNoRB29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfNoRB29ActionPerformed(evt);
            }
        });

        hiv2NaoRealizado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hiv2NaoRealizado.setText("Não realizado");
        hiv2NaoRealizado.setToolTipText("");
        hiv2NaoRealizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hiv2NaoRealizadoActionPerformed(evt);
            }
        });

        entryDateLbl10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl10.setText("Sífilis:");

        entryDateLbl36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl36.setText("Lote:");

        sifilisLote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        entryDateLbl37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl37.setText("Validade:");

        sifilisValidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        sifilisReagente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sifilisReagente.setText("R");
        sifilisReagente.setToolTipText("");
        sifilisReagente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifilisReagenteActionPerformed(evt);
            }
        });

        transfNoRB31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfNoRB31.setText("NR");
        transfNoRB31.setToolTipText("");
        transfNoRB31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfNoRB31ActionPerformed(evt);
            }
        });

        sifilisNaoRealizado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sifilisNaoRealizado.setText("Não realizado");
        sifilisNaoRealizado.setToolTipText("");
        sifilisNaoRealizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifilisNaoRealizadoActionPerformed(evt);
            }
        });

        entryDateLbl11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl11.setText("Hepatite B:");

        entryDateLbl38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl38.setText("Lote:");

        hepatiteBLote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        entryDateLbl39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl39.setText("Validade:");

        hepatiteBValidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        hepatiteBReagente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hepatiteBReagente.setText("R");
        hepatiteBReagente.setToolTipText("");
        hepatiteBReagente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hepatiteBReagenteActionPerformed(evt);
            }
        });

        transfNoRB33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfNoRB33.setText("NR");
        transfNoRB33.setToolTipText("");
        transfNoRB33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfNoRB33ActionPerformed(evt);
            }
        });

        hepatiteBNaoRealizado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hepatiteBNaoRealizado.setText("Não realizado");
        hepatiteBNaoRealizado.setToolTipText("");
        hepatiteBNaoRealizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hepatiteBNaoRealizadoActionPerformed(evt);
            }
        });

        entryDateLbl15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl15.setText("Coleta de escarro:");

        transfYesRB24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfYesRB24.setText("Não");
        transfYesRB24.setToolTipText("");
        transfYesRB24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfYesRB24ActionPerformed(evt);
            }
        });

        coletaEscarroSim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        coletaEscarroSim.setText("Sim");
        coletaEscarroSim.setToolTipText("");
        coletaEscarroSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coletaEscarroSimActionPerformed(evt);
            }
        });

        entryDateLbl16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl16.setText("Apresenta alguma queixa?");

        entryDateLbl17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl17.setText("Conduta:");

        transfYesRB5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfYesRB5.setText("Não");
        transfYesRB5.setToolTipText("");
        transfYesRB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfYesRB5ActionPerformed(evt);
            }
        });

        queixasTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        queixasTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queixasTxtActionPerformed(evt);
            }
        });

        entryDateLbl12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl12.setText("Hepatite C:");

        entryDateLbl18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl18.setText("Qual(is):");

        entryDateLbl40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl40.setText("Lote:");

        transfNoRB7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfNoRB7.setText("Sim");
        transfNoRB7.setToolTipText("");
        transfNoRB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfNoRB7ActionPerformed(evt);
            }
        });

        hepatiteCLote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        condutaQueixaTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        condutaQueixaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condutaQueixaTxtActionPerformed(evt);
            }
        });

        entryDateLbl41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entryDateLbl41.setText("Validade:");

        hepatiteCValidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        hepatiteCReagente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hepatiteCReagente.setText("R");
        hepatiteCReagente.setToolTipText("");
        hepatiteCReagente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hepatiteCReagenteActionPerformed(evt);
            }
        });

        transfNoRB35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfNoRB35.setText("NR");
        transfNoRB35.setToolTipText("");
        transfNoRB35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfNoRB35ActionPerformed(evt);
            }
        });

        hepatiteCNaoRealizado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hepatiteCNaoRealizado.setText("Não realizado");
        hepatiteCNaoRealizado.setToolTipText("");
        hepatiteCNaoRealizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hepatiteCNaoRealizadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(entryDateLbl6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entryDateLbl10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(entryDateLbl36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sifilisLote, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(entryDateLbl37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sifilisValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sifilisReagente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(transfNoRB31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sifilisNaoRealizado))
                                    .addComponent(entryDateLbl11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(entryDateLbl38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hepatiteBLote, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(entryDateLbl39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(hepatiteBValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(hepatiteBReagente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(transfNoRB33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hepatiteBNaoRealizado)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(entryDateLbl12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(entryDateLbl40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hepatiteCLote, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(entryDateLbl41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(hepatiteCValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(hepatiteCReagente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(transfNoRB35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hepatiteCNaoRealizado)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(entryDateLbl13, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(entryDateLbl43)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(covidLote, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(entryDateLbl42)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(covidValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(covidReagente)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(transfNoRB37)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(covidNaoRealizado)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(entryDateLbl14)
                                                .addGap(18, 18, 18)
                                                .addComponent(transfYesRB23)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(testeGravidezPositivo))
                                            .addComponent(entryDateLbl16)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(entryDateLbl15)
                                                .addGap(18, 18, 18)
                                                .addComponent(transfYesRB24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(coletaEscarroSim)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(testeGravidezNaoRealizado))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(entryDateLbl44)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(entryDateLbl47)
                                                .addGap(18, 18, 18)
                                                .addComponent(transfYesRB25)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(avaliacaoDentista))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(nextPageB)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(entryDateLbl45)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(condutaDentista))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(transfYesRB6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(transfNoRB8)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(entryDateLbl46)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(queixaOdontologica, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(entryDateLbl48, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(encaminhamentosFinais, javax.swing.GroupLayout.Alignment.LEADING))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(entryDateLbl17)
                                                .addGap(18, 18, 18)
                                                .addComponent(condutaQueixaTxt))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(transfYesRB5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(transfNoRB7)
                                                .addGap(18, 18, 18)
                                                .addComponent(entryDateLbl18)
                                                .addGap(18, 18, 18)
                                                .addComponent(queixasTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(entryDateLbl25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hivLote, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(entryDateLbl26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hivValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hivReagente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(transfNoRB25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hivNaoRealizado))
                            .addComponent(entryDateLbl9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(entryDateLbl30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hiv2Lote, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(entryDateLbl35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hiv2Validade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hiv2Reagente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(transfNoRB29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hiv2NaoRealizado)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(entryDateLbl6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLbl25)
                    .addComponent(hivLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryDateLbl26)
                    .addComponent(hivValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hivReagente)
                    .addComponent(transfNoRB25)
                    .addComponent(hivNaoRealizado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entryDateLbl9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLbl30)
                    .addComponent(hiv2Lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryDateLbl35)
                    .addComponent(hiv2Validade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hiv2Reagente)
                    .addComponent(transfNoRB29)
                    .addComponent(hiv2NaoRealizado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entryDateLbl10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLbl36)
                    .addComponent(sifilisLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryDateLbl37)
                    .addComponent(sifilisValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifilisReagente)
                    .addComponent(transfNoRB31)
                    .addComponent(sifilisNaoRealizado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entryDateLbl11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLbl38)
                    .addComponent(hepatiteBLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryDateLbl39)
                    .addComponent(hepatiteBValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hepatiteBReagente)
                    .addComponent(transfNoRB33)
                    .addComponent(hepatiteBNaoRealizado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entryDateLbl12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLbl40)
                    .addComponent(hepatiteCLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryDateLbl41)
                    .addComponent(hepatiteCValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hepatiteCReagente)
                    .addComponent(transfNoRB35)
                    .addComponent(hepatiteCNaoRealizado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entryDateLbl13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLbl43)
                    .addComponent(covidLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryDateLbl42)
                    .addComponent(covidValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(covidReagente)
                    .addComponent(transfNoRB37)
                    .addComponent(covidNaoRealizado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLbl14)
                    .addComponent(transfYesRB23)
                    .addComponent(testeGravidezPositivo)
                    .addComponent(testeGravidezNaoRealizado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLbl15)
                    .addComponent(transfYesRB24)
                    .addComponent(coletaEscarroSim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entryDateLbl16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transfYesRB5)
                    .addComponent(transfNoRB7)
                    .addComponent(entryDateLbl18)
                    .addComponent(queixasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLbl17)
                    .addComponent(condutaQueixaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entryDateLbl44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transfYesRB6)
                    .addComponent(transfNoRB8)
                    .addComponent(entryDateLbl46)
                    .addComponent(queixaOdontologica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLbl47)
                    .addComponent(transfYesRB25)
                    .addComponent(avaliacaoDentista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLbl45)
                    .addComponent(condutaDentista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entryDateLbl48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encaminhamentosFinais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nextPageB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transfYesRB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfYesRB6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfYesRB6ActionPerformed

    private void queixaOdontologicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queixaOdontologicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queixaOdontologicaActionPerformed

    private void transfNoRB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfNoRB8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfNoRB8ActionPerformed

    private void condutaDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condutaDentistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_condutaDentistaActionPerformed

    private void covidReagenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_covidReagenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_covidReagenteActionPerformed

    private void transfYesRB25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfYesRB25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfYesRB25ActionPerformed

    private void transfNoRB37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfNoRB37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfNoRB37ActionPerformed

    private void avaliacaoDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaliacaoDentistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avaliacaoDentistaActionPerformed

    private void covidNaoRealizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_covidNaoRealizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_covidNaoRealizadoActionPerformed

    private void transfYesRB23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfYesRB23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfYesRB23ActionPerformed

    private void testeGravidezPositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testeGravidezPositivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testeGravidezPositivoActionPerformed

    private void testeGravidezNaoRealizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testeGravidezNaoRealizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testeGravidezNaoRealizadoActionPerformed

    private void encaminhamentosFinaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encaminhamentosFinaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encaminhamentosFinaisActionPerformed

    private void nextPageBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextPageBActionPerformed

    private void hivReagenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hivReagenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hivReagenteActionPerformed

    private void transfNoRB25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfNoRB25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfNoRB25ActionPerformed

    private void hivNaoRealizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hivNaoRealizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hivNaoRealizadoActionPerformed

    private void hiv2ReagenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hiv2ReagenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hiv2ReagenteActionPerformed

    private void transfNoRB29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfNoRB29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfNoRB29ActionPerformed

    private void hiv2NaoRealizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hiv2NaoRealizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hiv2NaoRealizadoActionPerformed

    private void sifilisReagenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifilisReagenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sifilisReagenteActionPerformed

    private void transfNoRB31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfNoRB31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfNoRB31ActionPerformed

    private void sifilisNaoRealizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifilisNaoRealizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sifilisNaoRealizadoActionPerformed

    private void hepatiteBReagenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hepatiteBReagenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hepatiteBReagenteActionPerformed

    private void transfNoRB33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfNoRB33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfNoRB33ActionPerformed

    private void hepatiteBNaoRealizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hepatiteBNaoRealizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hepatiteBNaoRealizadoActionPerformed

    private void transfYesRB24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfYesRB24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfYesRB24ActionPerformed

    private void coletaEscarroSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coletaEscarroSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coletaEscarroSimActionPerformed

    private void transfYesRB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfYesRB5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfYesRB5ActionPerformed

    private void queixasTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queixasTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queixasTxtActionPerformed

    private void transfNoRB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfNoRB7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfNoRB7ActionPerformed

    private void condutaQueixaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condutaQueixaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_condutaQueixaTxtActionPerformed

    private void hepatiteCReagenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hepatiteCReagenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hepatiteCReagenteActionPerformed

    private void transfNoRB35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfNoRB35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfNoRB35ActionPerformed

    private void hepatiteCNaoRealizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hepatiteCNaoRealizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hepatiteCNaoRealizadoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroTestesRapidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTestesRapidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTestesRapidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTestesRapidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton avaliacaoDentista;
    private javax.swing.JRadioButton coletaEscarroSim;
    private javax.swing.JTextField condutaDentista;
    private javax.swing.JTextField condutaQueixaTxt;
    private javax.swing.JTextField covidLote;
    private javax.swing.JRadioButton covidNaoRealizado;
    private javax.swing.JRadioButton covidReagente;
    private javax.swing.JTextField covidValidade;
    private javax.swing.JTextField encaminhamentosFinais;
    private javax.swing.JLabel entryDateLbl10;
    private javax.swing.JLabel entryDateLbl11;
    private javax.swing.JLabel entryDateLbl12;
    private javax.swing.JLabel entryDateLbl13;
    private javax.swing.JLabel entryDateLbl14;
    private javax.swing.JLabel entryDateLbl15;
    private javax.swing.JLabel entryDateLbl16;
    private javax.swing.JLabel entryDateLbl17;
    private javax.swing.JLabel entryDateLbl18;
    private javax.swing.JLabel entryDateLbl25;
    private javax.swing.JLabel entryDateLbl26;
    private javax.swing.JLabel entryDateLbl30;
    private javax.swing.JLabel entryDateLbl35;
    private javax.swing.JLabel entryDateLbl36;
    private javax.swing.JLabel entryDateLbl37;
    private javax.swing.JLabel entryDateLbl38;
    private javax.swing.JLabel entryDateLbl39;
    private javax.swing.JLabel entryDateLbl40;
    private javax.swing.JLabel entryDateLbl41;
    private javax.swing.JLabel entryDateLbl42;
    private javax.swing.JLabel entryDateLbl43;
    private javax.swing.JLabel entryDateLbl44;
    private javax.swing.JLabel entryDateLbl45;
    private javax.swing.JLabel entryDateLbl46;
    private javax.swing.JLabel entryDateLbl47;
    private javax.swing.JLabel entryDateLbl48;
    private javax.swing.JLabel entryDateLbl6;
    private javax.swing.JLabel entryDateLbl9;
    private javax.swing.JTextField hepatiteBLote;
    private javax.swing.JRadioButton hepatiteBNaoRealizado;
    private javax.swing.JRadioButton hepatiteBReagente;
    private javax.swing.JTextField hepatiteBValidade;
    private javax.swing.JTextField hepatiteCLote;
    private javax.swing.JRadioButton hepatiteCNaoRealizado;
    private javax.swing.JRadioButton hepatiteCReagente;
    private javax.swing.JTextField hepatiteCValidade;
    private javax.swing.JTextField hiv2Lote;
    private javax.swing.JRadioButton hiv2NaoRealizado;
    private javax.swing.JRadioButton hiv2Reagente;
    private javax.swing.JTextField hiv2Validade;
    private javax.swing.JTextField hivLote;
    private javax.swing.JRadioButton hivNaoRealizado;
    private javax.swing.JRadioButton hivReagente;
    private javax.swing.JTextField hivValidade;
    private javax.swing.JButton nextPageB;
    private javax.swing.JTextField queixaOdontologica;
    private javax.swing.JTextField queixasTxt;
    private javax.swing.JTextField sifilisLote;
    private javax.swing.JRadioButton sifilisNaoRealizado;
    private javax.swing.JRadioButton sifilisReagente;
    private javax.swing.JTextField sifilisValidade;
    private javax.swing.JRadioButton testeGravidezNaoRealizado;
    private javax.swing.JRadioButton testeGravidezPositivo;
    private javax.swing.JRadioButton transfNoRB25;
    private javax.swing.JRadioButton transfNoRB29;
    private javax.swing.JRadioButton transfNoRB31;
    private javax.swing.JRadioButton transfNoRB33;
    private javax.swing.JRadioButton transfNoRB35;
    private javax.swing.JRadioButton transfNoRB37;
    private javax.swing.JRadioButton transfNoRB7;
    private javax.swing.JRadioButton transfNoRB8;
    private javax.swing.JRadioButton transfYesRB23;
    private javax.swing.JRadioButton transfYesRB24;
    private javax.swing.JRadioButton transfYesRB25;
    private javax.swing.JRadioButton transfYesRB5;
    private javax.swing.JRadioButton transfYesRB6;
    // End of variables declaration//GEN-END:variables
}
