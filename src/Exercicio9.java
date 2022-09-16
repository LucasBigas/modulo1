import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
      float vlrproduto = 0;
      float novopreco = 0;
      float desconto = 0; 

      Scanner leitor = new Scanner(System.in);
      System.out.println("Digite o valor do produto: ");
      vlrproduto = Float.parseFloat(leitor.nextLine());
      desconto  = (vlrproduto * 10f) / 100;
      novopreco = vlrproduto - desconto;
      System.out.println("O desconto e : " + desconto);
      System.out.println("O novo valor R$ " + novopreco);
      leitor.close();
        

        
        

        

    }
}
