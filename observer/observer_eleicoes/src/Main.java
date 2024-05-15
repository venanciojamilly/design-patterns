public class Main {
    public static void main(String[] args) {
        SistemaEleicao sistema = new SistemaEleicao();
        sistema.computa_Voto("22");
        sistema.computa_Voto("13");
        sistema.adicionarVisualizacao(new Grafico());
        sistema.adicionarVisualizacao(new Imagem());
        sistema.adicionarVisualizacao(new Tabela());
        sistema.atualizaVotacao();

    }
}