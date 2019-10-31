package projeto;

import java.io.Serializable;

    public class Cilindro extends Ponto implements Serializable{
    private double raio, altura;

    public Cilindro() {
    }

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public Cilindro(int x, int y, double raio, double altura) {
        super(x, y);
        this.raio = raio;
        this.altura = altura;
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
    
    public double calcArea(){
        double area = 2*Math.PI*getRaio()*(getAltura()+getRaio());
        return area;
    }
    
    public double calcVolume(){
        double volume = getAltura()*Math.PI * Math.pow(getRaio(),2);
        return volume;
    }

    @Override
    public String toString() {
        return "Cilindro{" + super.toString() + "raio=" + raio + ", altura=" + altura + '}' + " , area=" + calcArea() + " ,volume=" + calcVolume();
    }
    
    
    
}
