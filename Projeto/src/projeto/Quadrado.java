package projeto;

import java.io.Serializable;

public class Quadrado extends Ponto implements Serializable{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public Quadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    /**
     * @return the ladoA
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param ladoA the ladoA to set
     */
    public void setLadoA(double lado) {
        this.lado = lado;
    }
    public double calcArea(){
           double area = lado * lado;
           return area;
       }
    public double calcPerimetro(){
           double perimetro = lado * 4;
           return perimetro;
       }
    @Override
    public String toString() {
        return "Quadrado{"+ super.toString() + "lado=" + lado + " , area=" + calcArea() + ", perimetro="+ calcPerimetro()+'}';
    } 
}
