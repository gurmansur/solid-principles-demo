package solidDemo;

/**
 * Pagamento com cartão
 * Demonstra Liskov Substitution Principle
 */
public class PagamentoCartao implements MetodoPagamento {
    @Override
    public boolean processar(double valor) {
        System.out.println("  Processando pagamento com cartão de R$ " + String.format("%.2f", valor));
        return true;
    }

    @Override
    public String getNome() {
        return "Cartão de Crédito";
    }
}
