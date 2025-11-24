package solidDemo;

/**
 * Responsável apenas por calcular o preço total
 * Demonstra Single Responsibility Principle
 */
public class CalculadoraPreco {
    public double calcularTotal(double preco, int quantidade) {
        return preco * quantidade;
    }

    public double aplicarDesconto(double valor, double percentualDesconto) {
        return valor * (1 - percentualDesconto / 100);
    }
}
