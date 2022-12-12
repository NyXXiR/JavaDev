package usedItemProject;

import java.sql.*;
import java.util.Scanner;

public class ItemDB {
  // columns: num, id, name, price, address, date
  Connection conn;
  Statement stmt;
  ResultSet rs;
  Scanner sc = new Scanner(System.in);
  String sql;


  ItemDB() throws ClassNotFoundException, SQLException {
    // connection part
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/usedItemProject", "root2",
        "mysql");
    System.out.println("���� ����");
  }

  // ��ü select, �򰹼���, ��Ͻð���, �����ð��� ����
  // select���� order by ��Ʈ�� �߰��ϴ� ������� ����


//����Ʈ�����ʹ� ��ȣ �ȿ� �ִ� ���� ���� ���� order by�� �߰���. �ִ� 3������ ���� ����

  
  //�޼ҵ� �����ε�
 String selectData() throws SQLException {
    // executeQuery�� �������� ResultSet ��ü�� ���� ��ȯ�Ѵ�.
    stmt = conn.createStatement();
    sql = "select * from itemDB";
    rs = stmt.executeQuery(sql);
    String str = null;

    while (rs.next()) {
      String id = rs.getString("id");
      String name = rs.getString("name");
      int price = rs.getInt("price");
      String address = rs.getString("address");

      str += String.format("[%s] %s %d %s \n", id, name, price, address);
    }
    return str;
    
  }
 
 String selectData(String column) throws SQLException {
	 stmt = conn.createStatement();
	 sql = "select * from itemDB order by"+column;
	    rs = stmt.executeQuery(sql);
	    String str = null;

	    while (rs.next()) {
	      String id = rs.getString("id");
	      String name = rs.getString("name");
	      int price = rs.getInt("price");
	      String address = rs.getString("address");

	      str += String.format("[%s] %s %d %s \n", id, name, price, address);
	    }
	    return str; 
 }
 
 String selectData(String column, String column2) throws SQLException {
	 stmt = conn.createStatement();
	 sql ="select * from itemDB order by "+column+","+column2;
	    rs = stmt.executeQuery(sql);
	    String str = null;

	    while (rs.next()) {
	      String id = rs.getString("id");
	      String name = rs.getString("name");
	      int price = rs.getInt("price");
	      String address = rs.getString("address");

	      str += String.format("[%s] %s %d %s \n", id, name, price, address);
	    }
	    return str; 
 }
 String selectData(String column, String column2,String column3) throws SQLException {
	 stmt = conn.createStatement();
	 sql="select * from itemDB order by "+column+","+column2+","+column3;
	    rs = stmt.executeQuery(sql);
	    String str = null;

	    while (rs.next()) {
	      String id = rs.getString("id");
	      String name = rs.getString("name");
	      int price = rs.getInt("price");
	      String address = rs.getString("address");

	      str += String.format("[%s] %s %d %s \n", id, name, price, address);
	    }
	    return str; 
 }
 
 

  // insertData�� ������
  void insertData() throws SQLException {
    // executeUpdate�� �ݿ��� ���ڵ��� �Ǽ��� ��ȯ�Ѵ�.(�ٷ� insert, update, delete�ϸ� �Ǵϱ� rs�� ���Ϲ��� �ʿ䰡 ����)
    // ��¥ ĭ�� �Է� ���ϸ� �����ڰ� �ڵ����� �Էµȴٴµ� Ȯ���غ���.

    System.out.println("ID�� �Է��ϼ���.");
    String inputId = sc.next();
    System.out.println("��ǰ���� �Է��ϼ���.");

    String inputName = sc.next();
    System.out.println("��������� �Է��ϼ���.");

    int inputPrice = sc.nextInt();
    System.out.println("�ּҸ� �Է��ϼ���.");
    String inputAddress = sc.next();
    stmt = conn.createStatement();
    String sql = String.format("insert into item values(0,'%s','%s',%d,'%s',now())", inputId,
        inputName, inputPrice, inputAddress);
    int result = stmt.executeUpdate(sql);

    System.out.println(result + " ���� �����͸� ó���߽��ϴ�.");
  }

  // �� �Ű������� �־ delete�� �����ϴ� �� ������?
  void deleteData(String name) throws SQLException {
    stmt = conn.createStatement();
    String sql = String.format("delete from student where name=%s", name);
    int result = stmt.executeUpdate(sql);
    System.out.println(result + " ���� �����Ͱ� �����Ǿ����ϴ�.");
  }



  // update �ʿ��ϸ� ����


  void updateData() {}


  // �Ǹŵ� itemDB�� �� soldItemDB�� �߰� > itemDB �� ����
  void moveData() {
    // addActionListener�� Ŭ�� �ν�. this


  }

}

