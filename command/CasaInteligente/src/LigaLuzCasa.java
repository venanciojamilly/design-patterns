public class LigaLuzCasa implements Command{
    private Luz luz;

    public LigaLuzCasa(Luz luz){
        this.luz = luz;
    }
    @Override
    public void execute() {
        this.luz.ligaLuz();
    }
}
