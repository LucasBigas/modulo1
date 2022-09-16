import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        int lado = 0;
        int quadrado = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite aqui o lado ");
        lado = Integer.parseInt(leitor.nextLine());

        quadrado = lado *lado;
        System.out.println("A area do quadrado é de: " + quadrado);
        leitor.close();
        

    }
}
