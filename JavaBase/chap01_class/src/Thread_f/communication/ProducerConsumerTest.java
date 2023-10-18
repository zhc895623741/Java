package Thread_f.communication;



class Clerk{   //店员
    private int productNum;

    //add product
    public synchronized void addProduct(){
        if(productNum >= 20){
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        productNum++;
        System.out.println(Thread.currentThread().getName()+"生产第"+productNum+"个产品");

        this.notify();
    }

    //sub product
    public synchronized void subProduct(){
        if(productNum <= 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        productNum--;
        System.out.println(Thread.currentThread().getName()+"剩"+productNum+"个产品");

        this.notify();
    }
}

class Producer extends Thread{   //生产者
    private Clerk clerk;

    public Producer(Clerk clerk,String name){
        super(name);
        this.clerk = clerk;
    }

//    public Producer(String name, Clerk clerk) {
//        super(name);
//        this.clerk = clerk;
//    }

    @Override
    public void run() {
        while(true){
            System.out.println("produce...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            clerk.addProduct();
        }
    }
}


class Consumer extends Thread{   //消费者
    private Clerk clerk;

    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }

    public Consumer(Clerk clerk,String name) {
        super(name);
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("consume...");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            clerk.subProduct();
        }
    }
}
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        new Producer(clerk,"producer").start();
        new Consumer(clerk,"consumer").start();
    }
}
