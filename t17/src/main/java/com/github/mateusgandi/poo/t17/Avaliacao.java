package com.github.mateusgandi.poo.t17;

import java.util.ArrayList;

public class Avaliacao {
    private ArrayList<Questao> questoes;
    private ArrayList<Prova> provas;

    public Avaliacao(){
        this.questoes.add(new Questao());
        this.provas.add(new Prova());
    }

    public void adicionarQuestoes(int quantidade){
        for(int i=0;i<quantidade;i++){
            this.questoes.add(new Questao());
        }
    }

    public void adicionarProvas(int quantidade){
        for(int i=0;i<quantidade;i++){
            this.provas.add(new Prova());
        }
    }

    public void verEnunciado(int numeroDaQuestao){
        System.out.println(this.questoes.get[numeroDaQuestao].getEnunciado);
    }
}
