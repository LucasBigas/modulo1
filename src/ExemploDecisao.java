import java.util.Scanner;

public class ExemploDecisao {
    public static void main(String[] args) {
    int numero = 0;
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o numero ");
    numero = Integer.parseInt(leitor.nextLine());
    /*
    if(Condicao/TESTE){
        //bloco de codigo (ENTAO ou VERDADEIRO)
    }else{
        //bloco de codigo (SENAO - FALSO)
    }

    if(Condicao/TESTE){
        //bloco de codigo (ENTAO ou VERDADEIRO)
    }
    */
    if(numero >= 10){
         System.out.println("O numero e maior que DEZ");
    }else{
         System.out.println("O numero e menor que DEZ");
    }
    System.out.println("FIM DO PROGRAMA");
    leitor.close();   
  }

}
