package palindrome;

/**
 * Responsável apenas pela exibição do resultado
 * Segue Single Responsibility Principle (SRP)
 */
public class ExibidorResultadoPalindromo {
    public void exibir(String entrada, boolean resultado) {
        System.out.println("Você entrou com: " + entrada);
        System.out.println("É palíndromo: " + resultado);
    }
}
