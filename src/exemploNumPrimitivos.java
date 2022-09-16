public class exemploNumPrimitivos {
    public static void main(String[] args) throws Exception {
        //ISSO E UM COMENTARIO ENTAO O JAVA VAI IGNORAR TUDO O QUE EU ESCREVER AQUI
        // E DAI EU POSSO COLOCAR COMENTARIO SOBRE O PROGRAMA DO WALTER !!! 
         
        System.out.println ("Mãe sou teu fã!");
        System.out.println ("sou um deus!");

        /// ENTRADAS 
        /// INT SIGNIFICA TIPO DE INFORMACAO INTEIRO
        /// ATRIBUICAO DE VALOR - VARIAVEL = VALOR 
        int primeironumero = 7; 
        int segundonumero = 2; 

        /// PROCESSAMENTO
        /// ATRIBUICAO DE VALOR 
       int resultado = primeironumero + segundonumero; 

       //SAIDA
       System.out.print("O resultado e: ");
       System.out.println(resultado);

       // CONCATENAÇÃO
       System.out.println(" O resultado é: " + resultado);

       // INTERPOLAÇÃO  DE STRING
       System.out.println(String.format(" O resultado e: %d", resultado));

        //SUBTRAÇAO
       int resultadosub = primeironumero - segundonumero;

       System.out.println(" O resultado da subraçao e:  " + resultadosub);
       

       //DIVISAO
       float resultadodivi = (float)primeironumero / (float)segundonumero; 

       System.out.println("O resultado da divisao e:  " + resultadodivi);
       

       //MULTIPLICAÇAO
       int resultadomulti = primeironumero * segundonumero; 

       System.out.println("O resultado da multiplicaçao e:  " + resultadomulti);

       //tipo logico (booleano) = true ou false
       boolean resultadocomparacao = primeironumero == segundonumero;
        System.out.println(resultadocomparacao);
        System.out.println(resultadocomparacao?"verdadeiro":"falso");

        String nome = "Lucas Bigas"; 
        System.out.println(nome.replace("a", "$"));
        char umaletra = 'a';
        System.out.println(umaletra);
        System.out.println((int)umaletra);

        long numeromuitogrande = 10L;
        //ERRO A variavel INT nao suporta o valor long por conta do tamanho
        //int vaidarruim = 10L;
        System.out.println(numeromuitogrande);

        int salario = (int)1210.5f; 
        System.out.println(salario);

        // ERRO O double tem 64bits  e nao cabe dentro do float 32bits 
        //float imposto = 1000.0;s 

    





        
           

        

    }
}