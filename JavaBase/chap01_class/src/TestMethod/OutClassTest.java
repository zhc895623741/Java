package TestMethod;

//public class OutClassTest {
//    public static void main(String[] args) {
//        OutClass.son1 s= new OutClass.son1();
//
//        OutClass p= new OutClass();
//        OutClass.son2 s1= p.new son2();
//
//        OutClass.son2 s2= new OutClass().new son2();
//    }
//
//}
//
//class OutClass{
//
//    static class son1{
//
//    }
//
//    class son2{}
//}


//局部内部类在开发中的使用
class Test_outclass{

    public Comparable getInstance(){
        //1.
//        class MyComparable implements Comparable{
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyComparable();


        //2.
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };


    }
}


class Se_OutClass{
    public static void main(String[] args) {

        //继承于Object的匿名子类的匿名对象
        new Object(){
            public void print(){
                System.out.println("test");
            }
        }.print();
    }
}
