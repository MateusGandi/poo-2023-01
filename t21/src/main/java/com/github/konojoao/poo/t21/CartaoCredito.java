package com.github.mateusgandi.poo.t21;

public class CartaoCredito implements Pagamento {
    public Preco valor(){
        System.out.println("Cartão de crédito");
        return new Preco(0, Moeda.REAL);
    }
}
