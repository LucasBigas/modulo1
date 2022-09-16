import java.util.Scanner;
public class Exercicio033 {
    public static void main(String[] args) {
        int codproduto=0;
        float pesokg = 0;
        float pesoemgramas = 0;
        int codpais = 0;
        float preco = 0;
        float precoTotal = 0;
        float percImpto=0, valImpto=0;
        float valFinal = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o codigo do produto (1 a 10)");
        codproduto = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o peso do produto em KG");
        pesokg = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o codigo do pais (1 a 3)");
        codpais = Integer.parseInt(leitor.nextLine());
        pesoemgramas = pesokg * 1000f;
        System.out.println("O peso em gramas e " + pesoemgramas);

        if(codproduto >= 1 && codproduto <= 4){
            preco = 10f;
        }else{
            if(codproduto >= 5 && codproduto <= 7){
                preco = 25f;
            }else{
                preco = 35f;
            }
        }
        System.out.println("O preço por grama e " + preco);
        precoTotal = pesoemgramas * preco;
        System.out.println("O preço total " + precoTotal);
        if (codpais == 1) {
            percImpto = 0;
        }else{
            if(codpais == 2){
                percImpto = 15;
            }else{
                percImpto = 25;
            }
        }
        valImpto = (precoTotal * percImpto) / 100;
        System.out.println("O valor do imposto e " + valImpto);
        valFinal = precoTotal + valImpto;
        System.out.println("O preço total final é R$ " + valFinal);
        leitor.close();
    }
}