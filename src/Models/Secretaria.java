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
public class Secretaria extends EntidadeEscolar {
    
     private String senha;

    public Secretaria(String senha, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.senha = senha;
    }

    public Secretaria(String senha, String nome) {
        super(nome);
        this.senha = senha;
    }
  
     @Override
    public String getNome() {//implementação do método abstrato
        return nome;
    }
    @Override
    public String getEndereco() {
    return endereco;
    }
    @Override
    public String getTelefone() {
        return telefone;
    }
    public String getSenha() {
        return senha;
    }

    
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
