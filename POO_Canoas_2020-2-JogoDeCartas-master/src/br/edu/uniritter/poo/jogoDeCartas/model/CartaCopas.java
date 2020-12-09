package br.edu.uniritter.poo.jogoDeCartas.model;

public class CartaCopas extends Carta{

    public CartaCopas(int valor) {
        this.valor = valor;
    }
    @Override
    public String getNaipe() {
        return " de Copas";
    }
}
