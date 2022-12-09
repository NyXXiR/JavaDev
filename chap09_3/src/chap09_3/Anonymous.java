package chap09_3;

public class Anonymous {

  Person field = new Person() {
    void work() {
      System.out.println("출근합니다.");


    }

    @Override
    void wake() {
      // TODO Auto-generated method stub
      System.out.println("6시에 일어납니다.");
      work();
    }



  };

  void method1() {


    Person localVar = new Person() {
      void walk() {
        System.out.println("산책합니다.");
      }

      @Override
      void wake() {
        // TODO Auto-generated method stub
        System.out.println("7시에 일어납니다.");
        walk();
      }


    };

    localVar.wake();

  }

  void method2(Person person) {
    person.wake();
  }

}
