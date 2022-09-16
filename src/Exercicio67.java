import java.util.Scanner;

public class Exercicio67 {
    public static void main(String[] args) {
        /*Faça um programa que apresente os resultados de uma tabuada de um número qualquer, a qual deve ser impressa no seguinte formato:
        Considerando como exemplo o fornecimento do número 2 para o número qualquer, ter-se-ia a seguinte situação:
        2 x 1 = 2
        2 x 2 = 4
        2 x 3 = 6
        2 x 10 = 20
       */
     
      int tabuada=0;
      Scanner leitor = new Scanner(System.in);
      System.out.println("Digite numero da tabuada");
      tabuada = Integer.parseInt(leitor.nextLine());


       for(int i=1; i<=tabuada;i++){
           System.out.println("Tabuada" + tabuada);
           for(int N=1; N<=10;N++){
               System.out.println(tabuada+"x"+N+"="+tabuada*N);
           }
       } 
       leitor.close();  
    }
}
