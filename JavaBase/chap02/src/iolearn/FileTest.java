package iolearn;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileTest {
    @Test
    public void test(){
        File file = new File("hello.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getParent() );
        System.out.println(file.getAbsoluteFile().getParent());

        File file2 = new File("test.txt");
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.length());

    }

    @Test
    public void test2(){
        File file = new File("E:\\JavaCode\\chap01_class\\src");
        String[] lines = file.list();
        for(String line : lines){
            System.out.println(line);
        }

        File[] files = file.listFiles();
        for(File f : files){
            System.out.println(f);
        }

    }

    @Test
    public void test3() throws IOException {
        File file = new File("test.txt");
        if(!file.exists()){
            boolean newFile = file.createNewFile();
            if(newFile){
                System.out.println("create successed");
            }
        }
        else{
            System.out.println("create failed");
        }
    }
}
