package com.github.mateusgandi.poo.t11;

import java.util.ArrayList;
import java.util.List;

class Armario{
    private Prateleira[] prateleiras;
    private int numeroDePrateleiras=1;

    public void adicionarPrateleiras(){
        this.prateleiras[numeroDePrateleiras] = new Prateleira();
        numeroDePrateleiras++;
    }

    public void retirarPrateleiras(){
        while(numeroDePrateleiras>0){
        this.prateleiras[numeroDePrateleiras] = null;
        numeroDePrateleiras--;
        }
    }
}

class Prateleira{
    private Compartimento compartimento;
}

class Compartimento{
    private CD[] cdsGuardados;
    private int numeroCds=0;
    private Livro[] livros;
    public int i=0;

    public Compartimento(){
    for(i=0;i<2;i++){
        this.cdsGuardados[this.numeroCds] = new CD();
        this.numeroCds++;
    }
}

    public void adicionarCD(){
        if(this.numeroCds<4){
        for(i=this.numeroCds;i<4;i++){
        this.cdsGuardados[this.numeroCds] = new CD();
        this.numeroCds++;
    }
        } else if(this.numeroCds<7){
        for(i=this.numeroCds;i<7;i++){
        this.cdsGuardados[this.numeroCds] = new CD();
        this.numeroCds++;
    }
        } else {
        this.cdsGuardados[this.numeroCds] = new CD();
        this.numeroCds++;
        }
    }
}

class Livro{

}

class CD{

}