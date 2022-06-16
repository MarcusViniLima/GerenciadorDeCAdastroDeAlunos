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
public abstract class EntidadeEscolar {
    
    // Atributos -------------------------------------------------------------------------
    protected String nome;
    protected String endereco;
    protected String telefone;

    // Construtores ----------------------------------------------------------------------
    //um construtor de uma classe abstrata serve para ser invocado pelas classes filhas
    public EntidadeEscolar(String nome, String endereco, String telefone){
        this.nome=nome;
        this.endereco=endereco;
        this.telefone=telefone;
    }
    public EntidadeEscolar(String nome){
        this.nome=nome;
    }

    //Getters & Setters ------------------------------------------------------------------
    public abstract String getEndereco();
    public abstract String getNome();
    public abstract String getTelefone();

    public abstract void setEndereco(String endereco);
    public abstract void setNome(String nome);
    public abstract void setTelefone(String telefone);
    
}
