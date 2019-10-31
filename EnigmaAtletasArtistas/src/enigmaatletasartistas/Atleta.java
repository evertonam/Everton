package enigmaatletasartistas;

import java.io.Serializable;

public class Atleta implements Serializable {
    private String nome, especialidade;
    private char sexo;

    public Atleta(String nome, String especialidade, char sexo) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Atleta: " + getNome() + ", especialidade: " + getEspecialidade() + ", sexo: " + getSexo();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
 
}
