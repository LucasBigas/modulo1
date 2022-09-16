import java.util.Scanner;

public class Exercicio76 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];
        int maior=0;
        int menor =0;

        for(int i=0;i<10;i++){
            System.out.println("Digite um numero");
            numeros[i] = Integer.parseInt(leitor.nextLine());
        }
        for(int i=0;i<10;i++){
            if(i==0){
                maior = numeros[i];
            }else{
                if(numeros[i] > maior){
                    maior = numeros[i];
                }
            }
            if(i==0){
                menor =numeros[i];
            }else{
                if(numeros[i] < menor){
                    menor = numeros[i];
                }
            }
        }
        System.out.println(maior);
        System.out.println(menor);
        leitor.close();
    }
}
