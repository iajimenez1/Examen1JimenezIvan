
package dominio;


public class Plano {
        private int x = 0;
        private int y = 0;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String verifica(){
        return this.x+""+this.y;
    }
}
