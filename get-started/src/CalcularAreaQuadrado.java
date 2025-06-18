import java.util.Scanner;

public class CalcularAreaQuadrado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do quadrado: ");
        double a = scanner.nextDouble();
        double area = Math.pow(a, 4);
        System.out.println("A área do quadrado é: " + area);
    }
}
