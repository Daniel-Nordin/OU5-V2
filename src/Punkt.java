import java.lang.*;

public class Punkt {

    String namn;
    int x;
    int y;

    public Punkt (){}

    public Punkt (String namn, int x, int y){

        this.namn = namn;
        this.x = x;
        this.y = y;
    }

    public Punkt (Punkt p2){
        this.namn = p2.getNamn();
        this.x = p2.getX();
        this.y = p2.getY();
    }

    public String getNamn(){
        return this.namn;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public double avstand (Punkt p2){
        return Math.sqrt(Math.pow(this.x - p2.getX(), 2) + Math.pow(this.y - p2.getY(), 2));
    }

    public boolean equals(Punkt p2){
        if (this.namn == p2.getNamn() && this.x == p2.getX() && this.y == p2.getY())
            return true;
        else
            return false;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public String toString(){
        String s = "(" + this.namn + " " + this.x + " " + this.y + ") ";
        return s;
    }


}
