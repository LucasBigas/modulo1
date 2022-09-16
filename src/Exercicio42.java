import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        float velocidade = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a velocidade");
        velocidade = Float.parseFloat(leitor.nextLine());

        if (velocidade >= 60 && velocidade <= 100){
            System.out.println("Multa media, 60 ufir");
        }else{
            if (velocidade >= 100 && velocidade <= 160){
                System.out.println("Multa grave, 120ufir");
            }else{
                if (velocidade >= 160){
                    System.out.println("Mlta gravissima, 180 ufir");
                }
            }
        }
        leitor.close();
    }
}
