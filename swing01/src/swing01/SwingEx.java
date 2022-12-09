package swing01;

import java.awt.Container;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class SwingEx extends JFrame {
  // Jframe this = new thisrame();
  JButton jb = new JButton("click");

  SwingEx() {
    Container cp = this.getContentPane();
    this.setVisible(true);

    this.setTitle("Swing");
    jb.setBounds(10, 10, 80, 40);
    this.setLayout(null);
    this.add(jb);
    this.setLocation(100, 100);
    this.setSize(400, 300);
    this.addWindowListener(null);
    jb.addActionListener(this);
  }

  public void windowClosing(WindowEvent e) {


  }

  public void windowIconified(WindowEvent e) {
    System.out.println("아이콘");
  }

  public void actionPerformed

  public static void main(String[] args) {
    // 순서 바뀌어도 무방
    new SwingEx();


  }
}
