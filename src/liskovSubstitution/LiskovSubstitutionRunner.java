package liskovSubstitution;

import java.util.Scanner;

public class LiskovSubstitutionRunner {
    public static void run(Scanner scanner) {
        System.out.println("\n=== Liskov Substitution Principle ===");
        System.out.println("Subclasses devem ser substituíveis por suas superclasses.\n");

        System.out.println("Qual pássaro você quer usar?");
        System.out.println("1. Pardal (voa)");
        System.out.println("2. Pinguim (não voa)");
        System.out.print("Escolha: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                Passaro pardal = new Pardal();
                pardal.bicar();

                if (pardal instanceof Voador) {
                    Voador voador = (Voador) pardal;
                    voador.voar();
                }
                break;
            case "2":
                Passaro pinguim = new Pinguim();
                pinguim.bicar();
                System.out.println("Pinguim: Não posso voar, mas consigo nadar!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
