import java.util.Arrays;
import java.util.Scanner;

public class Exercicio78 {
    public static void main(String[] args) {
        int [] lista = new int[10];
        int[] listainvertida = new int[10];
        Scanner leitor = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Digite um numero");
            lista[i] = Integer.parseInt(leitor.nextLine());
        }
        for(int i=0;i<10;i++){
            listainvertida[i] = lista[9-i];
        }
        System.out.println(Arrays.toString(listainvertida));
        leitor.close();
    }
}
