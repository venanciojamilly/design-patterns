public class Produto {
    private String nomeProduto;
    private double valorProduto;

    public Produto(String nomeProduto, double valorProduto){
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    public String getProduto(){
        return this.nomeProduto;
    }
}
