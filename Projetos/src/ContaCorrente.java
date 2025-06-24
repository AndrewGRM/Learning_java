public class ContaCorrente extends conta {

    public ContaCorrente(cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfos();
    }
}
