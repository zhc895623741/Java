package Thread_f.singleton;

public class BankTest {
    static Bank b1 = null;
    static Bank b2 = null;
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
    }
}


class Bank {
    private Bank(){}

    private static volatile Bank bk = null;    //避免指令重排

//    public static synchronized Bank getInstance(){   //同步监视器默认为Bank.class
//        if(bk == null){
//            try{
//                Thread.sleep(1000);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//            bk = new Bank();
//        }
//        return bk;
//    }


//    public static Bank getInstance(){
//        synchronized (Bank.class){
//            if(bk == null){
//                try{
//                    Thread.sleep(1000);
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//                bk = new Bank();
//            }
//            //return bk;
//        }
//        return bk;
//    }


    //优化    相较于方式1，2 效率更高
    public static Bank getInstance(){
        if(bk == null){
            synchronized (Bank.class){
                if(bk == null){
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    bk = new Bank();
                }

            }
        }

        return bk;
    }
}