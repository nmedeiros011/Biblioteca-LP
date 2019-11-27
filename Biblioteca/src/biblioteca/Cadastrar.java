package biblioteca;

import java.io.IOException;
import java.util.Scanner;

public class Cadastrar {
    Scanner s = new Scanner(System.in);
    
    models.Aluno aluno = new models.Aluno();
    models.Professor professor = new models.Professor();
    
    controller.Livro cLivro = new controller.Livro();
    controller.Aluno cAluno = new controller.Aluno();
    controller.Professor cProfessor = new controller.Professor();
    
    public void cadLivro(String titulo, String autor, String isbn, int qtd) throws IOException{
        models.Livro livro = new models.Livro();
        
        int codigo = cLivro.getLast();
        codigo++;
        
        //System.out.println("Digite o titulo do livro");
        //String titulo = s.nextLine();
        
        //System.out.println("Digite o nome do autor do livro");
        //String autor = s.nextLine();
        
        //System.out.println("Digite o ISBN do livro");
        //String isbn = s.nextLine();
        
        //System.out.println("Digite a quantidade de exemplares desse do livro");
        //int qtd = s.nextInt();

        livro.setCodigo(codigo);
        livro.setISBN(isbn);
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setQuantidade(qtd);
        livro.setDisponivel(true);
        
        cLivro.salvar(livro);     
    }
    
    public void cadAluno(String nome, String dataN, String RA) throws IOException{
        
        //TO-DO:::::::adicionar o campo bloqueado, para quando o aluno nao puder pegar livro
        int codigo = cAluno.getLast();
        codigo++;
        models.Aluno aluno = new models.Aluno();
        
        //System.out.println("Digite o nome do aluno");
        //String nome = s.nextLine();
        //System.out.println("Digite a data de nascimento do aluno (no formato __/__/____)");
        //String dataN = s.nextLine();
        //System.out.println("Digite o RA do aluno");
        //String RA = s.nextLine();
        
        aluno.setCodigo(codigo);
        aluno.setNome(nome);
        aluno.setDataNascimento(dataN);
        aluno.setRA(RA);
                
        cAluno.salvar(aluno);
    }
    
    public void cadProfessor(String nomeProf)  throws IOException{
        models.Professor professor = new models.Professor();
        int codigo = cProfessor.getLast();
        codigo++;
        professor.setCodigo(codigo);
        //System.out.println("Digite o nome do professor");
        professor.setNome(nomeProf);
        
        cProfessor.salvar(professor);
    }
}
