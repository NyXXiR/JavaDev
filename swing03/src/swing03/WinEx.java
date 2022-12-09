package swing03;

import java.awt.*;
import javax.swing.*;

public class WinEx extends JFrame {
  JTextArea jb1 = new JTextArea();
  JTextArea jb2 = new JTextArea();
  JTextArea jb3 = new JTextArea();
  JTextArea jb4 = new JTextArea();
  JButton jb5 = new JButton("5");
  JButton jb6 = new JButton("6");
  JButton jb7 = new JButton("7");
  JButton jb8 = new JButton("8");
  JTextField tf9 = new JTextField("이름");
  JButton jb10 = new JButton("");
  JTextField tf11 = new JTextField("학번");
  JButton jb12 = new JButton("");
  JTextField tf13 = new JTextField("학과");
  JButton jb14 = new JButton("");
  JTextField tf15 = new JTextField("과목");
  JButton jb16 = new JButton("");

  JTextArea ta = new JTextArea();

  WinEx() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = this.getContentPane();
    JPanel jpl = new JPanel();
    ta.setBounds(80, 80, 80, 80);
    jpl.setLayout(new GridLayout(4, 1));
    c.add(jpl, BorderLayout.EAST);
    jpl.add(jb1);
    jpl.add(jb2);
    jpl.add(jb3);
    jpl.add(jb4);

    c.add(jpl);
    JPanel jpl2 = new JPanel();
    jpl2.setLayout(new GridLayout(4, 1));
    c.add(jpl2, BorderLayout.WEST);
    jpl2.add(tf9);
    jpl2.add(tf11);
    jpl2.add(tf13);
    jpl2.add(tf15);

    this.setLocation(400, 400);
    this.setSize(400, 300);
    this.setVisible(true);

  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    new WinEx();
  }

}
