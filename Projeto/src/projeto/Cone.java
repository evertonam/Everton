package projeto;

import java.io.Serializable;

public class Cone extends Ponto implements Serializable{
    private double raio, altura, geratriz;

    public Cone() {
    }

    public Cone(double raio, double altura, double geratriz) {
        this.raio = raio;
        this.altura = altura;
        this.geratriz = geratriz;
    }

    public Cone(int x, int y, double raio, double altura, double geratriz) {
        super(x, y);
        this.raio = raio;
        this.altura = altura;
        this.geratriz = geratriz;
    }

    /**
     * @return the raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
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

    public double getGeratriz() {
        return geratriz;
    }

    public void setGeratriz(double geratriz) {
        this.geratriz = geratriz;
    }
    
    public double calcArea(){
        double area = Math.PI* Math.pow(getRaio(),2);
        return area;
    }
   
    public double calcVolume(){
        double volume = (Math.PI* Math.pow(getRaio(),2)* getAltura())/3;
        return volume;
    }
    
    @Override
    public String toString() {
        return "Cone{"+ super.toString() + "raio=" + raio + ", altura=" + altura + '}'+ ", area=" + calcArea() + " , volume=" + calcVolume();
    }
   

}
