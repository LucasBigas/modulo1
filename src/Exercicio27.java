import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        float dinheiro = 0;
        float dolar = 0;
        float alemao = 0;
        float libra = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu dinheiro aqui ");
        dinheiro = Float.parseFloat(leitor.nextLine());

        dolar = dinheiro / 1.8f;
        alemao = dinheiro / 2f;
        libra = dinheiro / 1.57f;
        System.out.println("A conversao do real pro dolar sera de R$ " + dolar);
        System.out.println("A conversao do real pro marco alemao sera de R$ " + alemao);
        System.out.println("A conversao da real pra libra sera de R$ " + libra);
        leitor.close();

    }
}
