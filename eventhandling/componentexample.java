import java.awt.*;

public class componentexample {
    public static void main(String args[]) {
        Frame f = new Frame("Frame created"); 
        Button b = new Button("button click");
        Label l = new Label("new label"); 
        Panel p = new Panel();

        b.setBounds(50, 80, 120, 130);
        l.setBounds(60, 100, 100, 110);
        
        p.setLayout(null);
        p.add(b);
        p.add(l);
        p.setBounds(0, 0, 400, 300);
        f.add(p);
        f.setSize(400, 300);
        f.setLayout(null);   
        f.setVisible(true); 
    }
}
