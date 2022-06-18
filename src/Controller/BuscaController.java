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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    }
   
    public void atualizarComboBox(){
        
        try {
            
            AlunoDAO objAluno = new AlunoDAO();
            ResultSet rs = objAluno.listarTurmaeSerie();
            
            while(rs.next()){
                view.getjComboBoxTurma().addItem(rs.getString(1));
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"CadastroAlunoController"+  erro);
        }
        
    }
    
    public void buscarTurma(){
        helper.resetTable();
        Aluno aluno = helper.obterModelo();
        new AlunoDAO().lAlunoDeTurma(aluno);
        try {
                AlunoDAO objAluno = new AlunoDAO();

                DefaultTableModel model;
                model = (DefaultTableModel) this.view.getjTable().getModel();
                model.setNumRows(0);

                ArrayList<Aluno> listaAlunos = objAluno.ListarAluno();

                listaAlunos.stream().forEach((listaAluno) -> {
                    model.addRow(new Object[]{listaAluno.getCodigoAluno(), listaAluno.getNome(), listaAluno.getSerie(), listaAluno.getTurma(), listaAluno.getEmail(), listaAluno.getTelefone(), listaAluno.getCidade(), listaAluno.getEstado()});
                });

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "buscarturma" + erro.getMessage());
            }
        helper.limparTela();
        
    }
    
    public void buscarAluno(){
        helper.resetTable();
        Aluno aluno = helper.obterModelo();
        new AlunoDAO().lAlunoDeTurma(aluno);
        try {
                AlunoDAO objAluno = new AlunoDAO();

                DefaultTableModel model;
                model = (DefaultTableModel) this.view.getjTable().getModel();
                model.setNumRows(0);

                ArrayList<Aluno> listaAlunos = objAluno.ListarAluno();

                listaAlunos.stream().forEach((listaAluno) -> {
                    model.addRow(new Object[]{listaAluno.getCodigoAluno(), listaAluno.getNome(), listaAluno.getSerie(), listaAluno.getTurma(), listaAluno.getEmail(), listaAluno.getTelefone(), listaAluno.getCidade(), listaAluno.getEstado()});
                });

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "buscaraluno" + erro.getMessage());
            }
        helper.limparTela();
    }
}
