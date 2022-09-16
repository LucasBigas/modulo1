import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float mensalidade = 0, valBolsa=0;;
        String tipo;

        System.out.println("Digite o tipo do curso");
        tipo = leitor.nextLine();
        System.out.println("Digite o valor da mensalidade");
        mensalidade = Float.parseFloat(leitor.nextLine());

        if(tipo.equals("Inglês") || tipo.equals("Espanhol")){
            valBolsa = (mensalidade * 40f) / 100f;
            if(valBolsa > 200f){
                valBolsa = 200f;
            }
        }else{
            valBolsa = (mensalidade * 44f) / 100f;
            if(valBolsa > 300f){
                valBolsa = 300f;
            }
        }
        System.out.println("O valor da bolsa e " + valBolsa);
        leitor.close();
    }
}
