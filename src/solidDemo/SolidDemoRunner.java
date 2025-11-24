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

        // Criando instâncias persistentes (Dependency Inversion - usamos interfaces)
        ProcessadorCompraLivro processador = new ProcessadorCompraLivro();

        // Inicializando livros uma única vez (o estoque será mantido entre compras)
        Livro livroFisico = new LivroFisico("Clean Code", "Robert C. Martin", 89.90, 5, 0.5);
        Livro livroDigital = new LivroDigital("Design Patterns", "Gang of Four", 49.90, 10);

        boolean continuarComprando = true;

        while (continuarComprando) {
            // Oferecendo opções de livros com estoque atual
            System.out.println("\n--- Catálogo de Livros ---");
            System.out.println("1. Livro Físico - Clean Code (R$ 89.90) - Estoque: " + livroFisico.getEstoque());
            System.out.println("2. Livro Digital - Design Patterns (R$ 49.90) - Estoque: " + livroDigital.getEstoque());
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha um livro: ");
            String livroChoice = scanner.nextLine();

            if (livroChoice.equals("0")) {
                continuarComprando = false;
                break;
            }

            Livro livro = null;
            switch (livroChoice) {
                case "1":
                    livro = livroFisico;
                    break;
                case "2":
                    livro = livroDigital;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
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
                    continue;
            }

            // Processando a compra
            processador.processar(livro, pagamento);

            // Perguntando se deseja continuar comprando
            System.out.print("\nDeseja comprar outro livro? (s/n): ");
            String continuarChoice = scanner.nextLine().toLowerCase();
            if (!continuarChoice.equals("s")) {
                continuarComprando = false;
            }
        }
    }
}
