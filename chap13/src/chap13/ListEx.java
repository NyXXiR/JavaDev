package chap13;

import java.util.*;

public class ListEx extends Object {

  public static void main(String[] args) {
    List list2 = new ArrayList<String>();
    List list = new ArrayList();
    list2.add(11);
    list.add("Hello");
    String str = (String) list.get(0);
    Object obj = list.get(0);
    System.out.println(obj);
    System.out.println(str);
  }
}
