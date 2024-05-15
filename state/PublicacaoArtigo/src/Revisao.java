public class Revisao implements Estado {

    protected Documento doc;

    public void setDocumento(Documento doc){
        this.doc = doc;
    }

    @Override
    public void publicar(Cargo cargo, Documento doc) throws Exception {
            setDocumento(doc);
            this.doc.setEstado(new Publicado());


    }
}
