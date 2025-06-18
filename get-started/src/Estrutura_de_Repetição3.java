import java.util.Scanner;

public class Estrutura_de_Repetição3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";
        do {
            System.out.println("Informe seu nome: ");
            name = scanner.next();
            System.out.println(name);
        } while (!name.equalsIgnoreCase("exit"));
    }
}