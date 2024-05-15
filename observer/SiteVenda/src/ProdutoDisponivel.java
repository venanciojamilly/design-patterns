public class ProdutoDisponivel implements Notificacoes{
    @Override
    public void notificarProduto(Produto produto) {
        System.out.println("Olá esse produto está com estoque DISPONÍVEL \n" + "acesse via link : www.vejaoprodutorgratis");
    }
}
