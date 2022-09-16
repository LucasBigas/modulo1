import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args) {
        int numero = 0;
        int soma = 0;
        int contador = 1;
        float media = 0;

        Scanner leitor = new Scanner(System.in);
        do{
            System.out.println("Digite um numero aqui");
            numero = Integer.parseInt(leitor.nextLine());
            if(numero <0) break;

            if(numero > 0){
                soma = numero + soma;
                media = (float) soma / contador;
                contador++;
            }

        
        }while(numero >=0);
        System.out.println(soma);
        System.out.println(media);
        leitor.close();
    }
}
