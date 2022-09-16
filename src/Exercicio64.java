import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        int valor1, valor2, result =0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite valor 1");
        valor1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o valor 2");
        valor2 = Integer.parseInt(leitor.nextLine());

        for(int i=0;i<valor1;i++){
            result+=valor2;
        }
        System.out.println(String.format(" %d x %d = %d",valor1,valor2,result));
        leitor.close();
    }
}
