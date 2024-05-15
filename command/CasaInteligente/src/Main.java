public class Main {
    public static void main(String[] args) {
        InvokerHouseSmart invoker = new InvokerHouseSmart();
        Luz luzcozinha = new Luz();
        Luz luzvaranda = new Luz();
        invoker.setComando(new LigaLuzCasa(luzcozinha));
        invoker.realizaComando();
        invoker.setComando(new DesligaLuzCasa(luzcozinha));
        invoker.realizaComando();
        invoker.setComando(new LigaLuzCasa(luzvaranda));
        invoker.realizaComando();
    }
}