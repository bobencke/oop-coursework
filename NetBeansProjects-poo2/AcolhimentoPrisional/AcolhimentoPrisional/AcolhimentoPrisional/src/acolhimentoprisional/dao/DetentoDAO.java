package acolhimentoprisional.dao;

import acolhimentoprisional.model.Detento;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DetentoDAO {

        
    public void inserir(Detento d) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO detento (" +
            "responsavel_atendimento, data_entrada, data_atendimento, procedencia_transferencia, nome_completo, " +
            "nome_social, data_nascimento, idade, cpf, nacionalidade, pais_origem, nome_mae, estado_civil, etnia, " +
            "sexo_biologico, identidade_de_genero, orientacao_sexual, escolaridade, profissao, beneficio_familiar, " +
            "quant_filhos, quant_dependentes, encaminhamento_neeja, conversa_assit_social, deficiencia, " +
            "intolerancia_alimentar, cirurgias, condicoes_cronicas, doencas_infecciosas, doenca_de_pele, " +
            "autoimune, hepatite_b, hepatite_c, medicamento_continuo, tipo_sanguineo, idade_gestacional, " +
            "metodo_contraceptivo, exame_preventivo, continuidade_contraceptivo, consulta_exame_preventivo, " +
            "encaminhamento_pre_natal, ano_exame_cancer_prostata, familiar_historico_cancer_prostata, vasectomia, " +
            "parceira_gestante, participacao_pre_natal, encaminhamento_vasectomia, encaminhamento_pre_natal_parceira, " +
            "vinculo_caps, transtornos_mentais, acompanhamento_saude_mental, uso_drogas, realizou_tratamento_para_uso, " +
            "deseja_realizar_tratamento_para_uso, consulta_psicologia, consulta_psiquiatria, encaminhamento_renovacao_receita, " +
            "encaminhamento_grupo_de_apoio, recebeu_vacina_covid, recebeu_vacina_influenza, recebeu_vacina_tetano, " +
            "recebeu_vacina_hepatite_b, vacinas_a_ofertar, copia_carteira_vacinacao, peso, altura, imc, pa, fc, sat, " +
            "temp, sintomas, data_sintomas, lesoes, conduta, teste_hiv1_2, teste_hiv2_2, teste_sifilis, teste_hepatite_b, " +
            "teste_hepatite_c, teste_covid, teste_gravidez, coleta_escarro, queixa, conduta_queixa, queixa_odontologica, " +
            "avaliacao_imediata_dentista, conduta_dentista, encaminhamentos_finais) VALUES (" +
            String.join(", ", Collections.nCopies(89, "?")) + ")";

        try {
            stmt = con.prepareStatement(sql);
            int idx = 1;
            stmt.setString(idx++, d.getResponsavelAtendimento());
            stmt.setString(idx++, d.getDataEntrada());
            stmt.setString(idx++, d.getDataAtendimento());
            stmt.setString(idx++, d.getProcedenciaTransferencia());
            stmt.setString(idx++, d.getNomeCompleto());
            stmt.setString(idx++, d.getNomeSocial());
            stmt.setString(idx++, d.getDataNascimento());
            stmt.setInt(idx++, d.getIdade());
            stmt.setString(idx++, d.getCpf());
            stmt.setString(idx++, d.getNacionalidade());
            stmt.setString(idx++, d.getPaisOrigem());
            stmt.setString(idx++, d.getNomeMae());
            stmt.setString(idx++, d.getEstadoCivil());
            stmt.setString(idx++, d.getEtnia());
            stmt.setString(idx++, d.getSexoBiologico());
            stmt.setString(idx++, d.getIdentidadeDeGenero());
            stmt.setString(idx++, d.getOrientacaoSexual());
            stmt.setString(idx++, d.getEscolaridade());
            stmt.setString(idx++, d.getProfissao());
            stmt.setString(idx++, d.getBeneficioFamiliar());
            stmt.setInt(idx++, d.getQuantFilhos());
            stmt.setInt(idx++, d.getQuantDependentes());
            stmt.setBoolean(idx++, d.isEncaminhamentoNEEJA());
            stmt.setBoolean(idx++, d.isConversaAssitSocial());
            stmt.setString(idx++, d.getDeficiencia());
            stmt.setString(idx++, d.getIntoleranciaAlimentar());
            stmt.setString(idx++, d.getCirurgias());
            stmt.setString(idx++, d.getCondicoesCronicas());
            stmt.setString(idx++, d.getDoencasInfecciosas());
            stmt.setString(idx++, d.getDoencaDePele());
            stmt.setString(idx++, d.getAutoimune());
            stmt.setString(idx++, d.getHepatiteB());
            stmt.setString(idx++, d.getHepatiteC());
            stmt.setString(idx++, d.getMedicamentoContinuo());
            stmt.setString(idx++, d.getTipoSanguineo());
            stmt.setInt(idx++, d.getIdadeGestacional());
            stmt.setString(idx++, d.getMetodoContraceptivo());
            stmt.setString(idx++, d.getExamePreventivo());
            stmt.setBoolean(idx++, d.isContinuidadeContraceptivo());
            stmt.setBoolean(idx++, d.isConsultaExamePreventivo());
            stmt.setBoolean(idx++, d.isEncaminhamentPreNatal());
            stmt.setInt(idx++, d.getAnoExameCancerProstata());
            stmt.setString(idx++, d.getFamiliarHistoricoCancerProstata());
            stmt.setBoolean(idx++, d.isVasectomia());
            stmt.setBoolean(idx++, d.isParceiraGestante());
            stmt.setBoolean(idx++, d.isParticipacaoPreNatal());
            stmt.setBoolean(idx++, d.isEncaminhamentoVasectomia());
            stmt.setBoolean(idx++, d.isEncaminhamentoPreNetalParceira());
            stmt.setString(idx++, d.getVinculoCAPS());
            stmt.setString(idx++, d.getTranstornosMentais());
            stmt.setString(idx++, d.getAcompanhamentoSaudeMental());
            stmt.setString(idx++, d.getUsoDrogas());
            stmt.setString(idx++, d.getRealizouTratamentoParaUso());
            stmt.setString(idx++, d.getDesejaRealizarTratamentoParaUso());
            stmt.setBoolean(idx++, d.isConsultaPsiciologia());
            stmt.setBoolean(idx++, d.isConsultaPsiquiatria());
            stmt.setBoolean(idx++, d.isEncaminhamentoRenovacaoReceita());
            stmt.setBoolean(idx++, d.isEncaminhamentoGrupoDeApoio());
            stmt.setBoolean(idx++, d.isRecebeuVacinaCovid());
            stmt.setBoolean(idx++, d.isRecebeuVacinaInfluenza());
            stmt.setBoolean(idx++, d.isRecebeuVacinaTetano());
            stmt.setBoolean(idx++, d.isRecebeuVacinaHepatiteB());
            stmt.setString(idx++, d.getVacinasAOfertar());
            stmt.setBoolean(idx++, d.isCopiaCarteiraVacinacao());
            stmt.setFloat(idx++, d.getPeso());
            stmt.setFloat(idx++, d.getAltura());
            stmt.setFloat(idx++, d.getImc());
            stmt.setString(idx++, d.getPa());
            stmt.setFloat(idx++, d.getFc());
            stmt.setFloat(idx++, d.getSat());
            stmt.setFloat(idx++, d.getTemp());
            stmt.setString(idx++, d.getSintomas());
            stmt.setString(idx++, d.getDataSintomas());
            stmt.setString(idx++, d.getLesoes());
            stmt.setString(idx++, d.getConduta());
            stmt.setString(idx++, d.getTesteHiv1_2());
            stmt.setString(idx++, d.getTesteHiv2_2());
            stmt.setString(idx++, d.getTesteSifilis());
            stmt.setString(idx++, d.getTesteHepatiteB());
            stmt.setString(idx++, d.getTesteHepatiteC());
            stmt.setString(idx++, d.getTesteCovid());
            stmt.setString(idx++, d.getTesteGravidez());
            stmt.setBoolean(idx++, d.isColetaEscarro());
            stmt.setString(idx++, d.getQueixa());
            stmt.setString(idx++, d.getCondutaQueixa());
            stmt.setString(idx++, d.getQueixaOdontologica());
            stmt.setBoolean(idx++, d.isAvaliacaoImediataDentista());
            stmt.setString(idx++, d.getCondutaDentista());
            stmt.setString(idx++, d.getEncaminhamentosFinais());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Detento> lerRegistros(String nomePesquisado){

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Detento> detentos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM detento where nome_completo LIKE '%" + nomePesquisado + "%'");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Detento detento = new Detento();
                
                int id = detento.getId();
                String nomeCompleto = detento.getNomeCompleto();
                String cpf = detento.getCpf();
                int idade = detento.getIdade();
                String nomeMae = detento.getNomeMae();
                
                detento.setId(rs.getInt("id"));
                detento.setNomeCompleto(rs.getString("nome_completo"));
                detento.setCpf(rs.getString("cpf"));
                detento.setIdade(rs.getInt("idade"));
                detento.setNomeMae(rs.getString("nome_mae"));
                
                detentos.add(detento);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível pesquisar: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return detentos;
        
    }
    
    public List<Detento> lerTodosRegistros(String nomePesquisado){

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Detento> detentos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM detento");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Detento detento = new Detento();
                
                int id = detento.getId();
                String nomeCompleto = detento.getNomeCompleto();
                String cpf = detento.getCpf();
                int idade = detento.getIdade();
                String nomeMae = detento.getNomeMae();
                
                detento.setId(rs.getInt("id"));
                detento.setNomeCompleto(rs.getString("nome_completo"));
                detento.setCpf(rs.getString("cpf"));
                detento.setIdade(rs.getInt("idade"));
                detento.setNomeMae(rs.getString("nome_mae"));
                
                detentos.add(detento);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível pesquisar: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return detentos;
        
    }
    
}
