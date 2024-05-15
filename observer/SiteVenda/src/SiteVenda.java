import java.util.HashMap;
import java.util.HashSet;

public class SiteVenda {
    private HashMap<String,Produto> produtos;
    private HashSet<Notificacoes> notificacoes;

    public SiteVenda(){
        this.produtos = new HashMap<>();
        this.notificacoes = new HashSet<>();
    }

    public void criarProduto(String nomeProduto, double valorProduto){
        Produto produto = new Produto(nomeProduto, valorProduto);
        this.produtos.put(nomeProduto,produto);
    }

    public void ativaNotificacao(Notificacoes notificacoes){
        this.notificacoes.add(notificacoes);
    }
    public Produto getProduto(String key){
        return this.produtos.get(key);
    }
    public void notificarCliente(Produto produto){
        for(Notificacoes notificacao: notificacoes){
            notificacao.notificarProduto(produto);
        }
    }
}
