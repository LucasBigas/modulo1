import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
         float minutos = 0;
         int codigo = 0;
          float gasto =0;

         Scanner leitor = new Scanner(System.in);
         System.out.println("Digite os minutos aqui");
         minutos =Float.parseFloat(leitor.nextLine());
         System.out.println("Digite 1 para local, 2 para municipal, 3 para estadual"); 
         codigo = Integer.parseInt(leitor.nextLine());
         
         switch (codigo) {
             case 1:
              gasto = (minutos * 0.20f);
              System.out.println("Voce pagara " + gasto);
                 break;

                 case 2:
                 gasto = (minutos * 0.08f);
                 System.out.println("Voce pagara " + gasto);
                 break;

                 case 3:
                 gasto = (minutos * 0.1f);
                 System.out.println("Voce pagara " + gasto);
                 break;

             default:
                 System.out.println("Digite numero de 1 a 3");
         }
         leitor.close();
    }
}
