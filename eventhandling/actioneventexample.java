import java.awt.*;
import java.awt.event.*;

class actioneventexample extends Frame implements ActionListener{
  TextField textfield;
  actioneventexample(){
    textfield=new TextField();
    textfield.setBounds(100,150,150,30);
    Button bt = new Button("click me");
    bt.setBounds(100,100,80,30);
    bt.addActionListener(this);
    add(bt);
    add(textfield);
    setSize(300,300);
    setLayout(null);
    setVisible(true);

  }
  public void actionPerformed(ActionEvent ae){
    textfield.setText("Text area");
  } 

  public static void main(String args[]){
    new actioneventexample();
  }
}