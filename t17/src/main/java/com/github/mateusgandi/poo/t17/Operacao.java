package com.github.mateusgandi.poo.t17;

import java.util.Date;

import java.util.ArrayList;

public class Operacao {
    private int tipo;
    private int hora;
    private Date data;
    private ArrayList<Voo> voo;

    public Operacao(int tipo, int hora, Voo voo) {
        this.tipo = tipo;
        this.hora = hora;
        this.voo.add(voo);
        this.data = new Date();
    }

    public void adicionarVoo(Voo voo) {
        this.voo.add(voo);
    }
    
}
