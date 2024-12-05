import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Informe o tamanho do caminho: ");
        int tamanho = scanner.nextInt();

        System.out.print("Informe a quantidade de bombas: ");
        int quantidadeBombas = scanner.nextInt();

        if (tamanho <= 1 || quantidadeBombas <= 0 || quantidadeBombas >= tamanho) {
            System.out.println("Tamanho do caminho ou quantidade de bombas inválidos.");
            return;
        }

        int[] caminho = new int[tamanho];
        for (int i = 0; i < quantidadeBombas; i++) {
            int posicao;
            do {
                posicao = random.nextInt(tamanho);
            } while (caminho[posicao] == -1);
            caminho[posicao] = -1;
        }

        int pontos = 0;
        boolean jogoAtivo = true;

        while (jogoAtivo) {
            System.out.print("Caminho: ");
            for (int i = 0; i < caminho.length; i++) {
                if (caminho[i] == 1) {
                    System.out.print(" x ");
                } else if (caminho[i] == -1) {
                    System.out.print(" _ ");
                } else {
                    System.out.print(" _ ");
                }
            }
            System.out.println();

            System.out.print("Escolha uma posição: ");
            int escolha = scanner.nextInt();

            if (escolha < 0 || escolha >= tamanho) {
                System.out.println("Posição inválida.");
                continue;
            }

            if (caminho[escolha] == 1) {
                System.out.println("Posição já escolhida.");
                continue;
            }

            if (caminho[escolha] == -1) {
                System.out.println("Game Over! Você escolheu uma bomba.");
                jogoAtivo = false;
            } else {
                caminho[escolha] = 1;
                pontos++;
                if ((escolha > 0 && caminho[escolha - 1] == -1) || (escolha < tamanho - 1 && caminho[escolha + 1] == -1)) {
                    System.out.println("Cuidado: bomba próxima!");
                }
            }

            boolean ganhou = true;
            for (int i = 0; i < caminho.length; i++) {
                if (caminho[i] == 0) {
                    ganhou = false;
                    break;
                }
            }

            if (ganhou) {
                System.out.println("Parabéns, você ganhou o jogo!");
                jogoAtivo = false;
            }
        }

        System.out.println("Pontuação: " + pontos + " de " + (tamanho - quantidadeBombas));
        System.out.print("Caminho final: ");
        for (int i = 0; i < caminho.length; i++) {
            if (caminho[i] == 1) {
                System.out.print(" x ");
            } else if (caminho[i] == -1) {
                System.out.print(" b ");
            } else {
                System.out.print(" _ ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
