public class Main {

    public static void main(String[] args) {
        cliente Andrew = new cliente();
        Andrew.setNome("Andrew");

        conta cc = new ContaCorrente(Andrew);
        conta poupanca = new ContaPoupanca(Andrew);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
