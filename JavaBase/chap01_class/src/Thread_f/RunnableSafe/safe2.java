package Thread_f.RunnableSafe;



class S2 implements Runnable {
    private int number = 100;
    boolean flag = true;

    @Override
    public void run() {
        while(flag){
            try {
                Thread.sleep(5);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            show();
        }
    }

    public synchronized void show() {     //默认this
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
            flag = false;
        }


    }

}
public class safe2 {
    public static void main(String[] args) {
        S2 s = new S2();
        new Thread(s,"w1").start();
        new Thread(s,"w2").start();
        new Thread(s,"w3").start();
    }
}

