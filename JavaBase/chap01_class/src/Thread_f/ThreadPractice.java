package Thread_f;


class func1 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            if(i % 2== 0){
                System.out.println("f1:"+i);
            }
        }
    }
}
class func2 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            if(i % 2!= 0){
                System.out.println("f2:"+i);
            }
        }
    }
}
public class ThreadPractice {
    public static void main(String[] args) {
        func1 f1 = new func1();
        func2 f2 = new func2();
        f1.start();
        f2.start();
    }
}
