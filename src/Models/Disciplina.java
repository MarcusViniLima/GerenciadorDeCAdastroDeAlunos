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
public class Disciplina {
    
    //Atributos-----------------------------------------------------
    private String codigoDisciplina;
    private String tipo;
    private String nome;

   

    //Getters e Setters------------------------------------------
    public String getCodigoDisciplina(){
        return codigoDisciplina;
    }
    public String getTipo(){
        return tipo;
    }
    public String getNome() {
        return nome;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  
}
