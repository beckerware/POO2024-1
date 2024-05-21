package principal;

import java.util.Scanner;

import lustre.Lustre;

public class MainLustre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lustre lustre = null;

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar lustre");
            System.out.println("2. Ligar lustre");
            System.out.println("3. Desligar lustre");
            System.out.println("4. Verificar lâmpadas queimadas");
            System.out.println("5. Tratar lâmpadas queimadas");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o número de lâmpadas no lustre: ");
                    int numLampadas = scanner.nextInt();
                    lustre = new Lustre(numLampadas);
                    System.out.println("Lustre criado com " + numLampadas + " lâmpadas.");
                    break;
                case 2:
                    if (lustre != null) {
                        lustre.liga();
                    } else {
                        System.out.println("Crie um lustre primeiro.");
                    }
                    break;
                case 3:
                    if (lustre != null) {
                        lustre.desliga();
                    } else {
                        System.out.println("Crie um lustre primeiro.");
                    }
                    break;
                case 4:
                    if (lustre != null) {
                        lustre.checanumQueimadas();
                    } else {
                        System.out.println("Crie um lustre primeiro.");
                    }
                    break;
                case 5:
                    if (lustre != null) {
                        lustre.trataQueimadas();
                    } else {
                        System.out.println("Crie um lustre primeiro.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
