package br.edu.uniritter.poo.jogoDeCartas.view;

import br.edu.uniritter.poo.controller.JogoController;
import br.edu.uniritter.poo.jogoDeCartas.model.Jogador;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class JogoView {
    private JogoController jogoController;
    
    private JogadorView jogadorView;
    private Jogador ojogAtual;
    private int jogAtual = 0;
    
    public JogoView() {
     
        //this.jogadorView = new JogadorView();
        this.ojogAtual = null;
        this.jogAtual = -1;
        this.jogoController = null;
    }
    
    public void iniciaRodada() {


        jogadorView.mostraMao(this.jogoController.obtemJogador(jogAtual));
        mostraLixo();
        ondeComprar();

    }
    
    public void JogoInit() {
        
        System.out.println("Quando terminar digite FIM\n");
        System.out.println("Digite o nome do jogador: ");
        String jogadores = "";
        Scanner scan = new Scanner(System.in);
        while (!jogadores.equalsIgnoreCase("FIM"));
        {
            jogadores = jogadores + "¬" + scan.next();
        }
        //acesso ao controller
        this.jogoController = new JogoController(jogadores);
 
    }

    
    //funções auxiliares de apresentação de dados do jogo
    public void mostraLixo() {
        System.out.println("L I X O");
        System.out.println("+++++++");
        
        this.jogoController.mostrarLixo();
    }
    
    public void ondeComprar() {
        System.out.println("Você quer comprar do (1)baralho ou do (2) Lixo ?");
        int resp = 0;
        Scanner scan = new Scanner(System.in);
        do {
            resp = scan.nextInt();
        }while (resp<1 || resp > 2);
        //acessamos a controler para efetuar as operações
        this.jogoController.escolhaCompraJogador(resp);
    }
    
}
