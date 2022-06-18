/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author marcu
 */
public class Aluno {
    // Atributos ---------------------------------------------------------------------------
    private String nome;
    private String codigoAluno;
    private String serie;
    private String cidade;
    private String email;
    private String estado;
    private String telefone;
    private String turma;

    


    //Getters & Setters ------------------------------------------------------------------
 
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCodigoAluno() {
        return codigoAluno;
    }
    public String getSerie() {
        return serie;
    }
    public String getTurma() {
        return turma;
    }
    public void setCodigoAluno(String codigoAluno) {
        this.codigoAluno = codigoAluno;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
