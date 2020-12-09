import br.edu.uniritter.poo.controller.JogoController;
import br.edu.uniritter.poo.jogoDeCartas.view.JogadorView;
import br.edu.uniritter.poo.jogoDeCartas.view.JogoView;
import br.edu.uniritter.poo.jogoDeCartas.model.Baralho;
import br.edu.uniritter.poo.jogoDeCartas.model.Jogador;
import br.edu.uniritter.poo.jogoDeCartas.model.Lixo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JogoController controller =  new JogoController();
        controller.preJogo();
        controller.iniciaRodada();
        /*
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Jean"));
        jogadores.add( new Jogador("Paul"));
        jogadores.add(new Jogador("Lopes"));
        Lixo lixo = new Lixo();

        Baralho bar = new Baralho(1);
        for(int i = 1; i<=9; i++) {
            jogadores.get(0).recebeCarta(bar.comprar());
            jogadores.get(1).recebeCarta(bar.comprar());
            jogadores.get(2).recebeCarta(bar.comprar());
        }
        int jogAtual = 0;
        while (bar.temCarta()) {
            JogadorView.mostraMao(jogadores.get(jogAtual));
            JogoView.mostraLixo(lixo);
            int resposta = JogoView.ondeComprar();
            if (resposta == 2 && !lixo.estaVazio()) {
                jogadores.get(jogAtual).recebeCarta(lixo.comprarCartaDeCima());
            } else {
                jogadores.get(jogAtual).recebeCarta(bar.comprar());
            }
            int retorno = JogadorView.escolheCartaDescartar(jogadores.get(jogAtual));
            System.out.println(jogadores.get(jogAtual).getNome() + " escolheu " + retorno);
            lixo.recebeDescarte( jogadores.get(jogAtual).descartar(retorno) ) ;
            jogAtual++;
            if(jogAtual == jogadores.size()){
                jogAtual = 0;
            }
        }

         */
    }
}
