package com.github.mateusgandi.poo.t19.onibus;

import java.util.ArrayList;

public class Viagem {
    private ArrayList<Passageiro> passageiros = new ArrayList<>();

    public void adicionarPassageiro(){
        this.passageiros.add(new Passageiro());
    }
}
