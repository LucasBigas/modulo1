import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        float salario = 0;
        float c1 = 0;
        float c2 = 0;
        float saldoatual = 0;
        float  cpmf1 = 0;
        float cpmf2 = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite aqui o seu salario");
        salario = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite aqui o seu cheque 1");
        c1 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite aqui seu cheque 2");
        c2 = Float.parseFloat(leitor.nextLine());

         cpmf1 = (c1 * 0.38f) / 100f;
         cpmf2 = (c2 * 0.38f) / 100f;
        saldoatual = salario - (c1 + cpmf1 + c2 + cpmf2);
        
        System.out.println(" O valor do cheque 1 e de: " + cpmf1);
        System.out.println("O valor do cheque 2 e de: " + cpmf2);
        System.out.println("O saldo atual e de: " + saldoatual);
        leitor.close();


    }
}
