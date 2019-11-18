package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aluno {
    public String arquivo = "Aluno.txt";
    
    public void salvar (biblioteca.models.Aluno aluno) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo));
        writer.append(String.format("%s%s%s", aluno.getNome(), aluno.getDataNascimento(), aluno.getRA()));
        writer.newLine();
        writer.close();
    }
    
}
