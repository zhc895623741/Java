package singleton;


//单例设计模式
public class singleton_01 {
    public static void main(String[] args) {
        bank bk1 = bank.getInstance();
        bank bk2 = bank.getInstance();
        System.out.println(bk1 == bk2);

//        bk1.print();
    }
}

//饿汉式 单例化  线程安全

//class bank{
//
//    //私有化构造器 避免在类外造多个对象
//    private bank(){}
//
//
//    //在类内部造一个对象
//    private static bank bk = new bank();
//
//    public static bank getInstance(){
//        return bk;
//    }
//
//    public void print(){
//        System.out.println("hhh");
//    }
//}


//懒汉式 单例化    线程不安全

class bank {
    private bank(){}

    private static bank bk = null;

    public static bank getInstance(){
        if(bk == null){
            bk = new bank();
        }
        return bk;
    }
}