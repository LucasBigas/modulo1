import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        float largura = 0;
        float comprimento = 0;
        float area = 0;
        float vlrpotencia = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite aqui o largura ");
        largura = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite aqui o comprimento ");
        comprimento = Float.parseFloat(leitor.nextLine());

        area = largura * comprimento;
        vlrpotencia = area * 18f;

        System.out.println("A area e de: " + area);
        System.out.println("O valor da potencia e de: " + vlrpotencia);
        leitor.close();
    }
}
