package solidDemo;

import java.util.Scanner;

/**
 * Runner para demonstração integrada de todos os princípios SOLID
 * 
 * Demonstra:
 * 1. Single Responsibility - Classes com responsabilidades bem definidas
 * 2. Open/Closed - Interfaces Livro e MetodoPagamento abertas para extensão
 * 3. Liskov Substitution - LivroFisico e LivroDigital substituem Livro
 * 4. Interface Segregation - Interfaces específicas (ValidadorCompra)
 * 5. Dependency Inversion - Depende de abstrações, não de implementações
 */
public class SolidDemoRunner {
    public static void run(Scanner scanner) {
        System.out.println("\n=== DEMONSTRAÇÃO INTEGRADA DE PRINCÍPIOS SOLID ===");
        System.out.println("Sistema de Compra de Livros\n");

        // Criando instâncias (Dependency Inversion - usamos interfaces)
        ProcessadorCompraLivro processador = new ProcessadorCompraLivro();

        // Oferecendo opções de livros
        System.out.println("Escolha um livro:");
        System.out.println("1. Livro Físico - Clean Code (R$ 89.90)");
        System.out.println("2. Livro Digital - Design Patterns (R$ 49.90)");
        System.out.print("Escolha: ");
        String livroChoice = scanner.nextLine();

        Livro livro = null;
        switch (livroChoice) {
            case "1":
                livro = new LivroFisico("Clean Code", "Robert C. Martin", 89.90, 5, 0.5);
                break;
            case "2":
                livro = new LivroDigital("Design Patterns", "Gang of Four", 49.90, 10);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        // Oferecendo opções de pagamento
        System.out.println("\nEscolha o método de pagamento:");
        System.out.println("1. Cartão de Crédito");
        System.out.println("2. Dinheiro");
        System.out.print("Escolha: ");
        String pagamentoChoice = scanner.nextLine();

        MetodoPagamento pagamento = null;
        switch (pagamentoChoice) {
            case "1":
                pagamento = new PagamentoCartao();
                break;
            case "2":
                pagamento = new PagamentoDinheiro();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        // Processando a compra
        processador.processar(livro, pagamento);
    }
}
