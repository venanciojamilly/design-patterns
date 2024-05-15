public class SMS implements Redes{
    @Override
    public void notificarAssinantes(Noticia noticia) {
        System.out.println("Notificando assinantes SMS" + noticia.getTexto());
    }
}
