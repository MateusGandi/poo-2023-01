package com.github.mateusgandi.poo.t19.restaurante;

import java.util.ArrayList;

public class Pessoa {
    private ArrayList<Mesa> mesasOcupadas;

    public void adicionarMesa(){
        this.mesasOcupadas.add(new Mesa());
    }
}
