package iolearn;

import org.junit.Test;

import java.io.*;

// 将文件内容读到控制台
public class FileRWTest {

    // 异常使用 throws 不合适   try-catch 保证流的关闭
    @Test
    public void test() throws IOException {
        // 指定的文件必须存在
        File file = new File("test.txt");

        //创建输入型字节流 读取数据
        FileReader fr = new FileReader(file);
//        System.out.println((char)fr.read());

        while (fr.read() != -1) {
            System.out.println((char) fr.read());
        }

        //关闭流
        fr.close();

    }

    @Test
    public void test2() {
        File file = new File("test.txt");
        FileReader fr = null;
        //创建输入型字节流 读取数据
        try {
            fr = new FileReader(file);


            while (fr.read() != -1) {
                System.out.println((char) fr.read());
            }

            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    @Test
    public void test3() {
        FileReader fr = null;
        try {
            File file = new File("test.txt");
            fr = new FileReader(file);

            char[] buffer = new char[5];

            //错误的写法
//            while(fr.read(buffer) != -1){
//                for(int i = 0; i < buffer.length; i++){
//                    System.out.print(i);    //helloworld123ld
//                }
//            }

            int len;
            while ((len = fr.read(buffer)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(buffer[i]);
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    // 将内存的内容输出到指定文件

    @Test
    public void test4() {
        FileWriter fw = null;
        try {
            File file = new File("init.txt");
//            fw = new FileWriter(file);    等价于(file,false)
            fw = new FileWriter(file, true);

            fw.write("ni hao\n");
            fw.write("sb\n");
            fw.write("haha");
            System.out.println("output successed");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }


    @Test
    public void test6() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File src = new File("init.txt");
            File dest = new File("init_copy.txt");

            fr = new FileReader(src);
            fw = new FileWriter(dest);

            char[] buf = new char[6];
            int len;
            while ((len = fr.read(buf)) != -1) {
                fw.write(buf, 0, len);
            }
            System.out.println("copy successed");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Test
    public void test7() throws IOException {
        File src = new File("init.txt");
        File dest = new File("initcopy2.txt");

        BufferedReader br = new BufferedReader(new FileReader(src));
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

        String str;
        while( (str = br.readLine()) != null){
            bw.write(str);    //readLine读取一行 但不包括换行符
            bw.newLine();     //换行
            bw.flush();    //刷新方法
        }

        bw.close();
        br.close();
    }
}
