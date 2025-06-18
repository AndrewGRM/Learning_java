import java.util.Scanner;

public class Estrutura_de_Repetição2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";
        while (!name.equals("exit")) {
            System.out.println("Informe seu nome: ");
            name = scanner.next();
            System.out.println(name);

            if (name.equalsIgnoreCase("exit")) break;
        }
    }
}
