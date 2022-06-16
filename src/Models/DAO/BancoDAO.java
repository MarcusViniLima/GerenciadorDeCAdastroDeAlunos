/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author marcu
 */
public class BancoDAO {
    
    public Connection conectaBD(){
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/escola?user=root&passaword=1234";
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"BancoDAO"+ erro.getMessage());
        }
        return conn;
    }
    
}
