package palindrome;

/**
 * Responsável apenas pela verificação de palíndromos
 * Segue Single Responsibility Principle (SRP)
 */
public class VerificadorPalindromo {
    public boolean verificar(String str) {
        for (int i = 0; i < str.length() / 2; ++i) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
