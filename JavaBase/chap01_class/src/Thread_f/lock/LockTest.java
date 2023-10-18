package Thread_f.lock;


import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    public static void main(String[] args) {
        //重票 和 错票

        NS1 n = new NS1();
        new Thread(n,"窗口1").start();
        new Thread(n,"窗口2").start();
        new Thread(n,"窗口3").start();
    }
}


class NS1 implements Runnable{
    private int number = 100;

    //  创建Lock实例 需要确保多个线程共用  需要考虑static final
    private static final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            try {

                lock.lock();

                if(number>0){
                    try {
                        Thread.sleep(20);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"售票 票号为:"+number);

                    number--;

                }
                else{
                    break;
                }
            }
            finally {      //try-finally确保unlock执行
                lock.unlock();
            }

        }
    }
}