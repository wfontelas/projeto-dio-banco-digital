public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("William");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(105.26);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        System.out.println("------------------------------------------");
        poupanca.imprimirExtrato();
    }
}