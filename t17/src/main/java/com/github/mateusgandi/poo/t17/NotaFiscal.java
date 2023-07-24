package com.github.mateusgandi.poo.t17;

import java.util.ArrayList;

public class NotaFiscal {
    private ArrayList<ItemDeCompra> item;

    public NotaFiscal(int quantidadeItems){
        if(quantidadeItems>0){
        this.item.add(new ItemDeCompra());
    } else {
        System.out.println("quantidade de itens invalida");
    }
}
