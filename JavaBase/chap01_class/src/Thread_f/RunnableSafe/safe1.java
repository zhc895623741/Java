package Thread_f.RunnableSafe;


class S1 implements Runnable {
    private int number = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while(true){

            try {
                Thread.sleep(5);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

//            synchronized(obj){     //obj 必须唯一
              synchronized (this){
                if(number > 0){
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
        }
    }
}
public class safe1 {
    public static void main(String[] args) {
        S1 s = new S1();
        new Thread(s,"w1").start();
        new Thread(s,"w2").start();
        new Thread(s,"w3").start();
    }
}
