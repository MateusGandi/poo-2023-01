package com.github.mateusgandi.poo.t11;

import java.util.ArrayList;
import java.util.List;

class Produto{

}

class ItemCompra{
    private int quantidade=0;
    private Produto[] produtos;

    public void adicionarProduto(){
        this.produtos[this.quantidade] = new Produto();
        this.quantidade++;

    }
}

class Compra{
    private ItemCompra compra;

    public void Compra(){
        compra = new ItemCompra();
    }
}

class Carne{
    private Prestacao prestacao;

    public void Carne(){
        this.prestacao = new Prestacao();
    }

    public void finalizarCarne(){
        this.prestacao = null;
    }
}

class Prestacao{
    private String data;
    private float valor;
}