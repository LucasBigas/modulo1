import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        float percdesp = 0;
        float salariototal =0;
        float despesa = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o salario total: ");
        salariototal = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor da despesa ");
        despesa = Float.parseFloat(leitor.nextLine());
              
          
        percdesp = (despesa * 100) / salariototal;
        System.out.println(String.format("A despesa R$ %.2f representa %.2f%% do salario de R$ %.2f ",
         despesa, percdesp, salariototal));
        leitor.close();

        


    }
}
