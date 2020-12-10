package br.edu.uniritter.poo.controller;

import br.edu.uniritter.poo.jogoDeCartas.model.Baralho;
import br.edu.uniritter.poo.jogoDeCartas.model.Jogador;
import br.edu.uniritter.poo.jogoDeCartas.model.Lixo;

import java.util.ArrayList;
import java.util.List;

public class JogoController {

 
    private List<Jogador> jogadores;
    private Lixo lixo;
    private Baralho bar;
    private int jogAtual = 0;
    public JogoController(String jogadores) {

        //cria os jogadores
        for(String item : jogadores.split("¬")){
            this.jogadores.add( new Jogador(item));
        }
        //cria os models
        lixo = new Lixo();
        bar = new Baralho(1);
    }

    public void preJogo() {
        for(int i = 1; i<=9; i++) {
            jogadores.get(0).recebeCarta(bar.comprar());
            jogadores.get(1).recebeCarta(bar.comprar());
            jogadores.get(2).recebeCarta(bar.comprar());
        }
    }

    
    public Jogador obtemJogador(int index)
    {
        if(this.jogadores != null)
            return index > this.jogadores.size() ? this.jogadores.get(0) : this.jogadores.get(index);
        return null;
    }

    public  void escolhaDescarteJogador(int escolha) {
        System.out.println(jogadores.get(jogAtual).getNome() + " escolheu " + escolha);
        lixo.recebeDescarte( jogadores.get(jogAtual).descartar(escolha) );
        proximoJogador();
    }
    public void proximoJogador() {
        jogAtual++;
        if(jogAtual == jogadores.size()){
            jogAtual = 0;
        }
    }
    
    
    
    public void escolhaCompraJogador(int escolha) {
        if (escolha == 2 && !lixo.estaVazio()) {
            jogadores.get(jogAtual).recebeCarta(lixo.comprarCartaDeCima());
        } else {
            jogadores.get(jogAtual).recebeCarta(bar.comprar());
        }
    }
    
    
    
    //acho que mostrar o lixo ficaria melhor na controller aqui de jogo, e não em outra de jogador etc...
    public void mostrarLixo()
    {
        if (lixo.estaVazio()) {
            System.out.println(" VAZIO NO MOMENTO");
        } else {
            //System.out.println("a carta é surpresa");
            System.out.println(lixo.cartaDeCima().getDescricao());
        }
    }

}
