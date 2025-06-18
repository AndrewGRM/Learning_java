public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Tipos primitivos
        // Estudar classe String que representa texto na aplicação 
        // short e byte não serão muito utilizados, pois não precisamos nos preocupar tanto assim com o espaço de memória reduzido.
        // E o tipo "float" ele é menos utilizado, por conta que, Ele sofre de uma limitação que compromete seu uso em determinadas situações: 
        // somente mantém uma precisão decimal entre 6 e 7 dígitos.
        
        
        String meuNome = "ANDREW GABRIEL"; // "String" para representar textos
        double salarioMinimo = 2500; // "double" é utilizado para representar números fracionados.

        short numeroCurto = 1;
        int numeroNormal = numeroCurto; // Assim como em Python "int" ´r utilizado para números inteiros 
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.print(numero);

        // A palavra "final" é usada para declarar uma variável como uma constante, mas por convenção, esta variável deverá ser escrita toda em caixa alta.
        // final é utilizada para fazer com que o valor da variavel seja apenas aquele valor que você declarou.
        final double VALOR_DE_PI = 3.14;
    }
}
