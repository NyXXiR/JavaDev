package chap14;

public class MyFunctionalInterfaceExample {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    MyFunctionalInterface fi;

    fi = (x, y) -> {
      int result = x + y;
      return result;
    };
    // 람다식.method는 람다식 내부의 {}를 실행시킴.
    fi.method(5, 7);



  }

}

