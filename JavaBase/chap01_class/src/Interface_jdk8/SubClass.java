package Interface_jdk8;

public class SubClass implements CompareA,CompareB {


    // 默认方法可重写
//    @Override
//    public void method2() {
//        CompareA.super.method2();
//    }


    @Override
    public void method3() {
        CompareA.super.method3();    //调用接口的方法
    }

}
