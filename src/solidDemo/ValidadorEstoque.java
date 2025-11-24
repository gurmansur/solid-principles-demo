package solidDemo;

/**
 * Valida se o livro está disponível
 * Demonstra Interface Segregation - interface específica
 */
public class ValidadorEstoque implements ValidadorCompra {
    @Override
    public boolean validar(Livro livro) {
        if (livro.getEstoque() <= 0) {
            System.out.println("❌ Livro fora de estoque!");
            return false;
        }
        return true;
    }
}
