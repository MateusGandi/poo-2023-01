package com.github.mateusgandi.poo.t18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String sequenciaJogadas = "e4 e5 f42 exf43 Bc4 Dh4 Rf1 b5 Bxb5 Cf6 Cf3 Dh6 d37 Ch5 Ch4 Dg5 Cf5 c6 g4 Cf6 Tg1 cxb5 h4 Dg6 h5 Dg5 Df3 Cg8 Bxf4 Df6 Cc3 Bc5 Cd5 Dxb2 Bd6 Bxg1 e5 Dxa1 Re2 Ca6 Cxg7 Rd8 Df6 Cxf6 Be7";
        Partida partida = new Partida(sequenciaJogadas);
        System.out.println("Lista de Lances:");
        for (int i = 0; i < partida.Lances.size(); i++) {
            Lance lance = partida.Lances.get(i);
            System.out.println("Lance " + (i + 1) + ": jogador [" + lance.jogador.tipo + "], peça " + lance.peca.nome + ", destino [" + lance.destino.y + lance.destino.x + "]");
        }
    }
}
