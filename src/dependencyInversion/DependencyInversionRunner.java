package dependencyInversion;

import java.util.Scanner;

public class DependencyInversionRunner {
    public static void run(Scanner scanner) {
        System.out.println("\n=== Dependency Inversion Principle ===");
        System.out.println("Dependa de abstrações, não de implementações concretas.\n");

        System.out.println("Qual dispositivo deseja controlar?");
        System.out.println("1. Lâmpada");
        System.out.println("2. Ventilador");
        System.out.print("Escolha: ");

        String choice = scanner.nextLine();
        Dispositivo dispositivo = null;

        switch (choice) {
            case "1":
                dispositivo = new Lampada();
                break;
            case "2":
                dispositivo = new Ventilador();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        // O Interruptor não conhece o tipo específico do dispositivo
        Interruptor interruptor = new Interruptor(dispositivo);

        System.out.print("\nDeseja ligar o dispositivo? (s/n): ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            interruptor.acionar(true);
            System.out.println("✓ Dispositivo ligado!");
        } else {
            interruptor.acionar(false);
            System.out.println("✓ Dispositivo desligado!");
        }
    }
}
