package solidDemo;

/**
 * Pagamento com dinheiro
 * Demonstra Liskov Substitution Principle
 */
public class PagamentoDinheiro implements MetodoPagamento {
    @Override
    public boolean processar(double valor) {
        System.out.println("  Processando pagamento em dinheiro de R$ " + String.format("%.2f", valor));
        return true;
    }

    @Override
    public String getNome() {
        return "Dinheiro";
    }
}
