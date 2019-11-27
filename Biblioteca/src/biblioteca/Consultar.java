package biblioteca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Consultar {

    public models.Livro[] consLivro(String busca, int campoBusca) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("Livro.txt"));

        String linha = "";
        ArrayList<String> livros = new ArrayList();

        while ((linha = reader.readLine()) != null) {
            if (linha.split(";")[campoBusca].equals(busca)) {
                livros.add(linha);
            }
        }

        models.Livro[] livro = new models.Livro[livros.size()];

        int i = 0;
        for (String l : livros) {
            livro[i] = new models.Livro();
            livro[i].setISBN(l.split(";")[1]);
            livro[i].setTitulo(l.split(";")[2]);
            livro[i].setAutor(l.split(";")[3]);
            livro[i].setQuantidade(Integer.parseInt(l.split(";")[4]));
            livro[i].setDisponivel(Boolean.parseBoolean(l.split(";")[5]));
            i++;
        }

        return livro;
    }
}
