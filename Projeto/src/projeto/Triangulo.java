package projeto;

import java.io.Serializable;

public class Triangulo extends Ponto implements Serializable{
    private double base,altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(int x, int y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
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
          double area = (getBase() * getAltura())/2;
          return area;
      }
      
    public double calcPerimetro(){
          double perimetro  =  getBase() * 3;
          return perimetro;
      }

    @Override
    public String toString() {
        return "Triangulo{" + super.toString() + "base=" + base + ", altura=" + altura + '}' + ", a area=" + calcArea() + " ,perimetro=" + calcPerimetro();
    }    
}
