package com.github.mateusgandi.poo.t19.mensagem;

public class Objeto {
    
    public void printarMensagemDeObjeto(Objeto novoObjeto){
        novoObjeto.printarMensagemDeObjeto2(novoObjeto);
    }
    
    public void printarMensagem(){
        System.out.println("Objeto printando mensagem de aluno de POO João Vitor Alves dos Reis");
    }

    public void printarMensagemDeObjeto2(Objeto novoObjeto){
        novoObjeto.printarMensagem();
    }
}
