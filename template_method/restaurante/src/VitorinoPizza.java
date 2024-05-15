public class VitorinoPizza extends EstabelecimentoComida {
    public VitorinoPizza(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void fazerPrato() {
        this.pedido.fazerPrato();

    }
}
