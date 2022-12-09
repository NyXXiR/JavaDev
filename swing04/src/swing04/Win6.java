package swing04;

import java.awt.Container;
import javax.swing.*;

public class Win6 extends JFrame {

  JButton jb = new JButton("Å¬¸¯");

  Win6() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container c = this.getContentPane();
    c.setLayout(null);
    jb.setBounds(100, 30, 80, 40);
    c.add(jb);
    this.setLocation(500, 400);
    this.setSize(400, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Win6();
  }
}
