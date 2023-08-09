package com.github.mateusgandi.poo.t22;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Bilhete {
    private Date dataCompra;
    private int identificador;
    private Boolean flagUniversal;
    private List brinquedos = new ArrayList<Brinquedo>();
    private Date troca;

    public Bilhete(Date dataCompra, int identificador, Boolean flagUniversal) {
        this.dataCompra = dataCompra;
        this.identificador = identificador;
        this.flagUniversal = flagUniversal;
    }

    public void trocar(){
        this.troca = new Date();
    }
}
