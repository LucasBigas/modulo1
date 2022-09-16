import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
       ///João recebeu seu salário e precisa pagar duas contas atrasadas. Em razão do seu atraso, ele deverá pagar multa de 2% sobre cada conta.
       /// Faça um programa que calcule e mostre quanto restará do salário de João.

        float salario = 0;
        float contaum = 0;
        float contadois = 0;
        float restoslr = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu salario aqui");
        salario = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor da conta um ");
        contaum = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor da conta dois ");
        contadois = Float.parseFloat(leitor.nextLine());
          
        float vlrcontaum = 0;
        float vlrcontadois = 0;
        float vlrtotalconta = 0;

        vlrcontaum = contaum * 0.2f;
        vlrcontadois = contadois * 0.2f;
        vlrtotalconta = vlrcontaum + vlrcontadois;
        restoslr = salario - vlrtotalconta;
        System.out.println("O valor da conta um e: " + vlrcontaum);
        System.out.println("O valor da conta dois e: " + vlrcontadois);
        System.out.println("O valor total das conta sao: " + vlrtotalconta);
        System.out.println(" O resto do slario sera: " + restoslr);
        leitor.close();



    }
}
