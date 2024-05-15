public class DesligaLuzCasa implements Command{
    private Luz luz;

    public DesligaLuzCasa(Luz luz){
        this.luz = luz;
    }
    @Override
    public void execute() {
        luz.desligaLuz();
    }
}
