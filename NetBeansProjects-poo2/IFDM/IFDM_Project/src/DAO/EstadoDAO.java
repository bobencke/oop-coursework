package DAO;

import connection.Connection_Database;
import ifdm_project.Estado;
import java.sql.*;
import java.util.*;

public class EstadoDAO {

    public List<Estado> listarEstados() {
        List<Estado> estados = new ArrayList<>();
        String sql = "SELECT * FROM estado ORDER BY nome";

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = new Connection_Database().getConnection();
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Estado estado = new Estado();
                estado.setId(rs.getInt("id"));
                estado.setNome(rs.getString("nome"));
                estado.setSigla(rs.getString("sigla"));
                estados.add(estado);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Connection_Database.closeConnection(con, stmt, rs);
        }
        return estados;
    }

    public Estado buscarPorSigla(String sigla) {
        String sql = "SELECT * FROM estado WHERE sigla = ?";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = new Connection_Database().getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, sigla);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return new Estado(rs.getInt("id"), rs.getString("nome"), rs.getString("sigla"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Connection_Database.closeConnection(con, stmt, rs);
        }
        return null;
    }

    public int inserirOuBuscar(Estado estado) {
        // Primeiro, tenta buscar pelo sigla
        Estado existente = buscarPorSigla(estado.getSigla());
        if (existente != null) {
            return existente.getId();
        }

        String sql = "INSERT INTO estado (nome, sigla) VALUES (?, ?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = new Connection_Database().getConnection();
            stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, estado.getNome());
            stmt.setString(2, estado.getSigla());
            stmt.executeUpdate();
            rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Connection_Database.closeConnection(con, stmt, rs);
        }
        return -1;
    }

    public List<String> buscarTodasSiglas() {
        List<String> siglas = new ArrayList<>();
        String sql = "SELECT DISTINCT sigla FROM estado ORDER BY sigla";

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = new Connection_Database().getConnection();
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                siglas.add(rs.getString("sigla"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Connection_Database.closeConnection(con, stmt, rs);
        }
        return siglas;
    }
}