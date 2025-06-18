import java.util.Scanner;

public class Diferenca_Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.print("Digite o seu idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o nome de outra pessoa: ");
        String nome2 = scanner.next();
        System.out.print("Digite a idade dessa pessoa: ");
        int idade2 = scanner.nextInt();

        int diferenca_Idade = idade - idade2;
        System.out.printf("A diferença de idade de %s e %s é de %d anos", nome, nome2, diferenca_Idade);
    }
}
