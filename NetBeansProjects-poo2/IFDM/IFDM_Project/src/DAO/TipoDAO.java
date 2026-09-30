package DAO;

import connection.Connection_Database;
import ifdm_project.Tipo;
import java.sql.*;

public class TipoDAO {

    public Tipo buscarPorNome(String nome) {
        String sql = "SELECT * FROM tipo WHERE nome = ?";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = new Connection_Database().getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return new Tipo(rs.getInt("id"), rs.getString("nome"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Connection_Database.closeConnection(con, stmt, rs);
        }
        return null;
    }

    public int inserirOuBuscar(Tipo tipo) {
        Tipo existente = buscarPorNome(tipo.getNome());
        if (existente != null) {
            return existente.getId();
        }

        String sql = "INSERT INTO tipo (nome) VALUES (?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = new Connection_Database().getConnection();
            stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, tipo.getNome());
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
}