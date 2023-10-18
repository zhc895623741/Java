package TestMethod;

public  class test03 {
    public static void main(String[] args) {
        BankTemplate b = new DrawMoney();
        b.process();

        DrawMoney d = new DrawMoney();
        d.process();
    }

}

abstract class BankTemplate{
    public void takeNumber(){
        System.out.println("qu hao");
    }

    public abstract void transact();

    public void evaluate(){
        System.out.println("ping jia");
    }

    public final void process(){
        this.takeNumber();
        this.transact();
        this.evaluate();
    }

}
class DrawMoney extends BankTemplate {

    @Override
    public void transact() {
        System.out.println("wo yao qu qian");
    }
}


