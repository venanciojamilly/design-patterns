public class Main {
    public static void main(String[] args) {
        System.out.println("\nPRATO LASANHA , NO MARCAO");
        EstabelecimentoComida lugar1 = new MarcaoLanches(new PedidoLasanha());
        lugar1.fazerPrato();

        System.out.println("\nPRATO HAMBURGUER, NO PAULISTÃO");
        EstabelecimentoComida lugar2 = new PaulistaoPizzaRestaurante(new PedidoHamburguer());
        lugar2.fazerPrato();

        System.out.println("\n PRATO PIZZA, NO VITORINOPIZZA");
        lugar1 = new VitorinoPizza(new PedidoPizzaMarguerita());
        lugar1.fazerPrato();
    }
}