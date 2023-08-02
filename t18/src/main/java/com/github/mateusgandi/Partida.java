package com.github.mateusgandi.poo.t18;

import java.util.ArrayList;
import java.util.List;

class Partida {
    List<Tabuleiro> Tabuleiros;
    List<Lance> Lances;
    int cont = 1;
    boolean flag = false;

    public Partida(String lancesString) {
        Tabuleiros = new ArrayList<>();
        Lances = new ArrayList<>();

        for (String item : lancesString.split(" ")) {
            if (cont == 3) {
                cont = 1;
            }
            Lance lanceAux = new Lance();
            if (item.contains("x")) {
                flag = true;
                item = item.replaceAll("x", "");

                if (item.length() == 3) { 
                    lanceAux.peca = new Peca();
                    lanceAux.peca.nome = "p";
                    lanceAux.jogador = new Jogador();
                    lanceAux.jogador.tipo = cont;
                    lanceAux.destino = new Posicao(Integer.parseInt(item.substring(2, 3)), item.substring(1, 2));
                } else if (item.length() == 4) { 
                    lanceAux.peca = new Peca();
                    lanceAux.peca.nome = item.substring(0, 1);
                    lanceAux.jogador = new Jogador();
                    lanceAux.jogador.tipo = cont;
                    lanceAux.destino = new Posicao(Integer.parseInt(item.substring(3, 4)), item.substring(2, 3));
                }
            } else {
                lanceAux.peca = new Peca();
                if (item.length() == 2) {
                    lanceAux.peca.nome = "p";
                    lanceAux.jogador = new Jogador();
                    lanceAux.jogador.tipo = cont;
                    lanceAux.destino = new Posicao(Integer.parseInt(item.substring(1, 2)), item.substring(0, 1));
                } else if (item.length() == 3) {
                    lanceAux.peca.nome = item.substring(0, 1);
                    lanceAux.jogador = new Jogador();
                    lanceAux.jogador.tipo = cont;
                    lanceAux.destino = new Posicao(Integer.parseInt(item.substring(2, 3)), item.substring(1, 2));
                }
            }
            cont++;

            if (flag) {
                System.out.println("jogador [" + cont + "]: " + lanceAux.peca.nome + "x" + lanceAux.destino.y + lanceAux.destino.x + ";");
            } else {
                System.out.println("jogador [" + cont + "]: " + lanceAux.peca.nome + lanceAux.destino.y + lanceAux.destino.x + ";");
            }
            flag = false;

            Lances.add(lanceAux);
        }
    }
}