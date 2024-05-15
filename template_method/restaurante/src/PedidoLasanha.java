public class PedidoLasanha implements Pedido{
    @Override
    public void fazerPrato() {
        System.out.println("Fazendo massa");
        System.out.println("Fazendo recheio");
        System.out.println("Forno");
    }
}
