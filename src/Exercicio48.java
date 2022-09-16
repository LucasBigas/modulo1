import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float valAluguel = 0;
        float valCond=0;
        float qtdGas=0, valGas = 0;
        float qtdAgua=0, valAgua=0;
        float valTotal=0, valDesconto=0;
        

        System.out.println("Digite o valor do Aluguel");
        valAluguel = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do Condominio");
        valCond = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a qtd de GAS");
        qtdGas = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a qtd de AGUA");
        qtdAgua = Float.parseFloat(leitor.nextLine());
        valGas = qtdGas*1.8f;
        valAgua = qtdAgua*0.6f;

        valTotal = valAluguel + valCond + valGas + valAgua;

        valDesconto = (valTotal * 5f )/100f;
        System.out.println("Valor do desconto caso pague 5 dias antecipado " + valDesconto);
        leitor.close();
    
    }
}
