public class ContaPoupanca extends conta{

    public ContaPoupanca(cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfos();
    }
}
