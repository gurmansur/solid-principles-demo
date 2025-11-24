package palindrome;

import java.util.Scanner;

/**
 * Runner responsável por orquestrar o fluxo de entrada e processamento do
 * palíndromo
 * Utiliza composição ao invés de herança (Dependency Inversion)
 */
public class PalindromeRunner {
    private VerificadorPalindromo verificador;
    private ExibidorResultadoPalindromo exibidor;

    public PalindromeRunner() {
        this.verificador = new VerificadorPalindromo();
        this.exibidor = new ExibidorResultadoPalindromo();
    }

    public void run(Scanner scanner) {
        System.out.println("\n=== Palindrome Checker ===");
        System.out.println("Verifica se uma string é um palíndromo.\n");

        System.out.print("Entre com uma string: ");
        String userInput = scanner.nextLine();

        boolean isPalindrome = verificador.verificar(userInput);

        exibidor.exibir(userInput, isPalindrome);
    }
}
