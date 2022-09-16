import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        float precoFabrica = 0;
        float percLucroDistrib = 0, valLucroDistrib=0;
        float percImpto = 0, valImpto=0;
        float valFinal = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o preco de fabrica");
        precoFabrica = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o percentual de lucro");
        percLucroDistrib = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o percentual do imposto");
        percImpto = Float.parseFloat(leitor.nextLine());

        valLucroDistrib = (precoFabrica * percLucroDistrib) / 100f;
        System.out.println("O valor do lucro do distribuidor e R$" + valLucroDistrib);
        valImpto = (precoFabrica * percImpto) / 100f;
        System.out.println("O valor do imposto e R$ " + valImpto);
        valFinal = precoFabrica + valLucroDistrib + valImpto;
        System.out.println("O valor final é " + valFinal);

        leitor.close();


    }
}
