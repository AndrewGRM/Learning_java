import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual a base do retangulo? ");
        double base = input.nextDouble();
        System.out.print("Qual a altura do retangulo? ");
        double altura = input.nextDouble();
        double areaRetangulo = base*altura;
        System.out.println("Area do retangulo: " + areaRetangulo);
    }
}
