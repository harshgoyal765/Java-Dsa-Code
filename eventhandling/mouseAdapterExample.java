import java.awt.*;
import java.awt.event.*;
public class mouseAdapterExample extends MouseAdapter{
  Frame f;
  mouseAdapterExample(){
    f= new Frame("Mouse adapter");
    
    f.addMouseListener(this);
    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
  }
  public void mouseClicked(MouseEvent e){
    Graphics g = f.getGraphics();
    g.setColor(Color.blue);
    g.fillOval(e.getX(),e.getY(),30,30);

  }
  public static void main(String args[]){
    new mouseAdapterExample();
  }
}