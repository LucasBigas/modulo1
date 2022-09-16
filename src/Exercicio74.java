import java.util.Arrays;
import java.util.Scanner;

public class Exercicio74 {
    public static void main(String[] args) {
        int[]listanumero = new int[10];

        Scanner leitor = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.println("Digite um numero");
            listanumero[i] = Integer.parseInt(leitor.nextLine());
        }

        for(int i=0; i<10; i++){
            if(listanumero[i] <10){
                listanumero[i] =0;
            }
            
            
        }
        System.out.println(Arrays.toString(listanumero));
        leitor.close();
    }
}
