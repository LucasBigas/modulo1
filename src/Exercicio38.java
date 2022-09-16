import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        int codigo = 0;
        float preco = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o codigo aqui");
        codigo = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o preco aqui");
        preco = Float.parseFloat(leitor.nextLine());

        if (codigo == 1){
            System.out.println(" SUL " + preco);
        }else{
            if (codigo == 2){
                System.out.println(" NORTE " + preco);
            }else{
                if (codigo == 3){
                    System.out.println(" LESTE " + preco);
                }else{
                    if (codigo == 4){
                        System.out.println(" OESTE " + preco);
                    }else{
                        if (codigo >= 5 || codigo <= 6){
                            System.out.println(" NOROESTE " + preco);
                        }else{
                            if (codigo >= 7 || codigo <= 9){
                                System.out.println(" SUDESTE " + preco);
                            }else{
                                if (codigo >= 10 || codigo <= 20){
                                    System.out.println(" CENTRO-OESTE " + preco);
                                }else{
                                    if (codigo >= 21 ||codigo  <= 30){
                                        System.out.println(" NORDESTE " + preco);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        leitor.close();
    }
}
