package com.github.mateusgandi.poo.t17;

import java.util.Scanner;

public class Resposta {
    private String descricao;

    public Resposta(){
        Scanner scanner = new Scanner(System.in);
        this.descricao = scanner.nextLine();
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void mudarDescricao(){
        System.out.println("Insira a nova descricao");
        Scanner scanner = new Scanner(System.in);
        this.descricao = scanner.nextLine();
    }
}
