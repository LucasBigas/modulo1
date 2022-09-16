import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        int idade = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a idade aqui");
        idade = Integer.parseInt(leitor.nextLine());

    if(idade <= 20){
        System.out.println("JOVEM");
    }else{
        if(idade <= 60){
            System.out.println(" ADULTA");
        }else{
            System.out.println("IDOSO");
        }
    }
    System.out.println("FIM");
    leitor.close();
    }
}
