
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
            deletePoint(points.removeLast());
        } 
        
    }
    
    public void setForma(String forma) {
        this.forma=forma;
    }

    private void deletePoint(Point removeLast) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
