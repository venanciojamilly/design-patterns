public class Main {
    public static void main(String[] args) {
        SiteVenda site = new SiteVenda();
        site.criarProduto("talcoBebe", 200.1);
        site.ativaNotificacao(new ProdutoDisponivel());
        site.ativaNotificacao(new ProdutoPromocao());

        site.notificarCliente(site.getProduto("talcoBebe"));
    }
}