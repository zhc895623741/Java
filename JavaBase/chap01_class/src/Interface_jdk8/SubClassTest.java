package Interface_jdk8;

public class SubClassTest {
    public static void main(String[] args) {

        CompareA.method();
//        SubClass.method();       //报错

        SubClass s= new SubClass();
        s.method2();

        // 类实现两个接口 而两个接口定义同名同参的方法（默认方法） 则实现类必须重写该方法
        s.method3();
    }
}
