public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        // Criar uma bolsa de valores
        StockExchange stockExchange = new StockExchange("Bolsa de Valores XYZ");

        // Criar uma broker
        Broker broker = new Broker("Broker ABC");

        // Criar um investor
        Investor investor = new Investor("Investor 1", 1, broker);
        investor.transfer(100000);

        // Criar uma wallet para o investor
        Wallet wallet = new Wallet();
        investor.getBroker().setWallet(wallet);

        // Adicionar alguns ativos à wallet do investor
        Active active1 = new Active("NKE", "Nike INC.", "Ação", 450.0);

        Active active2 = new Active("PETR4", "Petrobras.", "Ação", 4500.0);

        investor.buy(active1, 10);
        investor.buy(active2, 20);
        investor.sell(active2, 5);

        // Exibir o histórico de transações na wallet do investor
        System.out.println("Histórico de Transações da Wallet de " + investor.getName() + ":");
        for (Historic transaction : wallet.getHistoric()) {
            System.out.println("Active: " + transaction.getActive().getName() +
                    ", Tipo: " + transaction.getType() +
                    ", Quantidade: " + transaction.getAmount() +
                    ", Valor: " + transaction.getValue());
        }
        System.out.println("Saldo atual: " + investor.getBalance());
    }
}
