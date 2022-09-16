import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        int idade = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite aqui a idade");
        idade = Integer.parseInt(leitor.nextLine());


        if(idade >= 18){
            System.out.println("Ele ja e de maior ");
        }else{
            System.out.println("Ele nao e de maior ");
        }
        System.out.println("FIM DO PROGRAMA");
        leitor.close();
    }
}
