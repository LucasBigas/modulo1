import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        int diagmaior = 0;
        int diagmenor = 0;
        int losango = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite aqui o diagonal maior ");
        diagmaior = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite aqui o diagonal menor ");
        diagmenor = Integer.parseInt(leitor.nextLine());

        losango = (diagmaior * diagmenor) / 2;
        System.out.println("A area do losango e de: " + losango);
        leitor.close();
        

    }
}
