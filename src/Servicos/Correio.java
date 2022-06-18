/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicos;

import Models.Aluno;

/**
 *
 * @author marcu
 */
public class Correio {
    public void mandarEmail(Aluno aluno){
         String destinatario = aluno.getEmail();
         String assunto = "Cadastro concluído.";
         String mensagem = formatarEmail(aluno);
         Email email = new Email(assunto, mensagem, destinatario);
         email.enviar();
    }
    
    private String formatarEmail(Aluno aluno){
        String mensagem = " SEJA BEM VINDO A ESCOLA BLA BLA BLA!!"
                +"\n Oi, "+aluno.getNome()+"."
                +"\n aturma que voê está matriculado é a "+aluno.getTurma()+"."
                +"\n Bom começo de aulas! Beijinhos da Escola bla bla";
        return mensagem;
    }
}
