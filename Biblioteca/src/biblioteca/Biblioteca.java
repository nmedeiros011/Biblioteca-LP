package biblioteca;

import models.Livro;
import java.io.IOException;

public class Biblioteca {

    public static void main(String[] args) throws IOException {
        Cadastrar cadastro = new Cadastrar();
        models.Livro livro = new models.Livro();
        controller.Livro cLivro = new controller.Livro();
        
        
        //cadastro.cadLivro();
        cadastro.cadAluno();
        //cadastro.cadProfessor();
        
               
//        models.Livro[] l = cLivro.getAll();
//        for(models.Livro a : l){
//            System.out.println(a.getAutor());
//        }

    }
    
}
