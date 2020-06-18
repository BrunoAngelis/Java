public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        double soma = 0;
        int contador = 0 ;

        while(contador < 35){
            double valorDoLivro = 59.90;
            soma += valorDoLivro;
            contador ++;
        }

        if (soma < 130) {
            System.out.println("Seu estoque está muito baixo!");
        } else if (soma > 2000) {
            System.out.println("Seu estoque está muito alto!"+soma);
        } else{
            System.out.println("Seu estoque esta bom!");
        }
    }
}