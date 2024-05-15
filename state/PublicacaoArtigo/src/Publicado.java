public class Publicado implements Estado{

    protected Documento doc;

    public void setDocumento(Documento doc){
        this.doc = doc;
    }

    @Override
    public void publicar(Cargo cargo, Documento doc) throws Exception {
        if(!cargo.equals(Cargo.Leitor)) {
            this.doc = doc;
            System.out.println("Documento já publicado");
        }
        else {
            throw new Exception("Cargo nao pode publicar");
        }
    }
}
