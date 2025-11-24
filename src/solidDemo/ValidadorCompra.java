package solidDemo;

/**
 * Responsável apenas por validar a compra
 * Demonstra Single Responsibility Principle e Interface Segregation
 */
public interface ValidadorCompra {
    boolean validar(Livro livro);
}
