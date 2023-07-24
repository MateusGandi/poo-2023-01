package com.github.mateusgandi.poo.t08;

import java.util.ArrayList;
import java.util.List;

//Toda disciplina possui um nome
public class Disciplina{
    public String Nome;
}

//Um projeto de software pode empregar várias linguagens de programação.
public class Projeto{
    public List<Linguagem> Linguagens;
}
public class Linguagem{
    public String nome;
}

//Toda escola possui um endereço.
public class Escola{
    public Endereço endereço;
    public String nome;
    public int capacidadeDeAlunos;
}
public class Endereço {
    public String CEP;
    public String logradouro;
}

//Um texto é uma combinação de parágrafos que, por sua vez, são combinações de sentenças.
public class Text {
    private List<Parágrafo> parágrafos;
}
public class Parágrafo {
    private List<Sentença> sentenças;
}
public class Sentença {
    private String conteúdo;
}

//Em um país há várias cidades.
public class País {
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

public class Cidade {
    private String nome; //B
    private País país;//F
    public getNome(){
        return nome;
    }
    public getPais(){
        return país;
    }

}