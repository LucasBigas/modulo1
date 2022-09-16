import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        float livros = 0;
        float prateleiras = 32f;
        float QTLD = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantos livros");
        livros = Float.parseFloat(leitor.nextLine());

        QTLD = livros / prateleiras;
        System.out.println("A quantia de prateleiras que precisa " + QTLD);
        leitor.close();
    }
}
