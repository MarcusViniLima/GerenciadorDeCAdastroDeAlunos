/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Busca;
import View.CadastroAluno;
import View.MenuPrincipal;

/**
 *
 * @author marcu
 */
public class MenuPrincipalController {
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaCadastroAluno(){
        CadastroAluno cadastroAluno = new CadastroAluno();
        cadastroAluno.setVisible(true);
        this.view.dispose();
    }
    
    
    public void navegarParaBusca(){
        Busca buscaAluno = new Busca();
        buscaAluno.setVisible(true);
        this.view.dispose();
    }
    public void navegarParaLista(){
        Busca buscaAluno = new Busca();
        buscaAluno.setVisible(true);
        this.view.dispose();
    }
    
}
