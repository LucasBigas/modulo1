import java.util.Scanner;

public class BlocodeRepticao {
    public static void main(String[] args) {
        // enquanto
        int contador = 0;
        // VOCE NUNCA SABE QUANTAS VEZES ELE VAI REPETIR 
        while (contador <= 10) {
            System.out.println("rodando... " + contador);
            //operador de incremento pos fixado 
            //contador = contador + 1
            //contador += 1
            //contador++;
            contador++;
        }
        contador = 10;
        while(contador >= 0){
            System.out.println("rodando... " + contador);
            contador--;
        }

        int resposta = 0;
        Scanner leitor = new Scanner(System.in);
        // VOCE NUNCA SABE QUANTAS VEZES ELE VAI REPETIR 
        do{
            System.out.println("sim e vou entrar pelo menos uma vez");
            System.out.println("Digite o numero 5");
            resposta = Integer.parseInt(leitor.nextLine());
            if(resposta != 5){
                //if(resposta != 5) continue; - pula a repeticao atual do bloco e continua
                System.out.println("Valor invalido");
                //break; - quebra o bloco de repeticao mais proximo
            }
        }while(resposta != 5);
        // contador = contador + 2
        // contador += 2
        //             for(iniciar  ; condicao de repeticao ; incre/decre ) { corpo }
        //primeira vez
        //nas outras vezes
        for(int i=0; i<5; i++){
            System.out.println("FOR " + i);
        }
        leitor.close();
    }
}
