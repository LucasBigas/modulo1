import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        //Faça um programa que receba um número inteiro e mostre se ele é par ou impar. (utilize o operador %)
        int numero =0;
         

         Scanner leitor = new Scanner(System.in);
         System.out.println("Digite o numero");
         numero = Integer.parseInt(leitor.nextLine());

         if(numero % 2 ==0){
             System.out.println("PAR");
         }else{
           System.out.println("IMPAR");
         }
         leitor.close();
         

    }
}
