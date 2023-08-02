package com.github.mateusgandi.poo.t19.onibus;

import java.util.ArrayList;

public class Passageiro {
    private ArrayList<Viagem> viagens = new ArrayList<>();

    public void adicionarViagem(){
        this.viagens.add(new Viagem());
    }
}
