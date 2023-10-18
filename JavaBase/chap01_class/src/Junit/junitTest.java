package Junit;

import org.junit.Test;

import java.util.Scanner;

public class junitTest {
    //单元测试

    @Test
    public void test(){
        System.out.println("hello");
    }
    @Test
    public void test2(){
        System.out.println("aaaaaaaaa");
        int res = func(10);
        System.out.println(res);
    }

    public final int func(int a){
        a++;
        return a;
    }

    @Test
    public void test3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("输入一个数");
        int num = scan.nextInt();
        System.out.println(num+2);
        
    }
    
    @Test
    public void test5(){
        
    }

}
