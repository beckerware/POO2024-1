package lustre;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Lustre {
    private int numLampadas;
    private int numQueimadas;
    private String status = "desligado";
    Random random = new Random();

    LinkedList<Integer> lampadas = new LinkedList<>();
    LinkedList<Integer> queimadas = new LinkedList<>();

    public Lustre(int numLampadas) {
        this.numLampadas = numLampadas;
        for (int i = 0; i < numLampadas + 1; i++) {
            lampadas.add(i);
        }
        System.out.println(lampadas.getLast());
    }

    public void liga() {
        if (status.equals("desligado")) {
            if (numLampadas == numQueimadas) {
                System.out.println("Todas as lâmpadas estão queimadas.");
                System.out.println("Não é possível ligar o lustre.");
            } else {
                status = "ligado";
                int chance = random.nextInt(101);
                if (chance < 30) {
                    System.out.println("Uma das lâmpadas queimou.");
                    System.out.println("Número da lâmpada que queimou: " + queima());

                    if (numQueimadas == numLampadas) {
                        System.out.println("Todas as lâmpadas foram queimadas!");
                        status = "queimado";
                    }
                } else {
                    System.out.println("O lustre foi ligado.");
                }
            }
        } else {
            System.out.println("O lustre está " + status + "! Não é possível ligá-lo novamente.");
        }
    }

    public void desliga() {
        if (status.equals("ligado")) {
            status = "desligado";
            System.out.println("O lustre foi desligado.");
        } else {
            System.out.println("O lustre está " + status + "! Não é possível desligá-lo.");
        }
    }

    public void checanumQueimadas() {
        if (numQueimadas >= 1) {
            System.out.println("Existem lâmpadas queimadas no lustre!");
            System.out.println("Número de lâmpadas queimadas: " + numQueimadas);
        } else {
            System.out.println("Não há lâmpadas queimadas no lustre!");
        }
    }

    public int queima() {
        numQueimadas++;
        int qualQueimou = random.nextInt(numLampadas);
        if (!queimadas.contains(qualQueimou)) {
            queimadas.add(qualQueimou);
        } else {
            queima();
        }
        return qualQueimou;
    }

    public void trataQueimadas() {
        int[] arrQueimadas = new int[numLampadas];
        for (int item : queimadas) {
            arrQueimadas[item] = item;
        }
        System.out.println("Lâmpadas queimadas: ");
        for (int i = 0; i < numLampadas; i++) {
            if (arrQueimadas[i] != 0) {
                System.out.println(arrQueimadas[i]);
            }
        }

        System.out.println("Removendo lâmpadas queimadas do lustre...");
        Iterator<Integer> iterator = lampadas.iterator();
        while (iterator.hasNext()) {
            int item = iterator.next();
            if (queimadas.contains(item)) {
                iterator.remove();
            }
        }
        System.out.println("Lâmpadas queimadas removidas com sucesso.");
        System.out.println("Lustre com as lâmpadas queimadas removidas:");
        for (int item : lampadas) {
            System.out.println(item);
        }
    }

}
