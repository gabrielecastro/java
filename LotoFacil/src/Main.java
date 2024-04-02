import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        char awardWinningLyrics = 'G';

        int option;
        do {
            System.out.println("**************************");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("**************************");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // apostar de 0 a 100
                    betFrom0to100(scanner, random);
                    break;
                case 2:
                    // apostar de A a Z
                    betFromAToZ(scanner, awardWinningLyrics);
                    break;
                case 3:
                    // apostar em par ou ímpar
                    betOddOrEven(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.print("Digite uma opção válida");
            }
        } while (option != 0);
        scanner.close();
    }

    public static void betFrom0to100(Scanner scanner, Random random) {
        System.out.print("Digite um número de 0 a 100: ");
        int betNumber = scanner.nextInt();
        if (betNumber < 0 || betNumber > 100) {
            System.out.println("Aposta inválida.");
            return;
        }
        int drawnNumber = random.nextInt(101);
        System.out.println("Número sorteado: " + drawnNumber);
        if (betNumber == drawnNumber) {
            System.out.println("Você ganhou R$ 1.000,00 reais.");
        } else {
            System.out.println("Que pena! O número sorteado foi: " + drawnNumber + ".");
        }
    }

    public static void betFromAToZ(Scanner scanner, char awardWinningLyrics) {
        System.out.print("Digite uma letra de A a Z: ");
        char betLetter = Character.toUpperCase(scanner.next().charAt(0));
        if (!Character.isLetter(betLetter)) {
            System.out.println("Aposta inválida.");
            return;
        }

        if (betLetter == awardWinningLyrics) {
            System.out.println("Você ganhou R$ 500,00 reais.");
        } else {
            System.out.println("Que pena! A letra sorteada foi: " + awardWinningLyrics + ".");
        }
    }

    public static void betOddOrEven(Scanner scanner) {
        System.out.print("Digite um número inteiro: ");
        int numberEntered = scanner.nextInt();
        if (numberEntered % 2 == 0) {
            System.out.println("Você ganhou R$ 100,00 reais.");
        } else {
            System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
        }
    }
}