package com.github.mateusgandi.poo.t17;

import java.util.ArrayList;

public class Tripulacao {
    private Piloto piloto;
    private Aeromoca aeroMoca;
    private CoPiloto coPiloto;
    private ArrayList<Voo> voos;

    public Tripulacao(){
        this.voos.add(new Voo());
    }

    public void adicionarVoo(){
        this.voos.add(new Voo());
    }
}
