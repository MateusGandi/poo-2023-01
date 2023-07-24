package com.github.mateusgandi.poo.t13;

import java.util.Scanner;

public class Casa{
    private Comodo[] comodosAvulsos;
    private int quantidadeComodos=0;
    private Banheiro banheiro;
    int i;
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.construirCasa();
        System.out.println("Deseja usar o banheiro?");
        Scanner scanner = new Scanner(System.in);
        if(scanner.next().equals("sim")){
            casa.usarBanheiro();
        }
    }

    public void construirCasa(){
        System.out.println("Quantos comodos a casa tem?");
        Scanner scanner = new Scanner(System.in);
        for(i=0; i<scanner.nextInt(); i++){
        this.comodosAvulsos[this.quantidadeComodos] = new Comodo();
        this.quantidadeComodos++;
        }
    }

    public void usarBanheiro(){
        this.banheiro.banhar();
        this.banheiro.escovarDentes();
        this.banheiro.darDescarga();
    }
}



