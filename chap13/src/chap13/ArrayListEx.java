package chap13;

import java.util.*;

public class ArrayListEx {

  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("java");
    list.add("JDBC");
    list.add("Mysql");
    for (String str : list) {
      System.out.println(str);
    }

  }
}
