package umobjeto;

import java.util.Random;

public class UmObjeto {
    private int x;
    private static Random gerador = new Random();
    private static UmObjeto instancia;

    private UmObjeto() {
        x = gerador.nextInt();
    }

    public static UmObjeto pegaInstancia() {
        if (instancia == null) {
            instancia = new UmObjeto();
        }
        return instancia;
    }

    public String toString() {
        return "Meu valor: " + x;
    }
}