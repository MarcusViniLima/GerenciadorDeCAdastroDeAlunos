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
public class LoginHelper implements IHelper {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    @Override
    public Secretaria obterModelo(){
        String nome = view.getjTextFieldUsuario().getText();
        String senha = view.getjPasswordFieldsenha().getText();
        Secretaria modelo = new Secretaria (nome, senha);
        return modelo;
    }
    
    public void setarModelo(Secretaria modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getjTextFieldUsuario().setText(nome);
        view.getjPasswordFieldsenha().setText(senha);
    }
    
    @Override
    public void limparTela(){
        view.getjTextFieldUsuario().setText("");
        view.getjPasswordFieldsenha().setText("");
    }
}
