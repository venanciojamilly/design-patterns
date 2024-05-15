public class MarcaoLanches extends EstabelecimentoComida {
    public MarcaoLanches(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void fazerPrato() {
        this.pedido.fazerPrato();
    }
}
