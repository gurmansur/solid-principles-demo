package solidDemo;

/**
 * Interface para pagamento
 * Demonstra Dependency Inversion Principle - depende de abstração
 */
public interface MetodoPagamento {
    boolean processar(double valor);

    String getNome();
}
