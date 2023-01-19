package rafa.projetos.smartv;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada=true;
        System.out.println("Usuário ligou a tv...");
    }

    public void desligar(){
        ligada=false;
        System.out.println("Usuário desligou a tv...");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void escolherCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Usuário mudou canal para canal " + canal);
    }
    
}
