package solidDemo;

/**
 * Orquestrador da compra de livro
 * Demonstra Dependency Inversion - depende de abstrações (Livro,
 * MetodoPagamento)
 * Demonstra Single Responsibility - apenas coordena as ações
 */
public class ProcessadorCompraLivro {
    private CalculadoraPreco calculadora;
    private GeradorRecibo gerador;
    private ValidadorCompra validador;

    public ProcessadorCompraLivro() {
        this.calculadora = new CalculadoraPreco();
        this.gerador = new GeradorRecibo();
        this.validador = new ValidadorEstoque();
    }

    public void processar(Livro livro, MetodoPagamento pagamento) {
        if (!validador.validar(livro)) {
            return;
        }

        double preco = livro.getPreco();
        double desconto = 10; // 10% de desconto
        double precoComDesconto = calculadora.aplicarDesconto(preco, desconto);

        System.out.println("\n✓ Compra aprovada!");
        System.out.println("Preço original: R$ " + String.format("%.2f", preco));
        System.out.println("Desconto (10%): R$ " + String.format("%.2f", preco - precoComDesconto));
        System.out.println("Preço final: R$ " + String.format("%.2f", precoComDesconto));

        if (pagamento.processar(precoComDesconto)) {
            livro.reduzirEstoque();
            gerador.gerar(livro, pagamento, precoComDesconto);
            System.out.println("✓ Compra concluída com sucesso!");
        } else {
            System.out.println("❌ Falha no pagamento!");
        }
    }
}
