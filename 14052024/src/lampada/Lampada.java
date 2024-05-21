package lampada;

import java.util.Random;

public class Lampada {
    private String status = "desligada";
    private int potencia;
    private int voltagem;
    Random random = new Random();

    public void liga() {
        int chance = random.nextInt(101);
        if (status == "desligada") {
            if (chance < 30) {
                System.out.println("A lâmpada queimou!");
                status = "queimada";
            } else {
                System.out.println("A lâmpada ligou!");
                status = "ligada";
            }
        } else {
            throw new IllegalStateException("A lâmpada está" + status + "! Não é possível ligar ela de novo.");
        }
    }


    public void desliga() {
        if (status == "ligada") {
            System.out.println("A lâmpada desligou!");
            status = "desligada";
        } else {
            throw new IllegalStateException("A lâmpada está " + status + "! Não é possível desligar ela de novo.");
        }
    }

    
    public String getStatus() {
        return status;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVoltagem() {
        return this.voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

}
