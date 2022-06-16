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
import Models.DAO.AlunoDAO;
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

    
    
    public void limparTela(){
        view.getjTable().setVisible(false);
        
       
    }
    
    public void criarTabela(){
        if(view.getjComboBoxTurma().equals("Aluno")){
            view.getjTable().setVisible(true);
        } if(view.getjComboBoxTurma().equals("Professor")){
            view.getjTable().setVisible(true);
        
        }
    }
}

