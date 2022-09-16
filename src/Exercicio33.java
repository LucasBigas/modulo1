import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        int codigo = 0;
        float peso = 0;
        int codigopais = 0;
        float dinheiro = 0;
        float gramas = 0;
        float impost = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o codigo aqui");
        codigo = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o peso aqui");
        peso = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o codigo do pais aqui");
        codigopais = Integer.parseInt(leitor.nextLine());
        gramas = peso * 1000f;
        System.out.println("O peso em gramas e " + gramas);


        if(codigo <= 4){
         dinheiro = gramas  * 10f;   
        System.out.println("O valor do preco da gramas e de " + dinheiro + " reais");
        }else{ 
         if (codigo >= 5){
             dinheiro = gramas * 25f;
            System.out.println("O valor do preco das gramas e de " + dinheiro + " reais");
         }else{
             if (codigo >= 8){
                 dinheiro = gramas * 35f;
                 System.out.println("O valor do preco das gramas e de " + dinheiro + " reais");
              }
            }
          }
          switch (codigopais) {
              case 1 :
                  System.out.println("voce vai ter e imposto " + dinheiro);
                  break;

                  case 2 :
                  impost = (dinheiro * 0.15f) + dinheiro;
                  System.out.println("voce vai ter imposto " + impost);
                  break;

                  case 3 :
                  impost = (dinheiro * 0.25f) + dinheiro;
                  System.out.println("voce vai ter imposto " + impost);
                  break;

                
          
              default:
              System.out.println("Digite de 1 a 3");
                
          }
          System.out.println("O peso de carne em gramas " + gramas);
          leitor.close();
        }
        
    }

