
import java.awt.Point;
import java.util.LinkedList;
import java.util.Deque;

public class Estela {

    private Deque<Point> points;
    private String forma;

    
    public Estela(){
        points = new LinkedList<>();
        forma = "Círculo";
        
    }

    public void setPoints(Point point) {
        points.addFirst(point);
        if(points.size()>5){
            points.removeLast();
        } 
        
    }
    
    public void setForma(String forma) {
        this.forma=forma;
    }
    
}
