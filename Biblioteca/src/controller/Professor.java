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
        int counter = 0;
        while(reader.readLine()!= null)
            counter++;
        int ultimoCodigo = 0;
        if(reader.ready()){
            String linha = reader.readLine();
            ultimoCodigo = Integer.parseInt(linha.split(";")[0]);
        }
        
        return ultimoCodigo;
    }
    
    public void salvar (models.Professor professor) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo));
        writer.append(String.format("%s;", professor.getNome()));
        writer.newLine();
        writer.close();
    }
}
