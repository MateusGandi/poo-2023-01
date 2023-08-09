package com.github.mateusgandi.poo.t21;

public class Dinheiro implements Pagamento {
    public Preco valor(){
        System.out.println("Dinheiro");
        return new Preco(0, Moeda.REAL);
    }
}
