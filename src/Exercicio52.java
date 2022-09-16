
import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {
        float preco = 0;
        float aumento = 0;
        float reducao = 0;
        

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor atual");
        preco = Float.parseFloat(leitor.nextLine());

        if (preco < 30){
            aumento = (preco * 0.12f) + preco;
            System.out.println("O preco tera um aumento de " + aumento);

        }else{
            if(preco >= 30 && preco < 80){
                aumento = (preco * 0.15f) + preco;
                System.out.println("O aumento sera de " + aumento);

            }else{
                if(preco >= 80){
                    reducao = preco - (preco * 0.25f) ;
                    System.out.println("A reducao sera de " + reducao);
                }
            }
        }
        leitor.close();
    }
}
