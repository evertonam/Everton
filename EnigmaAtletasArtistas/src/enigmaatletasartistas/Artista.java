package enigmaatletasartistas;

import java.io.Serializable;

public class Artista  implements Serializable {
    private String nomeartistico, generoprincipal;
    private char sexo;

    public Artista(String nomeartistico, String generoprincipal, char sexo) {
        this.nomeartistico = nomeartistico;
        this.generoprincipal = generoprincipal;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Artista: " + getNomeartistico() + ", gênero: " + getGeneroprincipal() + ", sexo: " + getSexo();
    }

    public String getGeneroprincipal() {
        return generoprincipal;
    }

    public void setGeneroprincipal(String generoprincipal) {
        this.generoprincipal = generoprincipal;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNomeartistico() {
        return nomeartistico;
    }

    public void setNomeartistico(String nomeartistico) {
        this.nomeartistico = nomeartistico;
    }

}
