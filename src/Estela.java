
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;
import java.util.Deque;

public class Estela{

    private Deque<Point> points;
    private String forma;
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    
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

       
    public void printPoints(Graphics graphics) throws InterruptedException{
        graphics.setColor(color);
        for (Point point : points) {
            
            switch(forma){
            
                case "Círculo":graphics.fillOval((int)point.getX(),(int)point.getY(),10,10);
                    break;
                case "Cuadrado":graphics.fillRect((int)point.getX(),(int)point.getY(),10,10);
                    break;
                case "X":graphics.drawString("X", (int)point.getX(),(int)point.getY());
            }   
            Thread.sleep(10);
        }
    }

    void clearPoints() {
        points.clear();
    }


}
