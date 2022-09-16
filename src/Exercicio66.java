import java.util.Scanner;

public class Exercicio66 {
    public static void main(String[] args) {
        /*Faça um algoritmo que calcule a soma de todos os números ímpares dentro de uma faixa de valores determinada pelo usuário. 
        Um número é ímpar quando sua divisão por 2 não é exata, ou seja, o resto resultante da divisão inteira pelo número 2 tem valor 1.
         Utilize a palavra resto como operador que calcula o resto da divisão de um numero por outro.

        */
        int numero =0;
        int contador =0;
        int soma =0;
        int contaimpar =0;


        Scanner leitor = new Scanner(System.in);

        do{
            System.out.println("Digite um numero");
            numero = Integer.parseInt(leitor.nextLine());

            if(numero % 2 ==1){
                soma += numero;
                contaimpar++;

            }
            contador++;
        }while(numero !=1000);
        System.out.println(soma);
        System.out.println(contador);
        System.out.println(contaimpar);
        leitor.close();
    }
}
