import java.util.Scanner;

public class Estrutura_Condicional {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.next();

        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();

        System.out.println("Você é emancipado? [s/n] ");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        if (age >= 18) {
            System.out.printf("%s, você tem %s anos e pode dirigir \n", name, age);
        } else if (age >= 16 && isEmancipated) {
            System.out.printf("%s, apesar de ter %s anos, você é emancipado e pode dirigir \n", name, age);
        } else {
            System.out.printf("%s, você não pode dirigir \n", name);
        }

        System.out.println("Fim da execução");

        /* Outras opções são:
        var canDrive = ((age >= 18) || (age >=16 && isEmancipated));
        var message = "";
        if (canDrive) {
            message = name + ", Você pode dirigir \n";
        } else {
            message = name + ", Você não pode dirigir \n";
        }

        E também:
        var canDrive = ((age >= 18) || (age >=16 && isEmancipated));
        var message = canDrive ?
                name + ", Você pode dirigir \n";
                name + ", Você não pode dirigir \n";
         */
    }
}
