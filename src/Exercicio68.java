import java.util.Scanner;


public class Exercicio68 {
    public static void main(String[] args) {
        int numturmas = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero de turmas");
        numturmas = Integer.parseInt(leitor.nextLine());
        float somanotasturmas =0;
        for(int contaturma=0;contaturma<numturmas;contaturma++){
            System.out.println("TURMA NUMERO " + (contaturma + 1));
            System.out.println("Digite o numero de alunos");
            int numalunos = Integer.parseInt(leitor.nextLine());
            float somanotas=0;
            for(int contaaluno=0;contaaluno<numalunos;contaaluno++){
                System.out.println("ALUNO NUMERO: " +(contaaluno + 1));
                float media = Float.parseFloat(leitor.nextLine());
                somanotas += media;
            }
            float mediatruma = somanotas / numalunos;
            somanotasturmas += mediatruma;
            System.out.println("A media da truma e: " + mediatruma);
        }
        float mediaescola = somanotasturmas / numturmas;
        System.out.println("A media da escola e: " + mediaescola);
        leitor.close();
    }
}
