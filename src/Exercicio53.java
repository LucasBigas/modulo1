import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {
        int anos =0;
        float salriobase = 0;
        float imposto = 0;
        float gratificacao = 0;
        float vlralimentacao =0;


        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite aqui o salario base");
        salriobase = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite os anos que trabalhou");
        anos = Integer.parseInt(leitor.nextLine());

        if(salriobase < 200){
            System.out.println("ISENTO");
        }else{
            if(salriobase > 200 && salriobase < 450){
                imposto = salriobase * 0.03f;
                System.out.println("O imposto sera de " + imposto);
            }else{
                if(salriobase > 450 && salriobase < 700){
                    imposto = salriobase * 0.08f;
                    System.out.println("O imposto sera de " + imposto);
                }else{
                    if(salriobase == 700){
                        imposto = salriobase * 0.1f;
                        System.out.println("O imposto sera de " + imposto);
                    }else{
                        if(salriobase > 700){
                            imposto = salriobase * 0.12f;
                            System.out.println("O imposto sera de " + imposto);
                        }
                    }
                }
            }
        }
        if(salriobase > 500 && anos <= 3){
            gratificacao = (salriobase * 0.02f) + 50f;
            System.out.println("A gratificacao sera de " + gratificacao); 
        }else{
            if(salriobase > 500 && anos > 3){
                gratificacao = (salriobase * 0.03f) + 60f;
                System.out.println("A gratificacao sera de " + gratificacao);
            }else{
                if(salriobase <= 500 && anos <= 3){
                    gratificacao = (salriobase * 0.05f) + 23f;
                    System.out.println("A gratificacao sera de " + gratificacao);
                }else{
                    if(salriobase <= 500 && anos > 3 && anos  < 6){
                        gratificacao = (salriobase * 0.06f) + 35f;
                        System.out.println("A gratificacao sera de " + gratificacao);
                    }else{
                        if(salriobase <= 500 && anos > 6){
                            gratificacao = (salriobase * 0.1f) + 33f;
                            System.out.println("A gratificacao sera de " + gratificacao);
                        }
                    }
                }
            }
        }
        if( anos <= 10){
            vlralimentacao = (salriobase * 0.04f) + salriobase;
            System.out.println("O valor do vale alimentacao " + vlralimentacao);
        }else{
            if( anos > 10){
                vlralimentacao = (salriobase * 0.06f) + salriobase;
                System.out.println("O valor do vale alimentacao " + vlralimentacao);
            }
        }
        leitor.close();
    }
}
