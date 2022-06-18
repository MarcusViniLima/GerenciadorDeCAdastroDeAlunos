/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Controller.Helper.LoginHelper;
import Models.Secretaria;
import View.Login;
import Models.DAO.SecretariaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author marcu
 */
public class LoginController {
    
    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        //pegar usuario da view
        //pesquisar usuario do banco
        try {
            Secretaria secretaria = helper.obterModelo();
        SecretariaDAO secretariaDAO = new SecretariaDAO();
        ResultSet rsSecretariaDao = secretariaDAO.loginSecretaria(secretaria);
        
        if(rsSecretariaDao.next()){
            View.MenuPrincipal Menu = new View.MenuPrincipal();
            Menu.setVisible(true);
            this.view.dispose();
        }else{
            view.exibemensagem("Usuario ou senha inválido");
        }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"LoginController "+ erro);
        }
        
    }
    
}
