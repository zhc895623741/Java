package Junit;


import org.junit.Test;

public class WrapperTest {
    //包装类

    //Integer
    @Test
    public void test(){

        //装箱  基本类 ---> 包装类
        int a = 10;
        Integer l1 = Integer.valueOf(a);
        System.out.println(l1.toString());

        //拆箱  包装类 ---> 基本类
        int b = l1.intValue();
        System.out.println(b);

    }

    @Test
    public void test2(){
        // 自动装箱 拆箱
        int a = 20;
        Integer l1 = a;
        System.out.println(l1.toString());

        Integer l2 = 18;
        int b = l2;
        System.out.println(b);
    }


    // String
    @Test
    public void test3(){
        // 基本类型转String

        //1.
        int a = 10;
        String str1 = String.valueOf(a);
        System.out.println(str1);
        //2.
        String str2 = a +"";
        System.out.println(str2);
    }


    @Test
    public void test4(){
        // String 转 基本类型
        String s1 = "122";
        int l1 = Integer.parseInt(s1);
        System.out.println(l1);
    }

}
