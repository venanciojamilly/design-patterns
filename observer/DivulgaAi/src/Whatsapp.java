public class Whatsapp implements Redes{

    @Override
    public void notificarAssinantes(Noticia noticia) {
        System.out.println("Notificando assinantes Whatsapp" + noticia.getTexto());
    }
}
