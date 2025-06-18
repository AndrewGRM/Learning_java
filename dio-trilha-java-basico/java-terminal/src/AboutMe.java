import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args) throws Exception {
        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu Nome:");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua Altura:");
        double altura = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm ");
        }
        catch (InputMismatchException e) {
            System.err.println("Os campos 'Idade' e 'altura' precisam ser numéricos e em altura tem que ser '.'");
        } 
    }   
}
