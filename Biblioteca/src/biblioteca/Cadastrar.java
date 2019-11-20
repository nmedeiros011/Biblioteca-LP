package biblioteca;

import biblioteca.models.*;
import java.io.IOException;
import java.util.Scanner;

public class Cadastrar {
    Scanner s = new Scanner(System.in);
    
    biblioteca.models.Aluno aluno = new biblioteca.models.Aluno();
    biblioteca.models.Professor professor = new biblioteca.models.Professor();
    
    controller.Livro cLivro = new controller.Livro();
    controller.Aluno cAluno = new controller.Aluno();
    controller.Professor cProfessor = new controller.Professor();
    
    public void cadLivro() throws IOException{
        biblioteca.models.Livro livro = new biblioteca.models.Livro();
        System.out.println("Digite o titulo do livro");
        String titulo = s.next();
        
        System.out.println("Digite o nome do autor do livro");
        String autor = s.next();
        
        System.out.println("Digite o ISBN do livro");
        String isbn = s.next();
        
        System.out.println("Digite a quantidade de exemplares desse do livro");
        int qtd = s.nextInt();
        livro.setDisponivel(true);

        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setISBN(isbn);
        livro.setQuantidade(qtd);
        
        cLivro.salvar(livro);     
    }
    
    public void cadAluno(biblioteca.models.Aluno aluno) throws IOException{
        System.out.println("Digite o nome do aluno");
        aluno.setNome(s.next());
        System.out.println("Digite a data de nascimento do aluno (no formato __/__/____)");
        aluno.setDataNascimento(s.next());
        System.out.println("Digite o RA do aluno");
        aluno.setRA(s.next());
        
        cAluno.salvar(aluno);
    }
    
    public void cadProfessor(biblioteca.models.Professor professor)  throws IOException{
        System.out.println("Digite o nome do professot");
        professor.setNome(s.next());
        
        cProfessor.salvar(professor);
    }
}
