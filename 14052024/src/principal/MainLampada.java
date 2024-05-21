package principal;

import lampada.Lampada;
import java.util.Random;


public class MainLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.setPotencia(7);
        lampada.setVoltagem(4000);

        Random random = new Random();

        //chamando randomicamente os métodos liga e desliga 15 vezes:
        for(int i = 0; i < 15; i++ ){
            int moeda = random.nextInt(2);
            if(moeda == 1){
                System.out.println("Tentando ligar a lâmpada...");
                lampada.liga();
            }else{
                System.out.println("Tentando desligar a lâmpada...");
                lampada.desliga();
            }
        }
    }
}
