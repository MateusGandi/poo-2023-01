package com.github.mateusgandi.poo.t11;

import java.util.ArrayList;
import java.util.List;

class Frase{
    private Palavra[] palavras;
    private int mapping=0;

    public void Frase(){
        this.palavras[mapping] = new Palavra();
        mapping++;
    }

    public void adicionarPalavra(){
        this.palavras[mapping] = new Palavra();
        mapping++;
    }
}

class Palavra{
    private Letra[] letras;
    private int mapping=0;

    public void Palavra(){
        this.letras[mapping] = new Letra();
        mapping++;
    }

    public void adicionarPalavra(){
        this.letras[mapping] = new Letra();
        mapping++;
    }
}

class Letra{
    private char caractere;
}