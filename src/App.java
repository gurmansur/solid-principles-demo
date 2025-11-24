import java.util.Scanner;
import singleResponsibility.SingleResponsabilityRunner;
import openClosed.OpenCloseRunner;
import liskovSubstitution.LiskovSubstitutionRunner;
import interfaceSegregation.InterfaceSegregationRunner;
import dependencyInversion.DependencyInversionRunner;
import palindrome.PalindromeRunner;
import solidDemo.SolidDemoRunner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        PalindromeRunner palindromeRunner = new PalindromeRunner();

        while (running) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Palindrome Checker");
            System.out.println("2. Demo Integrada - Todos os Princípios SOLID");
            System.out.println("");
            System.out.println("\n=== PRINCÍPIOS SOLID ===");
            System.out.println("3. Single Responsibility Principle");
            System.out.println("4. Open/Closed Principle");
            System.out.println("5. Liskov Substitution Principle");
            System.out.println("6. Interface Segregation Principle");
            System.out.println("7. Dependency Inversion Principle");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    palindromeRunner.run(scanner);
                    break;
                case "2":
                    SolidDemoRunner.run(scanner);
                    break;
                case "3":
                    SingleResponsabilityRunner.run(scanner);
                    break;
                case "4":
                    OpenCloseRunner.run(scanner);
                    break;
                case "5":
                    LiskovSubstitutionRunner.run(scanner);
                    break;
                case "6":
                    InterfaceSegregationRunner.run(scanner);
                    break;
                case "7":
                    DependencyInversionRunner.run(scanner);
                    break;
                case "0":
                    running = false;
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}