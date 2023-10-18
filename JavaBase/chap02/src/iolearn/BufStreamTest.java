package iolearn;

import org.junit.Test;

import java.io.*;

public class BufStreamTest {
    @Test
    public void test() throws IOException {
        File file = new File("init.txt");

        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");

        char[] buf = new char[1024];
        int len;
        while ((len = isr.read(buf)) != -1) {
            String str = new String(buf,0,len);
            System.out.print(str);
        }

        isr.close();
    }


    @Test
    public void test2() throws IOException {
        File file = new File("test.txt");

        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis,"gbk");

        char[] buf = new char[1024];
        int len;
        while ((len = isr.read(buf)) != -1) {
            String str = new String(buf,0,len);
            System.out.print(str);
        }

        isr.close();
    }

    @Test
    public void test3() throws IOException {
        //gbk to utf-8
        File src = new File("test.txt");
        File dest = new File("test_utf-8.txt");

        FileInputStream fis = new FileInputStream(src);
        InputStreamReader isr = new InputStreamReader(fis,"gbk");

        FileOutputStream fos = new FileOutputStream(dest);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");

        char[] buf = new char[1024];
        int len;
        while((len = isr.read(buf)) != -1){
            String str = new String(buf,0,len);
            osw.write(str);
        }

        osw.close();
        isr.close();
    }


    @Test
    public void test4() throws IOException {
        File file = new File("newtest1.txt");
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(file));

        // 写出数据 即为 序列化
        oos.writeUTF("大王大大王");

        oos.writeObject("write object");

        oos.flush();

        oos.close();
    }

    @Test
    public void test5() throws IOException, ClassNotFoundException {

        File file = new File("newtest1.txt");
        ObjectInputStream ois= new ObjectInputStream(new FileInputStream(file));

        String str = ois.readUTF();
        System.out.println(str);

        String str2 = (String) ois.readObject();
        System.out.println(str2);
        ois.close();
    }
}
