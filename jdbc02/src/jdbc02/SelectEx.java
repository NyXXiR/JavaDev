package jdbc02;

import java.sql.*;
import java.util.Scanner;

public class SelectEx {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Connection conn = null;
    Statement stmt = null;
    Scanner sc = new Scanner(System.in);

    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("����̹� ���� ����");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
    System.out.println("DB ���� ����");
    stmt = conn.createStatement();
    int res = stmt.executeUpdate("select * from student");


    System.out.println(res + "�� �Է¼���");
  }

}