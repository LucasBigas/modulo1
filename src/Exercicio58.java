import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        int n = 0;
        int outronumero = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de n");
        n = Integer.parseInt(leitor.nextLine());

        for(int i=0; i<n; i++){
            System.out.println("Digite outro numero");
            outronumero = Integer.parseInt(leitor.nextLine());
            int resulFat = 1;
            for(int j=outronumero; j >= 1; j--){
                resulFat = resulFat * j;
            }
            System.out.println(String.format("%d! = %d",outronumero,resulFat));
        }
        leitor.close();
    }
}
