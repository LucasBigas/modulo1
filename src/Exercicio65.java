import java.util.Scanner;

public class Exercicio65 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int fat = 0;

        System.out.println("Digite o numero do fatorial");
        fat = Integer.parseInt(leitor.nextLine());

        if(fat < 0){
            System.out.println("Valor invalido para fatorial");
        }else{
            if(fat == 0){
                System.out.println("0! = 1");
            }else{
                int resultfat=1;
                for(int i=fat;i>0;i--){
                    resultfat = resultfat * i;
                }
                System.out.println(String.format("%d! = %d",fat,resultfat));
            }
        }
        leitor.close();
    }
 }

