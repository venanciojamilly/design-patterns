public class Rascunho implements Estado {
    protected Documento doc;

    public void setDocumento(Documento doc){
        this.doc = doc;
    }
    @Override
    public void publicar(Cargo cargo, Documento doc) throws Exception {
        setDocumento(doc);
        doc.setEstado(new Revisao());


    }
}


