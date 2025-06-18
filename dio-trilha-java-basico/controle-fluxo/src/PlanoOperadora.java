public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        switch (plano) {
            case "T": {
                System.out.println("5GB de Youtube");
            }
            case "M": {
                System.out.println("Whatsapp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 min de ligação");
            }
        }
    }
}
