package kioskProject;

import java.sql.*;
import java.util.Scanner;

public class SelectMenu {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Connection conn = null;
    Statement stmt = null;
    Scanner sc = new Scanner(System.in);

    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("드라이버 설정 성공");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
    System.out.println("DB 접속 성공");
    stmt = conn.createStatement();
    int res = stmt.executeUpdate("select * from student");


    System.out.println(res + "건 입력성공");
  }

}
