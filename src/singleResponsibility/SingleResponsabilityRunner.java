package singleResponsibility;

import java.util.Scanner;

public class SingleResponsabilityRunner {
    public static void run(Scanner scanner) {
        System.out.println("\n=== Single Responsibility Principle ===");
        System.out.println("Cada classe deve ter uma única responsabilidade.\n");

        System.out.print("Entre com o valor do pedido: R$ ");
        double valorPedido = Double.parseDouble(scanner.nextLine());

        // Classe responsável apenas por calcular
        CalculadoraPedido calculadora = new CalculadoraPedido();
        double valorTotal = calculadora.calcularValorTotal(valorPedido);

        System.out.println("Valor total calculado: R$ " + String.format("%.2f", valorTotal));

        // Classe responsável apenas por salvar
        RepositorioPedido repositorio = new RepositorioPedido();
        repositorio.salvarNoBanco(valorTotal);

        // Classe responsável apenas por imprimir
        ImpressoraNotaFiscal impressora = new ImpressoraNotaFiscal();
        impressora.imprimirNotaFiscal(valorPedido, valorTotal);
    }
}
