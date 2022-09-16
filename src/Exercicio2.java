import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        int numcarne = 250;
        int numpessoas = 0;
        int numquantidade = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite numero de pessoas convidadas");
        numpessoas = Integer.parseInt(leitor.nextLine());

        numquantidade = numcarne * numpessoas;
        System.out.println(" A quantidade de carne para um churrasco: " + numquantidade);

       leitor.close();
    }
}
