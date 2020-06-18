public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        double livroJava8 = 59.90;
        double livroTDD = 60.99;

        double soma = livroJava8 + livroTDD;

        if (soma < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } else {
            System.out.println("Seu estoque está bom!");
        }
    }
}