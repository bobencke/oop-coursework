package DAO;

import connection.Connection_Database;
import ifdm_project.Cidade;
import ifdm_project.Estado;
import java.sql.*;
import java.util.*;

public class CidadeDAO {

    public void salvar(Cidade cidade) {
        String sql = "INSERT INTO cidade (nome, cod_ibge, estado_id) VALUES (?, ?, ?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = new Connection_Database().getConnection();
            stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, cidade.getNome());
            stmt.setInt(2, cidade.getCodIbge());
            stmt.setInt(3, cidade.getEstado().getId());
            stmt.executeUpdate();
            rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                cidade.setId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Connection_Database.closeConnection(con, stmt, rs);
        }
    }

    public Cidade buscarPorNomeECod(String nome, int codIBGE) {
        String sql = "SELECT * FROM cidade WHERE nome = ? AND cod_ibge = ?";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = new Connection_Database().getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setInt(2, codIBGE);
            rs = stmt.executeQuery();
            if (rs.next()) {
                Cidade cidade = new Cidade();
                cidade.setId(rs.getInt("id"));
                cidade.setNome(rs.getString("nome"));
                cidade.setCodIbge(rs.getInt("cod_ibge"));
                Estado estado = new Estado();
                estado.setId(rs.getInt("estado_id"));
                cidade.setEstado(estado);
                return cidade;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Connection_Database.closeConnection(con, stmt, rs);
        }
        return null;
    }

    public int inserirOuBuscar(Cidade cidade) {
        Cidade existente = buscarPorNomeECod(cidade.getNome(), cidade.getCodIbge());
        if (existente != null) {
            return existente.getId();
        }
        salvar(cidade);
        return cidade.getId();
    }

    public List<String> buscarNomesPorUF(String siglaUF) {
        List<String> nomes = new ArrayList<>();
        String sql = "SELECT c.nome FROM cidade c JOIN estado e ON c.estado_id = e.id WHERE e.sigla = ? ORDER BY c.nome";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = new Connection_Database().getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, siglaUF);
            rs = stmt.executeQuery();
            while (rs.next()) {
                nomes.add(rs.getString("nome"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Connection_Database.closeConnection(con, stmt, rs);
        }
        return nomes;
    }
}
