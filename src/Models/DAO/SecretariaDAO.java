/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.DAO;

import Models.Secretaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author marcu
 */
public class SecretariaDAO {
    Connection conn;
    
    
    public ResultSet loginSecretaria(Secretaria objSecretaria){
        
        conn = new BancoDAO().conectaBD();
        
        try {
           String sql = "SELECT * FROM SECRETARIA WHERE NOME_SECRETARIA = ? AND SENHA = ? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objSecretaria.getNome());
            pstm.setString(2, objSecretaria.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "SecretariaDAO " + erro);
            return null;
        }
    }
}
