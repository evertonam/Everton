package projeto;

import java.io.Serializable;

public class Paralelepipedo extends Ponto implements Serializable{
    private double comprimento, largura, altura; 
    
    public Paralelepipedo() {
    }

    public Paralelepipedo(double comprimento, double largura, double altura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public Paralelepipedo(int x, int y, double comprimento, double largura, double altura) {
        super(x, y);
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    /**
     * @return the comprimento
     */
    public double getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * @return the largura
     */
    public double getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(double largura) {
        this.largura = largura;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcArea(){
        double area = 2*(getAltura()+ getLargura() + getComprimento());
        return area;
    }
    public double calcVolume(){
        double volume = getAltura()*getLargura()*getComprimento();
        return volume;
    }

    @Override
    public String toString() {
        return "Paralelepipedo{" + super.toString() +"comprimento=" + comprimento + ", largura=" + largura + ", altura=" + altura + '}' + " ,area=" + calcArea() + " , volume=" + calcVolume();     
    }
    
    
    
}
