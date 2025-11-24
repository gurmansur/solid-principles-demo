package solidDemo;

/**
 * Responsável apenas por gerar o recibo
 * Demonstra Single Responsibility Principle
 */
public class GeradorRecibo {
    public void gerar(Livro livro, MetodoPagamento pagamento, double totalPago) {
        System.out.println("\n========== RECIBO DE COMPRA ==========");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Preço: R$ " + String.format("%.2f", livro.getPreco()));
        System.out.println("Método de Pagamento: " + pagamento.getNome());
        System.out.println("Total Pago: R$ " + String.format("%.2f", totalPago));
        System.out.println("======================================\n");
    }
}
