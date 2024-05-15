public class Noticia {
    private String texto;
    private String autor;
    public Noticia(String texto, String autor){
        this.texto = texto;
        this.autor = autor;
    }
    public void atualizaTexto(String novotexto){
        this.texto = novotexto;
    }

    public String getTexto(){
        return this.texto;
    }

}
