import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float totalCol = 0;
        float percCol=0;

        System.out.println("Digite a sua qtd de colestrol");
        totalCol = Float.parseFloat(leitor.nextLine());

        if(totalCol <= 130){
            System.out.println("Voce esta saudável");
        }else{
            percCol = 100 - (totalCol * 100f / 130f);
            System.out.println("Perc de colesterol acima e " + percCol);
        }
        leitor.close();
    }
}
