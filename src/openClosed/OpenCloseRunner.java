package openClosed;

import java.util.Scanner;

public class OpenCloseRunner {
    public static void run(Scanner scanner) {
        System.out.println("\n=== Open/Closed Principle ===");
        System.out.println("Classes devem ser abertas para extensão, fechadas para modificação.\n");

        System.out.println("Qual forma deseja calcular a área?");
        System.out.println("1. Círculo");
        System.out.println("2. Retângulo");
        System.out.print("Escolha: ");

        String choice = scanner.nextLine();
        CalculadoraArea calculadora = new CalculadoraArea();

        switch (choice) {
            case "1":
                System.out.print("Entre com o raio do círculo: ");
                double raio = Double.parseDouble(scanner.nextLine());
                Forma circulo = new Circulo(raio);
                double areaCirculo = calculadora.calcularArea(circulo);
                System.out.println("Área do círculo: " + String.format("%.2f", areaCirculo));
                break;
            case "2":
                System.out.print("Entre com a largura do retângulo: ");
                double largura = Double.parseDouble(scanner.nextLine());
                System.out.print("Entre com a altura do retângulo: ");
                double altura = Double.parseDouble(scanner.nextLine());
                Forma retangulo = new Retangulo(largura, altura);
                double areaRetangulo = calculadora.calcularArea(retangulo);
                System.out.println("Área do retângulo: " + String.format("%.2f", areaRetangulo));
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
