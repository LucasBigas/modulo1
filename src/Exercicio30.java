import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        float salario = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite aqui seu salario");
        salario = Float.parseFloat(leitor.nextLine());


        if(salario <= 500){
            float novslr = (salario * 0.3f) + salario;
            System.out.println("O aumento sera de R$ " + novslr);
        
        }else{
            System.out.println("Voce nao recebera aumento");
        }
        System.out.println("FIM ");
        leitor.close();
    }
}
