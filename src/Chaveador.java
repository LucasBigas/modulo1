public class Chaveador {
    public static void main(String[] args) {
        int opcao = 1;

        if ( opcao == 0){
            System.out.println("IF: valor ZERO");
        } else {
            if ( opcao == 1){
                System.out.println("IF: valor e um");
           } else{
               if (opcao == -1){
                   System.out.println("IF: valor negativo");
               }
           }
        }
        switch (opcao) {
            case -1:
                System.out.println("SWITCH: valor negativo");
            break;

            case 0:
                System.out.println("SWITCH: valor zero");
            break;

            case 1:
                System.out.println("SWITCH: valor e um");
            break;

            default:
                System.out.println("NENHUM DOS CASOS ANTERIORES!");
            break;
        }
    }
}
