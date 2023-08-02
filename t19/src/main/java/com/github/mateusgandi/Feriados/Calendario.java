package com.github.mateusgandi.poo.t19.feriados;

import java.util.ArrayList;
import java.util.Date;

public class Calendario {
    private int ano;
    private ArrayList<Evento> feriados;
    private ArrayList<Evento> datasImportantes;

    public Calendario(){
        Date novaData = new Date();
        this.ano = novaData.getYear()+1900;
    }

    public void adicionarFeriado(){
        this.feriados.add(new Evento());
    }

    public void adicionarDataImportante(){
        this.datasImportantes.add(new Evento());
    }
}
