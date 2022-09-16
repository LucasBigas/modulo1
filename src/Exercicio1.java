import java.util.Scanner;

public class Exercicio1{
public static void main(String[] args){

    int numhorasdias = 0;
    int numdiasmes = 0;
     int numhorasmes = 0;


     Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o numero de horas trabalhadas por dia");
    numhorasdias = Integer.parseInt(leitor.nextLine());
    System.out.println("Digite o numero de dias trabalhados por mes");
    numdiasmes = Integer.parseInt(leitor.nextLine());

    numhorasmes = numhorasdias * numdiasmes;

    System.out.println("O numero de horas no mes e: " + numhorasmes);

    leitor.close(); 


    





     

   

   

   
    

  
   

}

}
