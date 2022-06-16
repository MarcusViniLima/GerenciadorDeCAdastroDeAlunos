/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Controller.Helper.BuscaHelper;
import Models.Aluno;
import Models.DAO.AlunoDAO;
import View.Busca;

/**
 *
 * @author marcu
 */
public class BuscaController {

   private final Busca view;
   private final BuscaHelper helper;

    public BuscaController(Busca view) {
        this.view = view;
        this.helper = new BuscaHelper(view);
        this.helper.limparTela();
    }
   
    public void atualizaTabela() {
        helper.criarTabela();
        
    }

}
