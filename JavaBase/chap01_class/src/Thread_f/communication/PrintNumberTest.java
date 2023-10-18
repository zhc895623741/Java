package Thread_f.communication;

public class PrintNumberTest {
    public static void main(String[] args) {
        Print p = new Print();

        new Thread(p,"thread1").start();
        new Thread(p,"thread2").start();
    }
}


class Print implements Runnable{
    private int number = 1;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {

            synchronized (this){

                this.notify();

                if(number <= 100){
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;

                    try {
                        this.wait();        //线程调用此方法 就进入阻塞状态 会释放对同步监视器的调用
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else{
                    break;
                }
            }
        }
    }
}