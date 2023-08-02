package com.github.mateusgandi.poo.t19.mesas_ocupadas_com_data;

import java.util.ArrayList;
import java.util.Date;

public class Pessoa {
    private ArrayList<Mesa> mesasOcupadas;
    private ArrayList<Date> dataDeOcupacao;

    public void adicionarMesa(){
        this.mesasOcupadas.add(new Mesa());
        this.dataDeOcupacao.add(new Date());
    }
}
