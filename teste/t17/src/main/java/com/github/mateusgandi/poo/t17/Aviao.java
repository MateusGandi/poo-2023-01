package com.github.mateusgandi.poo.t17;

import java.util.ArrayList;

public class Aviao {
    private ArrayList<Voo> voos;
    private ArrayList<Lugar> lugares;
    private int passageiros=0; //esse numero inclui piloto e copiloto

    public Aviao(){
        for(int i=0;i<2;i++){
            this.lugares.add(new Lugar(this.passageiros));
            this.passageiros++;
        }
    }

    public void adicionarVoo(){
        this.voos.add(new Voo());
        this.passageiros++;
    }

    public void adicionarLugar(){
        this.lugares.add(new Lugar(this.passageiros));
    }
    
}
