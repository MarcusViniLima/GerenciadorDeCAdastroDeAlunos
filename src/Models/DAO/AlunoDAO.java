/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.DAO;

import Models.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author marcu
 */
public class AlunoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Aluno> ListaAluno = new ArrayList<>();

    public void cadastrarAluno(Aluno objAluno) throws ClassNotFoundException {

        String sql = "INSERT INTO ALUNO VALUES (?,?,?,?,?,?,?,?);";

        conn = new BancoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objAluno.getNome());
            pstm.setString(2, objAluno.getCidade());
            pstm.setString(3, objAluno.getEstado());
            pstm.setString(4, objAluno.getTelefone());
            pstm.setString(5, objAluno.getCodigoAluno());
            pstm.setString(6, objAluno.getTurma());
            pstm.setString(7, objAluno.getSerie());
            pstm.setString(8, objAluno.getEmail());
            pstm.execute();
            pstm.close();

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "AlunoDAO CADASTRAR" + erro);
        }
    }

    public void atualizarAluno(Aluno objAluno) throws ClassNotFoundException {

        String sql = "UPDATE ALUNO SET NOME = ?, END_CIDADE = ?, END_ESTADO = ?, TELEFONE = ?, CODIGO_TURMA = ?, SERIE= ?, EMAIL_ALUNO= ?  WHERE CODIGO = ?;";

        conn = new BancoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objAluno.getNome());
            pstm.setString(2, objAluno.getCidade());
            pstm.setString(3, objAluno.getEstado());
            pstm.setString(4, objAluno.getTelefone());
            pstm.setString(5, objAluno.getTurma());
            pstm.setString(6, objAluno.getSerie());
            pstm.setString(7, objAluno.getEmail());
            pstm.setString(8, objAluno.getCodigoAluno());
            pstm.execute();
            pstm.close();

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "AlunoDAO ALTERAR" + erro);
        }

    }

    public ArrayList<Aluno> ListarAluno() {
        String sql = "SELECT * FROM ALUNO;";
        conn = new BancoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Aluno objAluno = new Aluno();
                objAluno.setNome(rs.getString("NOME"));
                objAluno.setCidade(rs.getString("END_CIDADE"));
                objAluno.setEstado(rs.getString("END_ESTADO"));
                objAluno.setTelefone(rs.getString("TELEFONE"));
                objAluno.setCodigoAluno(rs.getString("CODIGO"));
                objAluno.setTurma(rs.getString("CODIGO_TURMA"));
                objAluno.setSerie(rs.getString("SERIE"));
                objAluno.setEmail(rs.getString("email_aluno"));
                
                
                ListaAluno.add(objAluno);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlunoDAO LISTARALUNO" + erro);
        }
        return ListaAluno;
    }

    public void deletarAluno(Aluno objAluno){
        conn = new BancoDAO().conectaBD();
        
        String sql = "DELETE FROM ALUNO WHERE CODIGO= ?;";
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objAluno.getCodigoAluno());
            pstm.execute();
            pstm.close();
            
            
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null,"DeletarAluno"+ erro);
        }
        
        
    }
    
    public ResultSet listarTurmaeSerie() {
        String sql = "SELECT * FROM TURMA ORDER BY CODIGO_TURMA;";

        conn = new BancoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlunoDAO" + erro);
            return null;
        }
        
    }
    
    public ArrayList<Aluno> listarAlunoDeTurma(Aluno objaluno) {
        String sql = "SELECT * FROM ALUNO WHERE CODIGO_TURMA =?;";
        conn = new BancoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objaluno.getTurma());
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Aluno objAluno = new Aluno();
                objAluno.setNome(rs.getString("NOME"));
                objAluno.setCidade(rs.getString("END_CIDADE"));
                objAluno.setEstado(rs.getString("END_ESTADO"));
                objAluno.setTelefone(rs.getString("TELEFONE"));
                objAluno.setCodigoAluno(rs.getString("CODIGO"));
                objAluno.setTurma(rs.getString("CODIGO_TURMA"));
                objAluno.setSerie(rs.getString("SERIE"));
                objAluno.setEmail(rs.getString("email_aluno"));
                
                
                ListaAluno.add(objAluno);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlunoDAO LISTARALUNO" + erro);
        }
        return ListaAluno;
    }
    
    public ArrayList<Aluno> lAlunoDeTurma(Aluno objaluno) {
        String sql = "SELECT * FROM ALUNO WHERE CODIGO =?;";
        conn = new BancoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objaluno.getCodigoAluno());
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Aluno objAluno = new Aluno();
                objAluno.setNome(rs.getString("NOME"));
                objAluno.setCidade(rs.getString("END_CIDADE"));
                objAluno.setEstado(rs.getString("END_ESTADO"));
                objAluno.setTelefone(rs.getString("TELEFONE"));
                objAluno.setCodigoAluno(rs.getString("CODIGO"));
                objAluno.setTurma(rs.getString("CODIGO_TURMA"));
                objAluno.setSerie(rs.getString("SERIE"));
                objAluno.setEmail(rs.getString("email_aluno"));
                
                
                ListaAluno.add(objAluno);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlunoDAO LISTARALUNO" + erro);
        }
        return ListaAluno;
    }
    
}
