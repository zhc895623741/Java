package Thread_f.exer;

public class AccountTest {
    public static void main(String[] args) {
        Account act = new Account();
        Customer c1 = new Customer(act,"w1");
        Customer c2 = new Customer(act,"w2");
        c1.start();
        c2.start();

    }
}


class Account{
    private double balance;

    public synchronized void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"余额为"+balance);

    }
}

class Customer extends Thread{
    private Account act;

    Customer(Account act){
        this.act = act;
    }

    Customer(Account act,String sname){
        super(sname);
        this.act = act;
    }
    @Override
    public void run() {
        for(int i = 0; i <3 ;i++){
            act.deposit(1000);
        }
    }
}
