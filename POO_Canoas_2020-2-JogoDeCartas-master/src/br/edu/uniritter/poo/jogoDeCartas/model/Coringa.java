package br.edu.uniritter.poo.jogoDeCartas.model;

import br.edu.uniritter.poo.jogoDeCartas.model.Carta;

public class Coringa extends Carta {

    public Coringa() {
        this.valor = 0;
    }
    @Override
    public String getNaipe() {
        return " @ ";
    }
}
