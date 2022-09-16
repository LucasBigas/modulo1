import java.util.Scanner;

public class CalcMediaAluno {
 // aqui dentro 
 public static void main(String[] args) {
     //declaracao de variaveis
     /// float nota1 =0, nota2 =0, nota3 =0, nota4 =0, media =o;
     //float nota1 =0, nota2 =0, nota3 =0, nota4 =0; 
     //VARIAVEL - TIPO NOME = VALOR;

     final float nota1,  nota2,  nota3,  nota4;  
     float percPresenca = 0;
      Scanner leitor = new Scanner(System.in);

      System.out.println(" Digite a primeira nota");
      //conversao entre tipo objeto pro tipo primitivo 
       nota1 = Float.parseFloat(leitor.nextLine()); 
       System.out.println(" Digite a segunda nota");
       nota2 = Float.parseFloat(leitor.nextLine());
       System.out.println(" Digite a terceira nota");
       nota3 = Float.parseFloat(leitor.nextLine());
       System.out.println(" Digite a quarta nota");
       nota4 = Float.parseFloat(leitor.nextLine());

       System.out.println("Digite o percentual de presenca do aluno");
       // converte o texto digitando (nextLine) de string para um primitivo float
       percPresenca = Float.parseFloat(leitor.nextLine());



       // CONSTANTE modificador final
       //" tipo a palavra VAR permite que o java"
       // crie a variavel com o tipo valor
       //que foi ATRIBUIDO no codigo
       final var media =(nota1 + nota2 + nota3 + nota4) / 4.0f;
        
       // Comparaçao entre valores 

      

       // REGRA aluno aprovado = media > 7
       // REGRA aluno aprovado = percPrenca >= 75
       boolean situacao = media >= 7  && percPresenca >= 75;

       
        

       //media = 0;
       System.out.println(situacao);
       System.out.println("Situaçao:" + (situacao?"Aprovado":"Reprovado")); 
      System.out.println(" A media do aluno é " + media);

      leitor.close(); 

      

 }

}
