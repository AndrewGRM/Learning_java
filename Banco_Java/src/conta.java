public abstract class conta implements interface_conta {

    private static int Agencia_Padrao = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected cliente cliente;

    public conta(cliente cliente) {
        this.agencia = conta.Agencia_Padrao;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfos() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


    @Override
    public void sacar(double valor) {
        if (valor < 0) {
            System.out.println("Não foi possível efetuar o saque, o valor precisa ser maior que Zero");
        } else {
            saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor < 0 ) {
            System.out.println("Não foi possível fazer o depósito, o valor precisa ser acima de Zero");
        } else {
            saldo += valor;
        }
    }

    @Override
    public void transferir(double valor, conta contaDestino) {
        if(valor < 0) {
            System.out.println("O valor para transferir precisa ser maior que zero");
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }
}
