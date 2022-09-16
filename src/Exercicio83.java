import java.util.Scanner;

public class Exercicio83 {
    public static void main(String[] args) {
        /*Faça um programa que receba a temperatura média de cada mês do ano 
        e armazene-as em um vetor.
        Calcule e mostre a maior e a menor temperatura do ano e em 
        que mês elas ocorreram (mostrar o mês por extenso: 1- Janeiro, 2 – Fevereiro). 
        Desconsidere empates.
        */
        Scanner leitor = new Scanner(System.in);
        float [] temperatura = new float[12];
        float maiortemp = 0;
        float menortemp=0;
        int indicemaior =0;
        int indicemenor =0;


        for(int i=0;i<12;i++){
            System.out.println("Digite a temperatura");
            temperatura[i] = Float.parseFloat(leitor.nextLine());
        }
        for(int i=0;i<12;i++){
            if(i==0){
                maiortemp = temperatura[i];
                indicemaior = i;
            }else{
                if(temperatura[i] > maiortemp){
                    maiortemp=temperatura[i];
                    indicemaior =i;
                }
            }
            if(i==0){
                menortemp = temperatura[i];
                indicemenor = i;
            }else{
                if(temperatura[i] < menortemp){
                    menortemp = temperatura[i];
                    indicemenor = i;
                }
            }
        }

        System.out.println("A menor temperatura foi  " + menortemp+  " aconteceu no mes ");
        
        switch (indicemenor){
            case 1: 
            System.out.println("janeiro" );
                break;

                case 2:
                System.out.println("Fevereiro");
                break;

                case 3:
                System.out.println("marco");
                break;

                case 4:
                System.out.println("abril");
                break;

                case 5:
                System.out.println("maio");
                break;

                case 6:
                System.out.println("junho");
                break;

                case 7:
                System.out.println("julho");
                break;

                case 8:
                System.out.println("agosto");
                break;

                case 9:
                System.out.println("setembro");
                break;

                case 10:
                System.out.println("outubro");
                break;

                case 11:
                System.out.println("novembro");
                break;

                case 12:
                System.out.println("dezembro");
                break;
        }
        System.out.println("A maior temperatura foi  " + maiortemp+ " e aconteceu no mes" );
        switch (indicemaior) {
            case 1: 
            System.out.println("janeiro");
                break;

                case 2:
                System.out.println("Fevereiro");
                break;

                case 3:
                System.out.println("marco");
                break;

                case 4:
                System.out.println("abril");
                break;

                case 5:
                System.out.println("maio");
                break;

                case 6:
                System.out.println("junho");
                break;

                case 7:
                System.out.println("julho");
                break;

                case 8:
                System.out.println("agosto");
                break;

                case 9:
                System.out.println("setembro");
                break;

                case 10:
                System.out.println("outubro");
                break;

                case 11:
                System.out.println("novembro");
                break;

                case 12:
                System.out.println("dezembro");
                break;
           
        
            default :
            break;
                
        }
        leitor.close();
        
    }
}
