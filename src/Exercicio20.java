import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        float hora = 0;
        float minutos = 0;
        float totsegundos = 0;
        float totalmin = 0;
        float horasemminutos = 0;


        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite aqui a hora");
        hora = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite os minutos aqui");
        minutos = Float.parseFloat(leitor.nextLine());


        horasemminutos = hora * 60f;
        totalmin = minutos + horasemminutos;
        totsegundos = totalmin * 60f;
        System.out.println("O valor das horas em minutos: " + horasemminutos);
        System.out.println("O total de minutos e de: " + totalmin);
        System.out.println("O total de segundos: " + totsegundos);
        leitor.close();
        

    }
}
