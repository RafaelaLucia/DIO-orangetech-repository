package rafa.projetos.smartv;

public class Usuario {
    
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Volume Atual: " + smartTv.volume);

        smartTv.escolherCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.desligar();

    }
}
