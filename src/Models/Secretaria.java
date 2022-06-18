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
public class Secretaria  {
    
     private String senha, nome, endereco, telefone;
  
    public String getNome() {//implementação do método abstrato
        return nome;
    }
    
    public String getEndereco() {
    return endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    public String getSenha() {
        return senha;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
 
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
