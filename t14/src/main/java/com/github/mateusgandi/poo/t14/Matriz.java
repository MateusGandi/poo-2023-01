package com.github.mateusgandi.poo.t14;

import java.util.ArrayList;
import java.util.List;

class Matriz{
    public void Matriz(){
        this.coluna = new Coluna();
        this.linha = new Linha();
        this.elemento = new Elemento();
    }
}

class Coluna{
    private Elemento elemento;
}

class Linha{
    private Elemento elemento;
}

class Elemento{

}