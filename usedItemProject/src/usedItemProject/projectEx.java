package usedItemProject;

import java.sql.SQLException;
import java.util.Scanner;

public class projectEx {



  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int selectNum = 0;
    boolean run = true;


    ItemDB sd = new ItemDB();


    while (run) {
      selectNum = sc.nextInt();
      if (selectNum == 2) {
        sd.insertData();

      }
      // sd.selectAll();
      // sd.deleteData(null);
    }
  }
}
