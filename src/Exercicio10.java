import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        float salariofixo = 0;
        float vlrvendas = 0;
        float comissaofinal = 0; 
        float salariofinal = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite aqui o valor das vendas ");
        vlrvendas = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite aqui o slario fixo ");
        salariofixo = Float.parseFloat(leitor.nextLine());


       comissaofinal = (vlrvendas * 4f) / 100f; 
       salariofinal = salariofixo + comissaofinal;
       System.out.println("A comissao final é: " + comissaofinal);
       System.out.println("O salario final e: " + salariofinal);
       leitor.close(); 



    }
}
