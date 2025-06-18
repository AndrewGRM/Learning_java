import java.time.LocalDate;
import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Qual ano do seu nascimento? ");
        int anoDeNascimento = scanner.nextInt();
        var anoAtual = LocalDate.now().getYear();
        var idade = anoAtual - anoDeNascimento;
        System.out.printf("Olá %s você tem %d anos\n", nome, idade);
    }
}
