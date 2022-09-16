import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        float numum = 0;
        float numdois = 0;
        float opcao = 0;
        float soma = 0;
        float umnumero = 0;
        float resultado = 0;


        Scanner leitor = new Scanner(System.in);
        System.out.println("+--------------------+");
        System.out.println(" |Digite 1 pra soma     |");
        System.out.println(" |Digite 2 pra raiz quadrada     |");
        System.out.println("+------------------------+");
        opcao = Float.parseFloat(leitor.nextLine());

        if(opcao == 1){
            System.out.println("Digite o primeiro numero aqui");
            numum = Float.parseFloat(leitor.nextLine());
            System.out.println("Digite o segundo numero aqui");
            numdois = Float.parseFloat(leitor.nextLine());
            soma = numum + numdois;
            System.out.println("A soma e " + soma);
        }else{
            System.out.println("Digite um numero aqui");
            umnumero = Float.parseFloat(leitor.nextLine());
            resultado = (float)Math.sqrt(umnumero);
            System.out.println("O resultado e " + resultado);
        }
        leitor.close();


    }
}
