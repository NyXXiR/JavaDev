package swing04;

import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class Win2 extends JFrame implements ActionListener {

  JButton jb = new JButton("Ŭ��");

  Win2() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container c = this.getContentPane();
    c.setLayout(null);
    jb.setBounds(100, 30, 80, 40);
    c.add(jb);
    jb.addActionListener(this);
    this.setLocation(500, 400);
    this.setSize(400, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Win2();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("clicked");
  }
}
