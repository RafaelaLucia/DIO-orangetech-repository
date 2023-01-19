package edu.rafa.sintaxe;

public class Operadores {

    public static void main(String[] args) {

       //////////// operadores aula 2 /////////////////////

        String nomecompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomecompleto);

        var concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        //////////// operadores aula 3 /////////////////////

        int numero = 5;
        System.out.println(-numero);
        System.out.println(numero);

        numero = -numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        ///////////// operadores aula 4 /////////////////////

        int numerador = 5;
        numerador = numerador + 2;
        numerador++; // numerador = numerador + 1
        System.out.println(numerador);

        System.out.println(++numerador); // soma depois imprime
        System.out.println(numerador++); // imprime depois soma

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        //////////// operadores aula 5 /////////////////////

        int a, b;
        a = 5;
        b = 6;
        String resultado = "";

        // com if else
        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

        // com if ternario
        String conta = a == b ? "verdadeiro" : "falso";
        System.out.println(conta);

        /////////// operadores aula 6 ///////////////////

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.print("Numero 1 é igual a Numero 2? " + simNao);

        simNao = numero1 != numero2;
        System.out.print("Numero 1 é diferente de Numero 2? " + simNao);

        simNao = numero1 > numero2;
        System.out.print("Numero 1 é maior que Numero 2? " + simNao);

        if (numero1 < numero2)
            System.out.print("A nossa condição é verdadeira ");

        String nomeUm = "Maria";
        String nomeDois = new String("Maria");

        System.out.println(nomeUm.equals(nomeDois));

        //////////// operadores aula 7 //////////////////

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }else
           System.out.println("fim");

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

        if(condicao1 && ( 7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }
    
    }
}