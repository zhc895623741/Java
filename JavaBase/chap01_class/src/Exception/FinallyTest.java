package Exception;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest {
    @Test
    public void test(){
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");  //可能报FileNotFoundException
            fis = new FileInputStream(file);
            int data = fis.read();     //可能报IOException
            while (data != -1){
                System.out.println("aaa");
                data = fis.read();
            }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                fis.close();     //可能报IOException
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

        System.out.println("end");
    }
}
