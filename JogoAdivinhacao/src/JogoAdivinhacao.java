import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100.
        int tentativas = 1;

        System.out.println("=== Bem-vindo ao Jogo de Adivinhação! ===");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (tentativas <= 5) {
            System.out.print("\nDigite um número: ");
            int adivinhacao = scanner.nextInt();

            if (adivinhacao == numeroAleatorio) {
                System.out.println("Parabéns, você ganhou o jogo!");
                break;
            } else if (Math.abs(adivinhacao - numeroAleatorio) == 1) {
                System.out.println("TÁ QUENTE!");
            } else if (adivinhacao < numeroAleatorio) {
                System.out.println("\nTente um número maior. \n");
                System.out.println("-> Tentativas restantes: "+ (5 - tentativas));
            } else {
                System.out.println("\nTente um número menor. \n");
                System.out.println("-> Tentativas restantes: "+ (5 - tentativas));
            }

            tentativas++;
        }

        if (tentativas == 6) {
            System.out.println("\nGame Over! O número correto era: " + numeroAleatorio);
        }

        scanner.close();
    }
}

