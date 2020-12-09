package br.edu.uniritter.poo.jogoDeCartas.model;

public class CartaOuro extends Carta{

    public CartaOuro(int valor) {
        this.valor = valor;
    }
    @Override
    public String getNaipe() {
        return " de Ouro";
    }
}
