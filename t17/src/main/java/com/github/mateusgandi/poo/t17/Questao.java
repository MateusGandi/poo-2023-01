package com.github.mateusgandi.poo.t17;

import java.util.Scanner;

public class Questao {
    private String enunciado;
    public Questao(){
        System.out.println("adicione um enunciado");
        Scanner scanner = new Scanner(System.in);
        this.enunciado = scanner.nextLine();
    }

    public String getEnunciado(){
        return this.enunciado;
    }
}
