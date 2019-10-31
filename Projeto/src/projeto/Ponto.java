package projeto;

import java.io.Serializable;

public class Ponto implements Serializable {
  private int x,y ;

    public Ponto() {
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponto{" + "x=" + x + ", y=" + y + '}';
    }
    
} 
 
        
        
        