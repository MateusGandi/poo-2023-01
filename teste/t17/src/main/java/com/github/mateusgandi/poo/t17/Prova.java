package com.github.mateusgandi.poo.t17;

import java.util.arrayList;
import java.util.arrayList;

public class Prova {
    private String descricaoProva;
    private Aluno alunoCorrespondente;
    private ArrayList<Resposta> respostas;

    public Prova(){
        this.respostas.add(new Resposta());
        Scanner scanner = new Scanner(System.in);
        this.alunoCorrespondente = scanner.nextLine();
        this.descricaoProva = scanner.nextLine();
    }

    public void adicionarRespostas(int qunatidade){
        for(int i = 0;i<quantidade;i++){
            this.respostas.add(new Resposta());
        }
    }
}
