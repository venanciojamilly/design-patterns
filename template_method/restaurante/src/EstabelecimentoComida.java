public abstract class EstabelecimentoComida {
    protected Pedido pedido;

    public EstabelecimentoComida(Pedido pedido){
        this.pedido = pedido;
    }

    public abstract void fazerPrato();

}
