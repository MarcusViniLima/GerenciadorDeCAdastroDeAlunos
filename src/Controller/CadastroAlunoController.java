/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.CadastroAlunoHelper;
import Models.Aluno;
import Models.DAO.AlunoDAO;
import Servicos.Correio;
import View.CadastroAluno;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
    
    public void cadastrar() throws ClassNotFoundException {
        Aluno aluno = helper.obterModelo();
         new AlunoDAO().cadastrarAluno(aluno);
         helper.limparTela();
         Correio correio = new Correio();
         correio.mandarEmail(aluno);
      
    }
    
    public void atualizar() throws ClassNotFoundException{
        Aluno aluno = helper.obterModelo();
         new AlunoDAO().atualizarAluno(aluno);
         helper.limparTela();
    }
    public void deletar(){
        Aluno aluno = helper.obterModelo();
         new AlunoDAO().deletarAluno(aluno);
         helper.limparTela();
    }
    
    public void atualizarComboBox(){
        
        try {
            
            AlunoDAO objAluno = new AlunoDAO();
            ResultSet rs = objAluno.listarTurmaeSerie();
            
            while(rs.next()){
                view.getjComboBoxTurma().addItem(rs.getString(1));
                view.getjComboBoxserie().addItem(rs.getString(2));
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"CadastroAlunoController"+  erro);
        }
        
    }
}
