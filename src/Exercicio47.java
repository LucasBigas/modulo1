import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float totRendimento = 0;
        float valImposto = 0;

        System.out.println("Digite o valor total do seu rendimento");
        totRendimento = Float.parseFloat(leitor.nextLine());

        if(totRendimento <= 19200f){
            valImposto = 0;
        }else{
            if(totRendimento > 19200f && totRendimento < 30000f){
                valImposto = (totRendimento * 8f) / 100f;
            }else{
                valImposto = (totRendimento * 11f) / 100f;
            }
        }
        System.out.println("O valor do imposto e " + valImposto);
        leitor.close();
    }
}
