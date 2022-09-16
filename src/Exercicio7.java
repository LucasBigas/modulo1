import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        
        float boleto = 0;
        float percentualm = 0;
        float vlrmulta = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do boleto: ");
        boleto = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o percentual da multa: ");
        percentualm = Float.parseFloat(leitor.nextLine());
          
        vlrmulta = (boleto * percentualm) / 100f;
        System.out.println("O valor da multa por atraso e de R$  " + vlrmulta);
        leitor.close(); 

        
    }
}
