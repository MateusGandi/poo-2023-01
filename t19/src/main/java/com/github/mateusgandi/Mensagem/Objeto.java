package com.github.mateusgandi.poo.t19.mensagem;

public class Objeto {
    
    public void printarMensagemDeObjeto(Objeto novoObjeto){
        novoObjeto.printarMensagemDeObjeto2(novoObjeto);
    }
    
    public void printarMensagem(){
        System.out.println("Olá mundo!");
    }

    public void printarMensagemDeObjeto2(Objeto novoObjeto){
        novoObjeto.printarMensagem();
    }
}
