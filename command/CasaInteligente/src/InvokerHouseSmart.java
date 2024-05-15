public class InvokerHouseSmart {
    private Command comando;

    public void setComando(Command comando){
        this.comando = comando;
    }

    public void realizaComando(){
        this.comando.execute();
    }
}
