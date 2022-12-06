package chap07_1;

class Aaa {

  int x = 10;


  Aaa(int x) {
    this.x = x;
  }



  void printX() {
    System.out.println(x);
  }
}


public class Bbb extends Aaa {
  Bbb(int x) {
    super(x);
  }

  void printX() {
    System.out.println(x);
  }



  public static void main(String[] args) {
    Aaa aa = new Aaa(3);
    Bbb bb = new Bbb(7);
    aa.printX();

  }
}

