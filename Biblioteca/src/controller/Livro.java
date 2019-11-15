package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Livro {
    public String arquivo = "Aluno.txt";
    
    public void salvar(biblioteca.models.Livro livro) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true));
        writer.append(String.format("%s;%s;%s;%s;%s", livro.getISBN(), livro.getTitulo(), livro.getAutor(), livro.getQuantidade(), livro.isDisponivel()));
        writer.newLine();
        writer.close();
    }
    
    public biblioteca.models.Livro[] getAll() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(arquivo));
        int counter = 0;
        
        while(reader.readLine()!= null)
            counter++;        
        
        reader = new BufferedReader(new FileReader(arquivo));
        biblioteca.models.Livro[] livro = new biblioteca.models.Livro[counter];
        
        for(int i=0;reader.ready();i++){
            livro[i]=new biblioteca.models.Livro();
            String linha = reader.readLine();
            livro[i].setISBN(linha.split(";")[0]);
            livro[i].setTitulo(linha.split(";")[1]);
            livro[i].setAutor(linha.split(";")[2]);
            livro[i].setQuantidade(Integer.parseInt(linha.split(";")[3]));
            livro[i].setDisponivel(Boolean.parseBoolean(linha.split(";")[4]));            
        }
        
        return livro;
    }
}
