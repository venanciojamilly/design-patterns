public class ProdutoPromocao implements Notificacoes{
    @Override
    public void notificarProduto(Produto produto) {
        System.out.println("Olá esse produto está em promoção\n" + "link de acesso : www.finaldeperiodoSOS\n" + "use o cupom de desconto: PROMOTION" );
    }
}
