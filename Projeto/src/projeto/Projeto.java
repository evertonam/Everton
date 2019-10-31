package projeto;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Projeto implements Serializable {
    ArrayList figuras = new ArrayList();
    
    public static void main(String[] args) {
     new Projeto();   
    }
     
    public Projeto(){    
        carregar("C:/temp/projeto.dat", figuras);
           mostrarFigurasCadastradas ();
        salvar("\"C:/temp/projeto.dat\"", figuras);
         cadastrarFiguras();
         
       
         
       
       
       
    
    }
    
    
    
    public void cadastrarFiguras(){
        int opc;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione a figura a ser cadastrada: \n 1. Triangulo \n 2. Quadrado \n 3. Paralelepipedo \n 4. Cilindro \n 5. Cone","Cadastro de Figura", JOptionPane.INFORMATION_MESSAGE));
            switch(opc) {
                case 1:
                    // Criar um Triangulo
                    int xt,yt;
                    double baset, alturat;
                    xt = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a coordenada X do Triangulo:", "X do Triangulo", JOptionPane.INFORMATION_MESSAGE));
                    yt = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a coordenada Y do Triangulo:", "Y do Triangulo", JOptionPane.INFORMATION_MESSAGE));
                    baset = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Base do Triangulo:", "Base do Triangulo", JOptionPane.INFORMATION_MESSAGE));
                    alturat = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Altura do Triangulo:", "Altura do Triangulo", JOptionPane.INFORMATION_MESSAGE));
                
                    Triangulo tri = new Triangulo(xt,yt,baset, alturat);
                    figuras.add(tri);
                    JOptionPane.showMessageDialog(null, "Triangulo Cadastrado!");
                    
                    for(int i = 0; i < figuras.size(); i++){
                        System.out.println(figuras.get(i).toString());
                    }
                    
                    break;
                case 2:
                    // Criar um Quadrado
                    int xq,yq;
                    double ladoq;
                    
                    xq = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a coordenada X do Quadrado:", "X do Quadrado", JOptionPane.INFORMATION_MESSAGE));
                    yq = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a coordenada Y do Quadrado:", "Y do Quadrado", JOptionPane.INFORMATION_MESSAGE));
                    ladoq = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do Lado do Quadrado:", "Lado do Quadrado", JOptionPane.INFORMATION_MESSAGE));     
                
                    Quadrado qua = new Quadrado(xq,yq,ladoq);
                    figuras.add(qua);
                    JOptionPane.showMessageDialog(null, "Quadrado Cadastrado!");
                    
                    for(int i = 0; i < figuras.size(); i++){
                        System.out.println(figuras.get(i).toString());
                    }
                    break;
                case 3:
                    //Cadastrar Paralelepipedo
                    int xp,yp;
                    double comprimentop, largurap,profundidadep;
                    
                    xp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a coordenada X do Paralelepipedo:", "X do Paralelepipedo", JOptionPane.INFORMATION_MESSAGE));
                    yp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a coordenada Y do Paralelepipedo:", "Y do Paralelepipedo", JOptionPane.INFORMATION_MESSAGE));
                    comprimentop = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do comprimento do Paralelepipedo:", "Comprimento do Paralelepipedo", JOptionPane.INFORMATION_MESSAGE));
                    largurap = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Largura do Paralelepipedo:", "Largura do Paralelepipedo", JOptionPane.INFORMATION_MESSAGE));
                    profundidadep = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Profundidade do Paralelepipedo:", "Profundidade do Paralelepipedo", JOptionPane.INFORMATION_MESSAGE));
                    
                    Paralelepipedo par = new Paralelepipedo(xp,yp,comprimentop, largurap, profundidadep);
                    figuras.add(par);
                    JOptionPane.showMessageDialog(null, "Paralelepipedo Cadastrado!");
                    
                    for(int i = 0; i < figuras.size(); i++){
                        System.out.println(figuras.get(i).toString());
                    }
                    break;
                case 4:
                    //Cadastrar cilindro
                    int xc, yc;
                    double raioc, alturac;
                    
                    xc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a coordenada X do Cilindro:", "X do Cilindro", JOptionPane.INFORMATION_MESSAGE));
                    yc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a coordenada Y do Cilindro:", "Y do Cilindro", JOptionPane.INFORMATION_MESSAGE));
                    raioc = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do Raio do Cilindro:", "Raio do Cilindro", JOptionPane.INFORMATION_MESSAGE));
                    alturac = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Altura do Cilindro:", "Altura do Cilindro", JOptionPane.INFORMATION_MESSAGE));
                    
                    Cilindro cil = new Cilindro(xc, yc, raioc, alturac);
                    figuras.add(cil);
                    JOptionPane.showMessageDialog(null, "Cilindro Cadastrado!");
                    
                    for(int i = 0; i < figuras.size(); i++){
                        System.out.println(figuras.get(i).toString());
                    }
                    break;
                case 5:
                    //Cadastrar Cone
                    int xo, yo;
                    double raioo, alturao, geratrizo;
                    
                    xo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a coordenada X do Cone:", "X do Cone", JOptionPane.INFORMATION_MESSAGE));
                    yo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a coordenada Y do Cone:", "Y do Cone", JOptionPane.INFORMATION_MESSAGE));
                    raioo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do Raio do Cone:", "Raio do Cone", JOptionPane.INFORMATION_MESSAGE));
                    alturao = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Altura do Cone:", "Altura do Cone", JOptionPane.INFORMATION_MESSAGE));
                    geratrizo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Geratriz do Cone:", "Altura do Cone", JOptionPane.INFORMATION_MESSAGE));                    
                    
                    Cone con = new Cone(xo, yo, raioo, alturao, geratrizo);
                    figuras.add(con);
                    
                    JOptionPane.showMessageDialog(null,"Cone Cadastrado");
                    
                    for(int i = 0; i < figuras.size(); i++){
                        System.out.println(figuras.get(i).toString());
                    }
                    break;
            }
        
        } while (true);
     
        
    
    }
    
         public void mostrarFigurasCadastradas () {
              String cad = "";
        for (int i = 0; i < figuras.size(); i++) {
            cad += figuras.get(i).toString() + "\n";
        }
        JTextArea outputArea = new JTextArea(15, 50);  //15 linhas e 50 colunas
        outputArea.setText(cad);
        JScrollPane rolagem = new JScrollPane(outputArea);
        JOptionPane.showMessageDialog(null, rolagem, "Dados das figuras cadastradas",
                JOptionPane.INFORMATION_MESSAGE);
 
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