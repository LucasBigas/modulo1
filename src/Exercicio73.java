import java.util.Scanner;

public class Exercicio73 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];
        int contapar =0;
        int contaimpar =0;


        for(int i =0;i<10;i++){
            System.out.println("Digite um numero");
            numeros[i] = Integer.parseInt(leitor.nextLine());

        }

        for(int i=0;i<10;i++){
            if(numeros[i] % 2 == 0){
                contapar++;
            }else{
                contaimpar++;
            }
        }
        System.out.println("O numero de numeros pares e " + contapar);
        System.out.println("O numero de numero impares e " + contaimpar);
        leitor.close();

    }
}
