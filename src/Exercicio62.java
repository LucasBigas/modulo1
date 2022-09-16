import java.util.Scanner;

public class Exercicio62 {
    public static void main(String[] args) {
        //Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo seja informado.
        // Ao final deve ser apresentados o maior e o menor número informado pelo usuário.
        int numero = 0;
        int numeromaior = 0;
        int nuemeromenor = 0;

        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        do{
            System.out.println("Digite um numero maior ou igual a zero");
            numero = Integer.parseInt(leitor.nextLine());
            if(numero < 0) break;

            if(numero > numeromaior){
                numeromaior = numero;
            }

            if(contador == 0){
                nuemeromenor = numero;
            }else{
                if(numero < numeromaior){
                    nuemeromenor = numero;
                }
            }
            contador ++;
        }while(numero >= 0);
        System.out.println("O maior numero e: " + numeromaior);
        System.out.println("O menor numero e: " + nuemeromenor);
        leitor.close();
    }
}
