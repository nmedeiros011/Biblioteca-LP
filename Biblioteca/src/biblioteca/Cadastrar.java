package biblioteca;

import java.io.IOException;

public class Cadastrar {

    models.Aluno aluno = new models.Aluno();
    models.Professor professor = new models.Professor();
    models.Livro livro = new models.Livro();

    controller.Livro cLivro = new controller.Livro();
    controller.Aluno cAluno = new controller.Aluno();
    controller.Professor cProfessor = new controller.Professor();

    public void cadLivro(String titulo, String autor, String isbn, int qtd) throws IOException {

        int codigo = cLivro.getLast();
        codigo++;

        livro.setCodigo(codigo);
        livro.setISBN(isbn);
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setQuantidade(qtd);
        livro.setDisponivel(true);

        cLivro.salvar(livro);
    }

    public void cadAluno(String nome, String dataN, String RA) throws IOException {

        //TO-DO:::::::adicionar o campo bloqueado, para quando o aluno nao puder pegar livro
        int codigo = cAluno.getLast();
        codigo++;

        aluno.setCodigo(codigo);
        aluno.setNome(nome);
        aluno.setDataNascimento(dataN);
        aluno.setRA(RA);

        cAluno.salvar(aluno);
    }

    public void cadProfessor(String nomeProf) throws IOException {

        int codigo = cProfessor.getLast();
        codigo++;

        professor.setCodigo(codigo);
        professor.setNome(nomeProf);

        cProfessor.salvar(professor);
    }
}
