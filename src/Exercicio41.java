import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        float pg =0;
        float calculo = 0;
        float dias = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero de paginas");
        pg = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o numero de dias");
        dias = Float.parseFloat(leitor.nextLine());
        calculo = pg / dias;

        if (calculo < 100){
            System.out.println("Ele deve ler " + calculo + " paginas ");
        }else{
                System.out.println(" IMPOSSIVEL de ler ");
            }
            leitor.close();
       }
    }

