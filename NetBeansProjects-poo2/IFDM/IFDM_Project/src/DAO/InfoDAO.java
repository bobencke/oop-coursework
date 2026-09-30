package DAO;

import connection.Connection_Database;
import ifdm_project.Info;
import java.sql.*;
import java.util.*;

public class InfoDAO {

    public void salvar(Info info) {
        String sql = "INSERT INTO info (ano, ranking_estado, ranking_nacional, valor, cidade_id, tipo_id) VALUES (?, ?, ?, ?, ?, ?)";
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = new Connection_Database().getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, info.getAno());
            stmt.setInt(2, info.getRankingEstado());
            stmt.setInt(3, info.getRankingNacional());
            stmt.setDouble(4, info.getValor());
            stmt.setInt(5, info.getCidade().getId());
            stmt.setInt(6, info.getTipo().getId());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Connection_Database.closeConnection(con, stmt);
        }
    }

    public Map<String, Info> buscarUltimosIndicadoresDaCidade(String cidade, String siglaUF) {
        Map<String, Info> mapa = new HashMap<>();
        String sql = """
            SELECT i.*, t.nome AS tipo_nome
              FROM info i
              JOIN tipo t ON i.tipo_id = t.id
              JOIN cidade c ON i.cidade_id = c.id
              JOIN estado e ON c.estado_id = e.id
             WHERE c.nome = ? 
               AND e.sigla = ?
               AND i.ano = (
                    SELECT MAX(ano) 
                      FROM info 
                      JOIN cidade c2 ON info.cidade_id = c2.id
                      JOIN estado e2 ON c2.estado_id = e2.id
                     WHERE c2.nome = ? 
                       AND e2.sigla = ?
                )
        """;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = new Connection_Database().getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cidade);
            stmt.setString(2, siglaUF);
            stmt.setString(3, cidade);
            stmt.setString(4, siglaUF);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Info info = new Info(
                    rs.getInt("ano"),
                    rs.getInt("ranking_estado"),
                    rs.getInt("ranking_nacional"),
                    rs.getDouble("valor"),
                    null,
                    null
                );
                mapa.put(rs.getString("tipo_nome"), info);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Connection_Database.closeConnection(con, stmt, rs);
        }
        return mapa;
    }

    public Map<String, Double> calcularMediaIndicadoresPorEstado(String siglaUF) {
        Map<String, Double> medias = new HashMap<>();
        String sql = """
            SELECT t.nome AS tipo_nome, AVG(i.valor) AS media
              FROM info i
              JOIN tipo t ON i.tipo_id = t.id
              JOIN cidade c ON i.cidade_id = c.id
              JOIN estado e ON c.estado_id = e.id
             WHERE e.sigla = ?
               AND i.ano = (SELECT MAX(ano) FROM info)
             GROUP BY t.nome
        """;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = new Connection_Database().getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, siglaUF);
            rs = stmt.executeQuery();

            while (rs.next()) {
                medias.put(rs.getString("tipo_nome"), rs.getDouble("media"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Connection_Database.closeConnection(con, stmt, rs);
        }
        return medias;
    }
}