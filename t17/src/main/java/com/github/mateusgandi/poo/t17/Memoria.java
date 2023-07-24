package com.github.mateusgandi.poo.t17;

import java.util.Scanner;

public class Memoria extends Dispositivo{
    private int tamanhoMemoria;
    private int[] espaçosMemoria;
    private int i;

    public void Memoria(){
        Scanner scanner = new Scanner(System.in);
        this.tamanhoMemoria = scanner.nextInt();
        this.espaçosMemoria = new int[tamanhoMemoria];
    }

     public void alocarNaMemoria(int endereco, int conteudo){
        if(endereco<this.tamanhoMemoria){
            this.espaçosMemoria[endereco] = conteudo;
        } else {
            System.out.println("Endereço inválido");
        }
    }

    public void removerConteudo(int conteudo){
        for(this.i=0; this.i<this.tamanhoMemoria; this.i++){
            if(this.espaçosMemoria[this.i] == conteudo){
                limparEspacoDaMemoria(conteudo);
            }
        }
    }

    public void limparEspacoDaMemoria(int endereco){
        if(endereco<this.tamanhoMemoria){
            this.espaçosMemoria[endereco] = 0;
        } else {
            System.out.println("Endereço inválido");
        }
    }
}