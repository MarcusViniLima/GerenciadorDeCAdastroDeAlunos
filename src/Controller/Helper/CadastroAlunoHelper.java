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
    
    @Override
    public Aluno obterModelo() {
        
        String nome = view.getjTextFieldNOme().getText();
        String codigo = view.getjTextFieldCodigo().getText();
        String serie = (String) view.getjComboBoxserie().getSelectedItem();
        String telefone = view.getjTextFieldTelefone().getText();
        String cidade = view.getjTextFieldCidade().getText();
        String email = view.getjTextFieldEMAIL().getText();
        String estado = view.getjTextFieldEstado().getText();
        String turma = (String) view.getjComboBoxTurma().getSelectedItem();
       Aluno modelo = new Aluno();
       modelo.setCidade(cidade);
       modelo.setCodigoAluno(codigo);
       modelo.setEmail(email);
       modelo.setNome(nome);
       modelo.setSerie(serie);
       modelo.setTelefone(telefone);
       modelo.setTurma(turma);
       modelo.setEstado(estado);
        return modelo;
    }

    @Override
    public void limparTela() {
     view.getjTextFieldCodigo().setText("");
     view.getjTextFieldCidade().setText("");
     view.getjTextFieldEMAIL().setText("");
     view.getjTextFieldEstado().setText("");
     view.getjTextFieldNOme().setText("");
     view.getjTextFieldTelefone().setText("");
    }
    
}
