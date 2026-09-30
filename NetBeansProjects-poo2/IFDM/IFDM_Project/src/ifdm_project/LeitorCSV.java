package ifdm_project;

import DAO.EstadoDAO;
import DAO.CidadeDAO;
import DAO.TipoDAO;
import DAO.InfoDAO;

import ifdm_project.Estado;
import ifdm_project.Cidade;
import ifdm_project.Tipo;
import ifdm_project.Info;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.util.*;
import javax.swing.*;

public class LeitorCSV {

    private static final int[] ANOS = {
        2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023
    };

    public void importarCSV(List<File> arquivos) {
        EstadoDAO estadoDAO = new EstadoDAO();
        CidadeDAO cidadeDAO = new CidadeDAO();
        TipoDAO tipoDAO = new TipoDAO();
        InfoDAO infoDAO = new InfoDAO();

        for (File arquivo : arquivos) {
            String tipoNome = obterTipoPorNomeDoArquivo(arquivo.getName());
            Tipo tipo = new Tipo(tipoNome);
            int tipoId = tipoDAO.inserirOuBuscar(tipo);
            tipo.setId(tipoId);

            try (BufferedReader br = new BufferedReader(
                     new InputStreamReader(
                         new FileInputStream(arquivo),
                         Charset.forName("ISO-8859-1")
                     )
                 )) {
                br.readLine();

                String linha;
                while ((linha = br.readLine()) != null) {
                    String[] dados = linha.split(";");
                    if (dados.length < 3 + ANOS.length * 3) {
                        continue;
                    }

                    int codIbge;
                    try {
                        codIbge = Integer.parseInt(dados[0].trim());
                    } catch (NumberFormatException ex) {
                        continue;
                    }
                    String siglaEstado = dados[1].trim();
                    String nomeCidade   = dados[2].trim();

                    Estado estado = new Estado("Desconhecido", siglaEstado);
                    int estadoId = estadoDAO.inserirOuBuscar(estado);
                    estado.setId(estadoId);

                    Cidade cidade = new Cidade(nomeCidade, codIbge, estado);
                    int cidadeId = cidadeDAO.inserirOuBuscar(cidade);
                    cidade.setId(cidadeId);

                    for (int i = 0; i < ANOS.length; i++) {
                        int ano       = ANOS[i];
                        int baseIndex = 3 + i * 3;

                        String rawRankingEst = dados[baseIndex].trim();
                        rawRankingEst = rawRankingEst
                            .replace("º", "")
                            .replace(".", "");
                        int rankingEstadual;
                        try {
                            rankingEstadual = Integer.parseInt(rawRankingEst);
                        } catch (NumberFormatException ex) {
                            continue;
                        }

                        String rawRankingNac = dados[baseIndex + 1].trim();
                        rawRankingNac = rawRankingNac
                            .replace("º", "")
                            .replace(".", "");
                        int rankingNacional;
                        try {
                            rankingNacional = Integer.parseInt(rawRankingNac);
                        } catch (NumberFormatException ex) {
                            continue;
                        }

                        String rawValor = dados[baseIndex + 2].trim().replace(",", ".");
                        double valorIFDM;
                        try {
                            valorIFDM = Double.parseDouble(rawValor);
                        } catch (NumberFormatException ex) {
                            continue;
                        }

                        Info info = new Info(
                            ano,
                            rankingEstadual,
                            rankingNacional,
                            valorIFDM,
                            cidade,
                            tipo
                        );
                        infoDAO.salvar(info);

                    }
                }

            } catch (IOException e) {
                JOptionPane.showMessageDialog(
                    null,
                    "Erro ao importar o arquivo: " + arquivo.getName() + "\n" + e.getMessage(),
                    "Erro de Importação",
                    JOptionPane.ERROR_MESSAGE
                );
                e.printStackTrace();
            }
        }

        JOptionPane.showMessageDialog(
            null,
            "Importação de todos os arquivos concluída com sucesso!",
            "Importação Finalizada",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    private String obterTipoPorNomeDoArquivo(String nomeArquivo) {
        String lower = nomeArquivo.toLowerCase();
        if (lower.contains("educacao")) return "Educação";
        if (lower.contains("emprego"))   return "Emprego";
        if (lower.contains("saude"))     return "Saúde";
        if (lower.contains("geral"))     return "Geral";
        return "Desconhecido";
    }
}