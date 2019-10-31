package enigmaatletasartistas;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EnigmaAtletasArtistas {
    private ArrayList pessoas = new ArrayList();
    
    public static void main(String[] args) {
        new EnigmaAtletasArtistas();
    }
    
    public EnigmaAtletasArtistas() {
        
        pessoas.add(new Artista("Trevor","Rock",'M'));
         mostrarPessoasCadastradas();
         salvar("C:/temp/trabs.dat", pessoas);
         carregar("C:/temp/trabs.dat", pessoas);

        mostrarPessoasCadastradas ();
    }
    
    
    public void LeituradeDados(){
        pessoas.add(new Artista("Trevor","Rock",'M'));
        pessoas.add(new Atleta("Bolt","Corredor",'M'));
        pessoas.add(new Artista("Amanda","Rock",'F'));
        pessoas.add(new Atleta("Hoawrd","Atletismo",'M'));
        pessoas.add(new Artista("Jorge","MBP",'M'));
        
    }
    
    public void mostrarPessoasCadastradas () {
        String cad = "";
        for (int i=0; i < pessoas.size(); i++) {
        cad += pessoas.get(i).toString()+ "\n";

    }    
    } 
    public boolean salvar (String filename, ArrayList arrlist) {
 // Este método gravará no arquivo filename o conteúdo de arrlist
    try{
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fos);
            for (int i=0; i<arrlist.size(); i++) {
            out.writeObject( arrlist.get(i) ); // gravamos o objeto no arquivo
 }
        out.close();
        fos.close();
        } catch(Exception ex){
             JOptionPane.showMessageDialog(null, "Erro salvando objetos... "
            + ex.getMessage());
        return false; // se deu algum erro, retornaremos false
    }
        return true; // deu tudo certo, retornaremos true
    } // fim do método salvar
        


        public boolean carregar (String filename, ArrayList arrlist) {
    //Este método carrega os objetos serializados gravados em 'filename' no vetor arrlist.
        FileInputStream fis;
            ObjectInputStream in;
                try {
                 fis = new FileInputStream(filename);
                in = new ObjectInputStream(fis);
                arrlist.clear(); // esvaziamos o ArrayList
                boolean sair = false;
                do {
                try {
                Object info = in.readObject(); // lê um objeto do arquivo
                    arrlist.add(info); // adiciona na lista o objeto lido
                    }
                    catch (EOFException normalEof) { // EOF (end of file), é uma situação normal => acabaram os objetos
                     sair=true;
                     }
                     } while (!sair);
                        in.close(); fis.close();
                        } catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Erro carregando objetos... " + e.getMessage());
                        return false;
                        }
                         return true;
}
        
}