package com.github.mateusgandi.poo.t19.pixel;

public class Pixel {
    private Cor cor;
    private Ponto ponto;

    public Pixel(){
        this.cor = new Cor();
        this.ponto = new Ponto();
    }

    public Cor retornarCor(){
        return this.cor;
    }
        public Ponto retornarPonto(){
        return this.ponto;
    }
}
