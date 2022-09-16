import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        float slario = 0;
        float vlraumento = 0;
        float novoslr = 0;
         float percaumento = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite aqui o salario ");
        slario = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o percentual do aumento");
        percaumento = Float.parseFloat(leitor.nextLine());

          
        vlraumento = (slario * percaumento) / 100f;
        novoslr = slario + vlraumento;
        System.out.println(" O aumento sera de R$ " + vlraumento);
        System.out.println(" O novo slario sera R$ " + novoslr);
        leitor.close();


    }
}
