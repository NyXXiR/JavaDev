package chap10;

import java.sql.*;

public class TryEx {

  public static void main(String[] args) {

    private Connection conn;
    private static final String USER_NAME = "java";

    try {
      conn = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/thisisjava?serverTimezone=UTC", "java", "mysql");
      System.out.println("success");
      Statement stmt = conn.createStatement();

      stmt.executeUpdate(
          "insert into person (no,name,email,age,sex) values (1, '±èµ¿Çõ', 'donghyuk@nate.com', 2, 'M') ");

    } catch (SQLException e) {

      System.out.println("SQLException" + e);
    }


  }

}
