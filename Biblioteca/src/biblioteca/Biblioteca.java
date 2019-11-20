package biblioteca;

import biblioteca.models.Livro;
import java.io.IOException;

public class Biblioteca {

    public static void main(String[] args) throws IOException {
        biblioteca.models.Livro livro = new biblioteca.models.Livro();
        controller.Livro cLivro = new controller.Livro();
        
//        
//        livro.setTitulo("harry potter");
//        livro.setAutor("JK rowling");
//        livro.setISBN("123456789");
//        livro.setQuantidade(5);
//        livro.setDisponivel(true);
//        
//        cLivro.salvar(livro);
        Cadastrar.cadLivro cadLivro = new Cadastrar.cadLivro();
        
               
        biblioteca.models.Livro[] l = cLivro.getAll();
        for(biblioteca.models.Livro a : l){
            System.out.println(a.getAutor());
        }
    }
    
}
