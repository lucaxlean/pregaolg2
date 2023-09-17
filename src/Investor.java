public class Investor {
    private final int id;
    private final String name;
    private double balance;
    private final Broker broker;

    public Investor(String name, int id, Broker broker) {
        this.name = name;
        this.id = id;
        this.balance = 0;
        this.broker = broker;
        this.broker.getCostumers().add(this);
    }

    public void transfer(double amount){
        if (amount <=0 ){
            throw new IllegalArgumentException();
        }
        balance+=amount;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Broker getBroker() {
        return broker;
    }

    public double getBalance() {
        return balance;
    }

    public void Buy(Active active, int amount) {
        double Total = active.getActualValue() * amount;
        if (Total <= balance) {
            balance -= Total;
            Historic historic = new Historic(active, amount, (float) Total, 0);
            broker.getWallet().addTransaction(historic);
            System.out.println(name + " comprou " + amount + " ações da empresa " + active.getName());
        } else {
            throw new IllegalArgumentException("Saldo insuficiente para comprar ações.");
        }
    }

    public void sell(Active active, int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("A quantidade de ações a ser vendida não pode ser negativa.");
        }
        if (broker.getWallet().getActive().getIndex(active) == -1){
            throw new IllegalArgumentException("Voce nao possui essa ação para vender");
        }

        double sellPrice = ativo.getActualValue() * amount;
        balance += sellPrice;
        var historic = new Historic(active, amount, (float) sellPrice, 1);
        broker.getWallet().addTransaction(historic);
        System.out.println(name + " vendeu " + amount + " ações da empresa " + ativo.getName());
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            string.append((i < String.valueOf(id).length())?String.valueOf(id).toCharArray()[i]:" ");
        }

        for (int i = 0; i < 50; i++) {
            string.append((i < name.length())?name.toCharArray()[i]:" ");
        }
        for (int i = 0; i < 12; i++) {
            string.append((i < String.valueOf(balance).length())?String.valueOf(balance).toCharArray()[i]:" ");
        }

        return string.toString();
    }
}