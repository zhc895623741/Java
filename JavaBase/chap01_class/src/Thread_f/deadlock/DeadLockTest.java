package Thread_f.deadlock;

public class DeadLockTest {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        new Thread(){

            @Override
            public void run() {
                synchronized (sb1){

                    sb1.append("a");
                    sb2.append("1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    synchronized (sb2){
                        sb1.append("b");
                        sb2.append("2");

                        System.out.println(sb1);
                        System.out.println(sb2);
                    }

                }

            }
        }.start();



        new Thread(){

            @Override
            public void run() {
                synchronized (sb2){

                    sb1.append("c");
                    sb2.append("3");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (sb1){
                        sb1.append("d");
                        sb2.append("4");
                        System.out.println(sb1);
                        System.out.println(sb2);
                    }
                }

            }
        }.start();


    }
}
