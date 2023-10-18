package Thread_f;

public class Thread_by_Imterface {
    public static void main(String[] args) {
        func f = new func();
        new Thread(f).start();


        new Thread(f){
            @Override
            public void run() {
                for (int i = 0; i <100;i++) {
                    System.out.println(Thread.currentThread().getName()+":"+i);

                }
            }
        }.start();

    }
}

class func implements Runnable{
    private int money;      //所有线程共用

    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            if(i %2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}


