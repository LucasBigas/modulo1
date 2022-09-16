import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        //Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo. Calcule e mostre o salário a receber seguindo as regras abaixo: 
       //- A hora trabalhada vale a metade do salário mínimo 
      //- O salário bruto equivale ao número de horas trabalhas multiplicado pelo valor da hora trabalhada; 
     //- O imposto equivale a 3% do salário bruto; 
    //- O salário a receber equivale ao salário bruto menos o imposto. 
     int horastrab = 0;
     float slrminimo = 0;
     float slrbruto = 0;
     float imposto = 0;
     float slrreceber = 0;
     float vlrhora = 0;


     Scanner leitor = new Scanner(System.in);
     System.out.println("Digite o seu salario aqui");
     slrminimo = Float.parseFloat(leitor.nextLine());
     System.out.println("Digite quantas horas trabalhou ");
     horastrab = Integer.parseInt(leitor.nextLine());
     System.out.println("Digite o valor das horas trabalhadas");
     
     vlrhora = slrminimo / 2;
     slrbruto = horastrab * vlrhora;
     imposto = (slrbruto * 3f) / 100f;
     slrreceber = slrbruto - imposto;
     System.out.println("O salario bruto e de: " + slrbruto);
     System.out.println("O imposto sera de: " + imposto);
     System.out.println("O salrio a receber sera de R$ " + slrreceber);
     leitor.close();
     


    }
}
