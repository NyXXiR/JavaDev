package chap12_1;

public class ThreadEx {

  public static void main(String[] args) {
    Thread th = new WorkThread();
    th.start();

    Thread th2 = new Thread(new WorkThread2());
    th2.start();

    Thread th3 = new Thread() {

      @Override
      public void run() {
        // TODO Auto-generated method stub
        for (;;) {
          System.out.println("WorkThread3");
          try {
            Thread.sleep(200);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }



        }
      }
    };
    th3.start();
    Thread th4 = new Thread(() -> {


      for (;;) {
        System.out.println("WorkThread4");
        try {
          Thread.sleep(200);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }


    });
    th4.start();

  }
}


