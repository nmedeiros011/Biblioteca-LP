package biblioteca;

import biblioteca.models.*;
import java.io.IOException;
import java.util.Scanner;

public class Cadastrar {
    Scanner s = new Scanner(System.in);
    biblioteca.models.Livro livro = new biblioteca.models.Livro();
    biblioteca.models.Aluno aluno = new biblioteca.models.Aluno();
    biblioteca.models.Professor professor = new biblioteca.models.Professor();
    
    controller.Livro cLivro = new controller.Livro();
    controller.Aluno cAluno = new controller.Aluno();
    controller.Professor cProfessor = new controller.Professor();
    
    public void cadLivro(biblioteca.models.Livro livro) throws IOException{
        System.out.println("Digite o titulo do livro");
        livro.setTitulo(s.next());
        System.out.println("Digite o nome do autor do livro");
        livro.setAutor(s.next());
        System.out.println("Digite o ISBN do livro");
        livro.setISBN(s.next());
        System.out.println("Digite o ISBN do livro");
        livro.setQuantidade(s.nextInt());
        livro.setDisponivel(true);
        
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
