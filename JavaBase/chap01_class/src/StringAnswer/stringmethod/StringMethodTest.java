package StringAnswer.stringmethod;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class StringMethodTest {

    @Test
    public void test1(){
        //String --> int
        String str = "123";
        int a = Integer.parseInt(str);
    }

    @Test
    public void test2(){

        //int --> String
        int a = 123;
        String str = String.valueOf(a);

    }

    @Test
    public void test3(){
        //String --> char[]  toCharArray
        String str = "abc";
        char[] a = str.toCharArray();
    }

    @Test
    public void test4(){
        //char[]--> String
        char[] a = new char[]{'a', 'e', 'c'};
        String str = String.valueOf(a);
        System.out.println(str);

        String str2 = new String(a);
        System.out.println(str2);
    }



    @Test
    public void test5() throws UnsupportedEncodingException {
        //String --> byte[]
        String str = "abc中国";
       


        byte[] a = str.getBytes();
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }

        byte[] b = str.getBytes("gbk");


        //byte[] --> String
        str = new String(a);
        System.out.println(str);
        str = new String(a,"utf-8");
    }


    @Test
    public void test6(){
        StringBuffer str = new StringBuffer("abc");
        str.append("111").append("2222");
        System.out.println(str);
    }


    @Test
    public void test7(){
        String s1 = "aabb";
        String s2 = "aa";
        String s3 = "bb";
        String s4 = new String("aa");
        String s5 = new String("bb");

        String s6 = s2 + s3;
        String s7 = "aa" + "bb";
        String s8 = s4 + s5;
        String s9 = s4 + s3;
        String s10 = s4 + "bb";


        System.out.println(s2 == s4);  //false
        System.out.println(s1 == s6);  //false
        System.out.println(s1 == s7);  //true
        System.out.println(s6 == s8);  //false
        System.out.println(s9 == s8);  //false
        System.out.println(s9 == s10);  //false
    }

}
