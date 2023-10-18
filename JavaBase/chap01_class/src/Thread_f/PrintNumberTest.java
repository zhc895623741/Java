package Thread_f;


class PrintNumber extends Thread{
    @Override
    public void run() {
        for (int i = 0;i<5000;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}

public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber p1 = new PrintNumber();
        PrintNumber p2 = new PrintNumber();
//        p1.start();
//        p2.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0;i<5000;i++){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0;i<5000;i++){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        }.start();
    }


}
