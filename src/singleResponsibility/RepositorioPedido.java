package singleResponsibility;

public class RepositorioPedido {
    public void salvarNoBanco(double valor) {
        System.out.println("✓ Pedido salvo no banco de dados com valor: R$ " + String.format("%.2f", valor));
    }
}
