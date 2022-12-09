package swing04;

import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class Win4 extends JFrame {
  class Listener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      System.out.println("클릭");
    }


  }


  JButton jb = new JButton("클릭");

  Win4() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container c = this.getContentPane();
    c.setLayout(null);
    jb.setBounds(100, 30, 80, 40);
    c.add(jb);
    jb.addActionListener(new Listener());
    this.setLocation(500, 400);
    this.setSize(400, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Win4();
  }
}
