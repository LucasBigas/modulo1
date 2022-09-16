import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        float salariomin = 0;
        float slariofunci = 0;
        float qtlsalario = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite aqui o slario do funcionario: ");
        slariofunci = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite aqui o slario minimo: ");
        salariomin = Float.parseFloat(leitor.nextLine());

        qtlsalario = slariofunci / salariomin;
        System.out.println("Ele recebera: " + qtlsalario);
        leitor.close();
        



    }
}
