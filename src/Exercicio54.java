import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        float vlroriginal = 0;
        float dolar = 0;
        float transporte = 0;
        float vlrreais = 0;
        float imposto = 0;
        int codigo = 0;
        float impostoestadual = 0;
        float vlrtotal = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("O valor original e");
        vlroriginal = Float.parseFloat(leitor.nextLine());
        System.out.println("O valor do dolar e");
        dolar = Float.parseFloat(leitor.nextLine());
        System.out.println("O valor do transporte e");
        transporte = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o codigo do imposto");
        codigo = Integer.parseInt(leitor.nextLine());

        vlrreais = vlroriginal / dolar;

        if(vlrreais < 3000 && codigo == 1){
            imposto = (vlrreais * 1.5f) / 100f;
            System.out.println("O valor do imposto e de " + imposto);
        }else{
            if(vlrreais > 3000 && codigo == 1){
                imposto = (vlrreais * 2f) / 100f;
                System.out.println("O valor do imposto e " + imposto);
            }else{
                if(vlrreais < 1500 && codigo == 2){
                    imposto = (vlrreais * 2f) / 100;
                    System.out.println("O valor do imposto e " + imposto);
                }else{
                    if(vlrreais > 1500 && codigo == 2){
                        imposto = (vlrreais * 3.5f) / 100;
                        System.out.println("O valor do imposto e " + imposto);
                    }else{
                        if(vlrreais > 2000 && codigo == 3){
                            imposto = (vlrreais * 5f) / 100;
                            System.out.println("O valor do imposto e " + imposto);
                        }
                    }
                }
            }
        }
        impostoestadual = imposto / 7 * 2;
        vlrtotal = vlrreais + imposto + transporte + impostoestadual;
        System.out.println("O valor do imposto estadual " + impostoestadual);
        System.out.println("O valor total e de " + vlrtotal);
        leitor.close();
    }
}
