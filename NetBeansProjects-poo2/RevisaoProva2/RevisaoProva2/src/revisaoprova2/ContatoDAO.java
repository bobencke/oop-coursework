package revisaoprova2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ContatoDAO {
    
    public void create(Contato c){
        
        Connection con = ConnectionDB.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO agenda (nome, telefone, cidade, uf) VALUES(?, ?, ?, ?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getTelefone());
            stmt.setString(3, c.getCidade());
            stmt.setString(4, c.getUf().toString());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally{
            ConnectionDB.closeConnection(con, stmt);
        }
        
    }
    
    public List<Contato> getContatos(String estado){
    
        Connection con = ConnectionDB.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Contato> contatos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM agenda where uf = '" + estado + "'");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Contato contato = new Contato();
                contato.setNome(rs.getString("nome"));
                contato.setTelefone(rs.getString("telefone"));
                contato.setCidade(rs.getString("cidade"));
                //String ufstring = rs.getString("uf");
                //contato.setUf(UF.valueOf(ufstring));
                
                contatos.add(contato);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível pesquisar: " + ex);
        } finally{
            ConnectionDB.closeConnection(con, stmt, rs);
        }
        
        return contatos;
    
    }
    
}
