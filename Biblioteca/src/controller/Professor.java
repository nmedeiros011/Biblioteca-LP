package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Professor {
    public String arquivo = "Professor.txt";
    
    public void salvar (biblioteca.models.Professor professor) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo));
        writer.append(String.format("%s", professor.getNome()));
        writer.newLine();
        writer.close();
    }
}
