import java.util.Scanner;


public class Exercicio60 {
    public static void main(String[] args) {
       // Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do somatório e a média do total.
       int numero = 0;
       int soma = 0;
       float media =0;

       Scanner leitor = new Scanner(System.in);
       int contador = 1;
      

        while(contador <=10) {
            System.out.println("Digite um numero aqui");
            numero = Integer.parseInt(leitor.nextLine());
            soma = numero + soma;
            media = soma / 10f;
            contador++;
        }
        System.out.println(soma);
        System.out.println(media);
        leitor.close();
       
    

      
         
    }
}
