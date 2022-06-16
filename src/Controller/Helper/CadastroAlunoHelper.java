/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;
import Models.Aluno;
import View.CadastroAluno;

/**
 *
 * @author marcu
 */
public class CadastroAlunoHelper implements IHelper {
    
    private final CadastroAluno view;

    public CadastroAlunoHelper(CadastroAluno view) {
        this.view = view;
    }
    
    public void preencherTurma(){
        
    }

    @Override
    public Aluno obterModelo() {
        
        String codigo = view.getjTextFieldNOme().getText();
        String nome = view.getjTextFieldCodigo().getText();
        String serie = view.getjTextFieldSerie().getText();
        String telefone = view.getjTextFieldTelefone().getText();
        String endereco = view.getjTextFieldEstado().getText()+", " + view.getjTextFieldCidade()+", " + view.getjTextFieldBairro();
        String turma = view.getjComboBoxTurma().getToolTipText();
       
        Aluno aluno = new Aluno(codigo, serie, nome, endereco, telefone, turma);
        return aluno;
    }

    @Override
    public void limparTela() {
     view.getjTextFieldCodigo().setText("");
     view.getjTextFieldCidade().setText("");
     view.getjTextFieldBairro().setText("");
     view.getjTextFieldEstado().setText("");
     view.getjTextFieldNOme().setText("");
     view.getjTextFieldSerie().setText("");
     view.getjTextFieldTelefone().setText("");
    }
    
}
