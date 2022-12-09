package jdbc04;

import java.awt.Container;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;

public class SwingEx extends JFrame implements ActionListener {
  JButton sel = new JButton("search");
  JButton del = new JButton("delete");
  StudentDB stu;

  SwingEx() throws ClassNotFoundException, SQLException {
    stu = new StudentDB();
    Container con = this.getContentPane();
    sel.setBounds(50, 50, 80, 50);
    del.setBounds(150, 50, 80, 50);
    con.setLayout(null);
    con.add(sel);
    con.add(del);
    sel.addActionListener(this);
    del.addActionListener(this);

    this.setVisible(true);

    this.setLocation(300, 500);
    this.setSize(400, 300);
  }

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    new SwingEx();

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == del) {
      System.out.println("del 클릭");
      // stu.delete();
    } else if (e.getSource() == sel) {
      System.out.println("sel 클릭");
      try {
        stu.selectAll();
      } catch (SQLException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }

    }
  }
}
