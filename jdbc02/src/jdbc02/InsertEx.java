package jdbc02;

import java.sql.*;
import java.util.Scanner;

public class InsertEx {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Connection conn = null;
    Statement stmt = null;
    Scanner sc = new Scanner(System.in);


    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("����̹� ���� ����");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
    System.out.println("DB ���� ����");
    System.out.println("�̸�>");
    String name = sc.nextLine();
    System.out.println("�й�>");
    String hakbun = sc.nextLine();
    System.out.println("�ּ�>");
    String address = sc.nextLine();
    stmt = conn.createStatement();
    int res = stmt.executeUpdate(
        "insert into student " + "values(0,'" + name + "','" + hakbun + "','" + address + "')");


    System.out.println(res + "�� �Է¼���");
  }

}
