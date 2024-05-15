import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppDivulgaAi {
    private HashMap<String,Noticia> noticias;
    private List<Redes> redes;

    public AppDivulgaAi(){
        this.noticias = new HashMap<>();
        this.redes = new ArrayList<>();
    }

    public void criaNoticia(String key, String texto, String autor){
        Noticia noticia = new Noticia(texto,autor);
        noticias.put(key, noticia);
    }
    public Noticia getNoticia(String key){
        return this.noticias.get(key);
    }
    public void adicionaRede(Redes rede){
        this.redes.add(rede);
    }
    public void notificarAssinantes(Noticia noticia){
        for(Redes rede : this.redes){
            rede.notificarAssinantes(noticia);
        }
    }
}
