import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;


public class SistemaEleicao {
    private List<Voto> votos;
    private ArrayList<Visualizacao> visualizacoes;

    public SistemaEleicao(){
        this.votos = new ArrayList<>();
        this.visualizacoes = new ArrayList<>();
    }
    public void computa_Voto(String voto) {
        Voto voto_comp = new Voto(voto);
        adicionarVotos(voto_comp);
    }
    private void adicionarVotos(Voto voto) {
        this.votos.add(voto);
    }

    public void adicionarVisualizacao(Visualizacao visualizacao){
        this.visualizacoes.add(visualizacao);
    }
    public void atualizaVotacao(){
        for (Visualizacao visualizacao : visualizacoes) {
            visualizacao.atualizar();
        }

    }

}
