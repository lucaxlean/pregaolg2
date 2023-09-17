import ed.ListaEncadeada;

public class Custodian {
    private final String name;
    private final ListaEncadeada<Active> custodialAssets;
    public Custodian(String name) {
        this.name = name;
        this.custodialAssets = new ListaEncadeada<>();
    }
    public String getName() {
        return name;
    }
    public ListaEncadeada<Active> getcustodialAssets() {
        return custodialAssets;
    }
    public void toaddCustodialAssets(Active active) {
        custodialAssets.add(active);
    }
    public void removeCustodialAssets(Active active) {
        custodialAssets.remove(active);
    }
    public void ListaEncadeadaarcustodialAssets() {
        System.out.println("Ativos custodiados por " + name + ":");
        for (Active active : custodialAssets) {
            System.out.println("Código: " + active.getCode() + ", Nome: " + active.getName());
        }
    }
}