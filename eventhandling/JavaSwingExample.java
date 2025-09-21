// import java.awt.event.*;
// import javax.swing.*;

// public class javaswingexample{
//   javaswingexample(){
//    JFrame jf=new JFrame();
//    JButton b1= new JButton("click");
//    b1.setBounds(100,100,130,40);
//    jf.add(b1);
//    //create radio button
//    JRadioButton j1 = new JRadioButton("A");
//    JRadioButton j2 = new JRadioButton("B");
//    j1.setBounds(100,100,110,30);
//    j2.setBounds(110,120,100,20);
//    //create button group
//    ButtonGroup bg = new ButtonGroup();
//    bg.add(j1);
//    jf.add(j1);
//    JTextArea jt = new JTextArea(100,100);
//    jt.setBounds(100,110,130,40);
//    jf.add(jt);
//    jf.setVisible(true);
//    jf.setLayout(null);
//   }
//   public static void main (String args[]){
//     javaswingexample s = new javaswingexample();
//   }
// }

import java.awt.event.*;
import javax.swing.*;

public class JavaSwingExample {
    JavaSwingExample() {
        JFrame jf = new JFrame("Swing Example");
        jf.setSize(400, 400);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button
        JButton b1 = new JButton("Click Me");
        b1.setBounds(100, 50, 130, 40);
        jf.add(b1);

        // Create radio buttons
        JRadioButton j1 = new JRadioButton("A");
        JRadioButton j2 = new JRadioButton("B");
        j1.setBounds(100, 100, 110, 30);
        j2.setBounds(100, 130, 110, 30);

        // Create button group
        ButtonGroup bg = new ButtonGroup();
        bg.add(j1);
        bg.add(j2);

        jf.add(j1);
        jf.add(j2);

        // Create text area
        JTextArea jt = new JTextArea();
        jt.setBounds(100, 170, 130, 40);
        jf.add(jt);

        jf.setVisible(true);
    }

    public static void main(String args[]) {
        new JavaSwingExample();
    }
}
