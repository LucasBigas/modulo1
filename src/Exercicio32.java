import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        float notaum = 0;
        float notadois = 0;
        float notatres = 0;
        float media = 0;
        float Exame = 0;


        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite aqui a nota 1");
        notaum = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite aqui a nota 2");
        notadois = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite aqui a nota 3");
        notatres = Float.parseFloat(leitor.nextLine());

        media = (notaum + notadois + notatres) / 3f;
        // operador E &&
        // operador OU ||
        // operador nao !

        if(media >= 7 && media <= 10){
        System.out.println("Aprovado sua media e " + media);
        }else{
            if (media >= 3 && media < 7){
                Exame = 10 - media;
                System.out.println("Exame sua nota e " + Exame);
            }else{
                System.out.println("voce esta reprovado");
            }
        leitor.close();
       }
    } 
}
