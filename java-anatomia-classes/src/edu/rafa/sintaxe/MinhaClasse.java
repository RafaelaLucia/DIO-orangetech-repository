package edu.rafa.sintaxe;

public class MinhaClasse {
    
    public static void main (String[] args){
        
        System.out.println("Hello World ");
        String primeiroNome = "Rafaela";
        String segundoNome = "Lucia";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
