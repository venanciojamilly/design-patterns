public class Main {
    public static void main(String[] args) {
       AppDivulgaAi app = new AppDivulgaAi();
       app.adicionaRede(new eMail());
       app.criaNoticia("1","NEWS \n Campina Grande maior são joão do mundo","Kart");
       Noticia nt = app.getNoticia("1");
       app.adicionaRede(new Whatsapp());
        app.notificarAssinantes(nt);

    }
}