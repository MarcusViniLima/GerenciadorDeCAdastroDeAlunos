/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

/**
 *
 * @author marcu
 */

    import Models.Aluno;
import View.Busca;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marcu
 */
public class BuscaHelper {
    
    private final Busca view;

    public BuscaHelper(Busca view) {
        this.view = view;
    }

    public Aluno obterModelo(){
        String turma = (String) view.getjComboBoxTurma().getSelectedItem();
        String codigo = view.getjTextFieldCodigo().getText();
        Aluno aluno = new Aluno();
        aluno.setTurma(turma);
        aluno.setCodigoAluno(codigo);
        return aluno;
    }
    
    public void limparTela(){
        this.view.getjTextFieldCodigo().setText("");
    }
    
    public void resetTable(){
        DefaultTableModel model;
                model = (DefaultTableModel) this.view.getjTable().getModel();
                model.setNumRows(0);
        
    }
 
    
    
}

