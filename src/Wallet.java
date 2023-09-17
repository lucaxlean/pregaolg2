import ed.ListaEncadeada;

public class Wallet {
    private final ListaEncadeada<Ativo> active;
    private final ListaEncadeada<Historico> historic;

    public Wallet() {
        active = new ListaEncadeada<>();
        historic = new ListaEncadeada<>();
    }
    public ListaEncadeada<Ativo> getActive() {
        return active;
    }
    public ListaEncadeada<Historico> getHistoric() {
        return historic;
    }
    public void addtransaction(Historic historic){
        this.historic.add(historic);
        active.add(historic.getActive());
    }
}
