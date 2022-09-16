import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {
        int horastraba = 0;
        float slariomin = 0;
        int horaextra = 0;
        float vlrhora = 0;
        float vlrextra = 0;
        float slrbruto = 0;
        float slrreceber = 0;
        float quantia = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu salario aqui");
        slariomin = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a horas trabalhadas");
        horastraba = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite as horas extras");
        horaextra = Integer.parseInt(leitor.nextLine());

        vlrhora = slariomin / 8;
        vlrextra = slariomin / 4;
        slrbruto = horastraba * vlrhora;
        quantia = horaextra * vlrextra;
        slrreceber = slrbruto + quantia;
        System.out.println("O valor da hora e " + vlrhora);
        System.out.println("O valor da hora extra " + vlrextra);
        System.out.println("O valor da slario bruto e " + slrbruto);
        System.out.println("O valor da quantia de horas extras " + quantia);
        System.out.println("O salario a receber e " + slrreceber);
        leitor.close();

    }
}
