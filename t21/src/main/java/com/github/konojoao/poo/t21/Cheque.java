package com.github.mateusgandi.poo.t21;

public class Cheque implements Pagamento {
    public Preco valor(){
        System.out.println("Cheque");
        return new Preco(0, Moeda.REAL);
    }
}
