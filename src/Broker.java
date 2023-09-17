import ed.ListaEncadeada;

public class Broker {
    private final String name;
    private final ListaEncadeada<Investor> customers;

    public Broker(String name) {
        this.name = name;
        this.customers = new ListaEncadeada<>();
    }

    public String getName() {
        return name;
    }
    public ListaEncadeada<Investor> getCustomers() {
        return customers;
    }
    public void addClientes(Investor investor) {
        customers.add(investor);
    }

}
