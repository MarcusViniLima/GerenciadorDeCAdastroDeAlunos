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

    //Construtor--------------------------------------------------
    public Disciplina(String nome, String codigoDisciplina, String tipo){
        this.codigoDisciplina = codigoDisciplina;
        this.tipo = tipo;
        this.nome=nome;
    }

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

    //mostrar os atributos da disciplina ---------------------------------------------
    @Override
    public String toString() {
        return "Disciplina: "+getNome()+" | Código: "+getCodigoDisciplina()+" | Tipo: "+getTipo();
    }
    
}
