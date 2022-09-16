import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        float bmenor = 0;
        float bmaior = 0;
        float trapezio = 0;
        float altura = 0;
         Scanner leitor = new Scanner(System.in);
         System.out.println("Digite aqui a base menor ");
         bmenor = Float.parseFloat(leitor.nextLine());
         System.out.println("Digite aqui a base maior ");
         bmaior = Float.parseFloat(leitor.nextLine());
          System.out.println("Digite aqui o trapezio ");
          trapezio = Float.parseFloat(leitor.nextLine());
          altura = ((bmenor + bmaior) * trapezio)/2;
          System.out.println("A altura sera de: " + altura);
          leitor.close();
          

    }
}
