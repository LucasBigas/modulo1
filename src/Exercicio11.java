import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        float peso = 0; 
        float gordo =0;
        float magro = 0;
        float pesado = 0;
        float fino = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu peso aqui: ");
        peso = Float.parseFloat(leitor.nextLine());

         gordo = (peso * 15) / 100;
         magro = (peso * 20) / 100;

         pesado = gordo + peso;
         fino = peso - magro;
         
        System.out.println(" voce engordou: " + pesado);
        System.out.println(" Voce emagreceu: " + fino);
          
        leitor.close();


    }
}
