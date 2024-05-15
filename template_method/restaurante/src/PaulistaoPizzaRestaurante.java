public class PaulistaoPizzaRestaurante extends EstabelecimentoComida {
    public PaulistaoPizzaRestaurante(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void fazerPrato() {
        this.pedido.fazerPrato();

    }
}
