package chap14;

public class MyFunctionalInterfaceExample {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    MyFunctionalInterface fi;

    fi = (x, y) -> {
      int result = x + y;
      return result;
    };
    // ���ٽ�.method�� ���ٽ� ������ {}�� �����Ŵ.
    fi.method(5, 7);



  }

}

