package swing04;

import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;


class Listener implements ActionListener {
  int num;

  Listener(int num) {
    this.num = num;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("clicked!" + num);
  }
}



public class Win3 extends JFrame {

  JButton jb = new JButton("Å¬¸¯");

  Win3() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    int num = 10;
    Container c = this.getContentPane();
    c.setLayout(null);
    jb.setBounds(100, 30, 80, 40);
    c.add(jb);
    jb.addActionListener(new Listener(num));
    this.setLocation(500, 400);
    this.setSize(400, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Win3();
  }
}
