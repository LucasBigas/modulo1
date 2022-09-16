import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
         
        float preco = 0.9f;
        float fotoreveladas = 0;
        float valortotal = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite quantas fotos foram reveladas");
        fotoreveladas = Float.parseFloat(leitor.nextLine());

        valortotal = fotoreveladas * preco;
        System.out.println("O valor total das foto e: " + valortotal);

       leitor.close();



        


    }
    
}
