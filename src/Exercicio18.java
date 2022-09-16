import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        float celsius = 0;
        float fahrenheit = 0;
         Scanner leitor = new Scanner(System.in);

         System.out.println("Digite aqui os grus celsius ");
         celsius = Float.parseFloat(leitor.nextLine());

         fahrenheit = celsius * 1.8f + 32f;
         System.out.println("Os graus em Fahrenheit sera: " + fahrenheit);
         leitor.close(); 
    }
}
