package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Livro {
    public String arquivo = "Livro.txt";
    
    public int getLast() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(arquivo));
        
        String linha = reader.readLine();
        do
            linha = reader.readLine();
        while(reader.ready());
        
        int ultimoCodigo = Integer.parseInt(linha.split(";")[0]);
        
        return ultimoCodigo;
    }
    
    public void salvar(models.Livro livro) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true));
        writer.append(String.format("%s;%s;%s;%s;%s;%s;",livro.getCodigo(), livro.getISBN(), livro.getTitulo(), livro.getAutor(), livro.getQuantidade(), livro.isDisponivel()));
        writer.newLine();
        writer.close();
    }
    
    public models.Livro[] getAll() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(arquivo));
        int counter = 0;
        
        while(reader.readLine()!= null)
            counter++;        
        
        reader = new BufferedReader(new FileReader(arquivo));
        models.Livro[] livro = new models.Livro[counter];
        
        for(int i=1;reader.ready();i++){
            livro[i]=new models.Livro();
            String linha = reader.readLine();
            livro[i].setISBN(linha.split(";")[1]);
            livro[i].setTitulo(linha.split(";")[2]);
            livro[i].setAutor(linha.split(";")[3]);
            livro[i].setQuantidade(Integer.parseInt(linha.split(";")[4]));
            livro[i].setDisponivel(Boolean.parseBoolean(linha.split(";")[5]));
        }
        
        return livro;
    }
}
