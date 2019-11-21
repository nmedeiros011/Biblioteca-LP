package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Professor {
    public String arquivo = "Professor.txt";
    
    public int getLast() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(arquivo));
        
        String linha = reader.readLine();
        do
            linha = reader.readLine();
        while(reader.ready());
        
        int ultimoCodigo = Integer.parseInt(linha.split(";")[0]);
        
        return ultimoCodigo;
    }
    
    public void salvar (models.Professor professor) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true));
        writer.append(String.format("%s;%s;", professor.getCodigo(), professor.getNome()));
        writer.newLine();
        writer.close();
    }
}
