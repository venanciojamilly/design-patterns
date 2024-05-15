public class Main {
    public static void main(String[] args) throws Exception {
        SistemaEdicao s = new SistemaEdicao();
        s.criarDocumento(Cargo.Editor, 0);
        s.getDocumento(0);
        s.publicarDocumento(Cargo.Editor,0);
        s.publicarDocumento(Cargo.Editor,0);
        s.publicarDocumento(Cargo.Editor,0);
    }
}