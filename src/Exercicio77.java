import java.util.Scanner;

public class Exercicio77 {
    public static void main(String[] args) {
        int[] numero = new int[10];
        int multiplicador = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero do multiplicador");
        multiplicador = Integer.parseInt(leitor.nextLine());

        for(int i=0;i<10;i++){
            System.out.println("Digite um numero");
            numero[i] = Integer.parseInt(leitor.nextLine());
        }

        for(int i=0;i<=10;i++){
            int multi = numero[i] * multiplicador;
            System.out.println(multiplicador+"x"+numero[i]+"="+multi);
        }
        leitor.close();
    }
}
