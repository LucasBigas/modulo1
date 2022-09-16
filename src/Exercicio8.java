import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        float umnumero = 0;
        int numinteiro = 0;
        float numdcimal = 0;
        int numarrendondado = 0;
        Scanner leitor = new Scanner(System.in);
         
        System.out.println("Digite um numero real ");
        umnumero = Float.parseFloat(leitor.nextLine());
        // Conversao de tipo float para int ( com perda de info)
        numinteiro = (int)umnumero;
        numdcimal = umnumero % 1; 
        //numdecimal =umnumero -  numinteiro 
        numarrendondado = Math.round(umnumero);
        System.out.println(" o valor inteiro e: " + numinteiro);
        System.out.println(" o valor inteiro e: " + numdcimal);
        System.out.println("O valor arredondado e: " + numarrendondado);
         leitor.close();

        



        


    }
}
