public class Documento {
    public Estado estado;
    public Integer id;

    public Documento(Integer id){
        this.estado = new Rascunho();
        this.id = id;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getId(){
        return this.id;
    }
    public void publicar(Cargo cargo, Documento doc) throws Exception {
        this.estado.publicar(cargo, this);
    }
}
