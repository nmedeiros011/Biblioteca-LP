package biblioteca.models;


public class Aluno {
    String nome;
    String dataNascimento;
    String RA;
    
    Aluno(){
        this("","","");
    }
    
    Aluno(String nome, String dNasc, String RA){
        this.nome = nome;
        this.dataNascimento = dNasc;
        this.RA = RA;
    }
    
}
