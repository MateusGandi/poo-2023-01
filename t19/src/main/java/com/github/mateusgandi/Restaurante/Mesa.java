package com.github.mateusgandi.poo.t19.restaurante;

import java.util.ArrayList;

public class Mesa {
    private ArrayList<Pessoa> pessoasQueOcuparam;

    public void adicionarPessoa(){
        this.pessoasQueOcuparam.add(new Pessoa());
    }
}
