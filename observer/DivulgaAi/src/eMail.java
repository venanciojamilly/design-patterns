public class eMail implements Redes{
    @Override
    public void notificarAssinantes(Noticia noticia) {
        System.out.println("Notificando assinantes eMail" + noticia.getTexto());
    }
}
