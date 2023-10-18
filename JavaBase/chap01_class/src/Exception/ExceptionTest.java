package Exception;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

    @Test
    public void test1(){
       try {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            System.out.println(num);
            scan.close();
       }
       catch (InputMismatchException e) {
            System.out.println("Exception: " + e.getMessage());
       }

        System.out.println("continue run");

    }
    
    
    ////////////////////////////////
    // 编译时异常
    
    @Test
    public void test(){
        try {
            File file = new File("hello.txt");
            FileInputStream fis = new FileInputStream(file);
            int data = fis.read();
            while (data != -1){
                System.out.println("aaa");
                data = fis.read();
            }
            fis.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("end");
    }

}
