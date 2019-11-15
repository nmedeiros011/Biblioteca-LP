
package biblioteca.models;

public class Livro  {
    String ISBN;
    String titulo;
    String autor;
    int quantidade;
    boolean disponivel;
    
//    Livro(String isbn, String titulo, String autor, int quantidade, boolean disponivel){
//        this.ISBN = isbn;
//        this.titulo = titulo;
//        this.autor = autor;
//        this.quantidade = quantidade;
//        this.disponivel = disponivel;
//    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    
}
