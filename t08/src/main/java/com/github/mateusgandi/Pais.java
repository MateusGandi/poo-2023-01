package com.github.mateusgandi.poo.t08;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nome; //F
    private List<Cidade> cidades;//A, B , C
    public getNome(){
        return nome;
    }
    public void getCapital(){
        for(Cidade _cidade : cidades){
            if(_cidade.getPais().getNome() == nome){//compara o nome dos pais a qual faz parte a cidade e o nome dos pais contida nas listas

            }
        }
    }
}