import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        //Faça um programa que receba o salário-base de um funcionário, calcule e mostre o seu salário a receber,
        // sabendo-se que esse funcionário tem gratificação de R$ 50,00 e paga imposto de 10% sobre o salário-base. 

     float slrbase = 0;
     float gratificação = 0;
     float imposto = 0;

     Scanner leitor = new Scanner(System.in);
     System.out.println("Digite aqui o seu salario base ");
     slrbase = Float.parseFloat(leitor.nextLine());
     System.out.println("Digite aqui a sua gratificacao ");
     gratificação = Float.parseFloat(leitor.nextLine());

      imposto = (slrbase * 10f) / 100f;
     float slrreceber = (slrbase + gratificação) - imposto;
     System.out.println("O valor do imposto e de: " + imposto);
     System.out.println("O salario a receber sera de R$ " + slrreceber);
     leitor.close();
     


    }
}
