import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        
        int refeicaodia =0;
        float reqtld = 0;
        float qtldmes =0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantidade consumida por refeicao");
        reqtld = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite quantas refeicoes faz por dia");
        refeicaodia = Integer.parseInt(leitor.nextLine());


        qtldmes = (reqtld * refeicaodia) * 30f;

        System.out.println("A quantidade de racao consumida por mes e: " + qtldmes);
        leitor.close();



    
    }
    
}
