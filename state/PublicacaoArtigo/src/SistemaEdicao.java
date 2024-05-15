import java.util.ArrayList;
import java.util.List;

public class SistemaEdicao {
    protected List<Documento> documentos;

    public SistemaEdicao(){
        this.documentos = new ArrayList<>();
    }
    public void criarDocumento(Cargo cargo, Integer id){
        if(!cargo.equals(Cargo.Leitor)){
            Documento doc = new Documento(id);
            this.documentos.add(doc);
        }
    }

    public void publicarDocumento(Cargo cargo,Integer idDocumento) throws Exception {
        if(!cargo.equals(Cargo.Leitor)){
            Documento docescolhido = getDocumento(idDocumento);
            docescolhido.publicar(Cargo.Editor, getDocumento(idDocumento));

        }
    }

    public Documento getDocumento(Integer id) throws Exception{
        for(Documento doc : this.documentos){
            if(doc.getId().equals(id)){
                return doc;
            }
        }
        throw new Exception("Documento com ID digitado não existe !");
    }
}
