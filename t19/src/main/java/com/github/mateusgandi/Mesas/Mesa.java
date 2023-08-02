package com.github.mateusgandi.poo.t19.mesas_ocupadas_com_data;

import java.util.ArrayList;
import java.util.Date;

public class Mesa {
    private ArrayList<Pessoa> pessoasQueOcuparam;
    private ArrayList<Date> dataDeOcupacao;

    public void adicionarPessoa(){
        this.pessoasQueOcuparam.add(new Pessoa());
        this.dataDeOcupacao.add(new Date());
    }
}

