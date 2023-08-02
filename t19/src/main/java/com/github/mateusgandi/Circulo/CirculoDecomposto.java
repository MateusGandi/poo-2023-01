package com.github.mateusgandi.poo.t19.circulo;

public class CirculoDecomposto{
    private int raio;
    private Ponto centro;

    public CirculoDecomposto(){
        this.centro = new Ponto();
    }

    public void move(){
        this.centro.move();
    }
}
