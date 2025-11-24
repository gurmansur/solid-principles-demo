package solidDemo;

/**
 * Interface para diferentes tipos de livros
 * Demonstra Open/Closed Principle - aberto para extensão
 */
public interface Livro {
    String getTitulo();

    String getAutor();

    double getPreco();

    int getEstoque();

    void reduzirEstoque();
}
