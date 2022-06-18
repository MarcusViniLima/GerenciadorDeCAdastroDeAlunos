/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;
import Models.Secretaria;
import View.Login;

/**
 *
 * @author marcu
 */
public class LoginHelper  {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    
    public Secretaria obterModelo(){
        String nome = view.getjTextFieldUsuario().getText();
        String senha = view.getjTextFieldSenha().getText();
        Secretaria modelo = new Secretaria();
        modelo.setNome(nome);
        modelo.setSenha(senha);
        return modelo;
    }
    
}
