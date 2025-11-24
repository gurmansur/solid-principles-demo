package solidDemo;

/**
 * Implementação de livro digital
 * Demonstra Liskov Substitution Principle - pode substituir Livro
 */
public class LivroDigital implements Livro {
    private String titulo;
    private String autor;
    private double preco;
    private int estoque; // Quantidade de cópias disponíveis

    public LivroDigital(String titulo, String autor, double preco, int estoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.estoque = estoque;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public int getEstoque() {
        return estoque;
    }

    @Override
    public void reduzirEstoque() {
        if (estoque > 0) {
            estoque--;
        }
    }

    public long getTamanhoArquivo() {
        return 5000; // KB
    }
}
