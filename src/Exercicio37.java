import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        float valSalBase = 0;
        int codigo = 0;
        float percAumento=0;
        String cargo="";
        float valAumento=0;
        float valNovoSalario=0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salario base");
        valSalBase = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o codigo do cargo (1 a 5)");
        codigo = Integer.parseInt(leitor.nextLine());

        switch (codigo) {
            case 1:
                percAumento = 50f;
                cargo = "Escriturario";
            break;
            case 2:
                percAumento = 35f;
                cargo = "Secretário";
            break;
            case 3:
                percAumento = 20f;
                cargo = "Caixa";
            break;
            case 4:
                percAumento = 10f;
                cargo = "Gerente";
            break;
            case 5:
                percAumento = 0;
                cargo = "Diretor";
            break;
            default:
                System.out.println("Codigo do cargo inválido");
            break;
        }
        valAumento = (valSalBase * percAumento) / 100f;
        System.out.println("O valor do aumento R$ " + valAumento);
        System.out.println("O Cargo " + cargo);
        valNovoSalario = valSalBase + valAumento;
        System.out.println("O novo salario e " + valNovoSalario);
           leitor.close();
        }
    }

