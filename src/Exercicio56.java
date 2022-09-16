public class Exercicio56 {
    public static void main(String[] args) {
        int soma =0;
       for(int i=1; i<=500; i++){
           if(i % 2 == 0){
               System.out.print(String.format("%d ",i));
               soma = soma + i; 
           }
       }
       System.out.println("O total dos numero pares de 1 a 500 e: " + soma);
    }
}
