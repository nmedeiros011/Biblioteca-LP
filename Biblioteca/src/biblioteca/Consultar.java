package biblioteca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Consultar {
    
    public models.Livro[] consLivro(String busca, int campoBusca) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("Livro.txt"));
        
        int counter = 0;
        while(reader.readLine()!= null)
            counter++;  

        models.Livro[] livro = new models.Livro[counter];

        int i = 0;
        while(!reader.ready()){
            String linha = reader.readLine();
            if(linha.split(";")[campoBusca].equals(busca)){
                livro[i]=new models.Livro();
                livro[i].setISBN(linha.split(";")[1]);
                livro[i].setTitulo(linha.split(";")[2]);
                livro[i].setAutor(linha.split(";")[3]);
                livro[i].setQuantidade(Integer.parseInt(linha.split(";")[4]));
                livro[i].setDisponivel(Boolean.parseBoolean(linha.split(";")[5]));
                i++;
            }
            
        }
        
        return livro;
    }
    
}
