package solidDemo;

/**
 * Implementação de livro físico
 * Demonstra Liskov Substitution Principle - pode substituir Livro
 */
public class LivroFisico implements Livro {
    private String titulo;
    private String autor;
    private double preco;
    private int estoque;
    private double peso;

    public LivroFisico(String titulo, String autor, double preco, int estoque, double peso) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.estoque = estoque;
        this.peso = peso;
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

    public double getPeso() {
        return peso;
    }
}
