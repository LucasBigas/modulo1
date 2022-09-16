
import java.util.Scanner;

public class Exercicio72 {
    public static void main(String[] args) {
        int[] listaNumeros = new int[10];

        Scanner leitor = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.println("Digite um numero");
            listaNumeros[i] = Integer.parseInt(leitor.nextLine());
        }


        for(int i=0; i<10; i++){
            if(listaNumeros[i] >10){
            System.out.println(listaNumeros[i]);
            }
        }
        leitor.close();
    }
}
