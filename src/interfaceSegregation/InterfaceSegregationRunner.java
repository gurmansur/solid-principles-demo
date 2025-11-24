package interfaceSegregation;

import java.util.Scanner;

public class InterfaceSegregationRunner {
    public static void run(Scanner scanner) {
        System.out.println("\n=== Interface Segregation Principle ===");
        System.out.println("Clientes não devem depender de interfaces que não usam.\n");

        System.out.println("Qual entidade você quer usar?");
        System.out.println("1. Funcionário (trabalha e bebe água)");
        System.out.println("2. Robô (apenas trabalha)");
        System.out.print("Escolha: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println("\n--- Funcionário ---");
                Funcionario funcionario = new Funcionario();
                System.out.print("Quantas horas o funcionário vai trabalhar? ");
                int horasFuncionario = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < horasFuncionario; i++) {
                    funcionario.trabalhar();
                }
                funcionario.beberAgua();
                break;
            case "2":
                System.out.println("\n--- Robô ---");
                Robo robo = new Robo();
                System.out.print("Quantas horas o robô vai trabalhar? ");
                int horasRobo = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < horasRobo; i++) {
                    robo.trabalhar();
                }
                System.out.println("Robô: Não preciso de água!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
