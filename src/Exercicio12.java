import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        float kg = 0;
        float gramas = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite aqui os kg ");
        kg = Float.parseFloat(leitor.nextLine());

        gramas = kg * 1000f;
        System.out.println("O peso em gramas sera: " + gramas);
        leitor.close();
    }
}
