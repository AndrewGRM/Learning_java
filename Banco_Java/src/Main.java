import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        cliente Andrew = new cliente();
        Andrew.setNome("Andrew");

        conta cc = new ContaCorrente(Andrew);
        conta poupanca = new ContaPoupanca(Andrew);

        int escolha;
        do {
            System.out.println("===Menu do banco:===");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Sair");
            System.out.println("====================");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Qual valor deseja sacar: ");
                    double valor = scanner.nextDouble();
                    cc.depositar(valor);
                    System.out.println("Valor sacado com sucesso");
                    break;
            }
        } while (escolha != 4);

        cc.imprimirExtrato();
        scanner.close();

        cc.depositar(100);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
