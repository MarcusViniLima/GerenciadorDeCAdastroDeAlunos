/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.CadastroAlunoHelper;
import Models.Aluno;
import Models.DAO.AlunoDAO;
import View.CadastroAluno;

/**
 *
 * @author marcu
 */
public class CadastroAlunoController {
    
    private final CadastroAlunoHelper helper;
    private final CadastroAluno view;
    

    public CadastroAlunoController(CadastroAluno view ) {
        this.view = view;
        this.helper = new CadastroAlunoHelper(view);
        
    }
    
   /* public void cadastrar(){
        Aluno aluno = helper.obterModelo();
         new AlunoDAO().inserir(aluno);
      
    }*/
}
