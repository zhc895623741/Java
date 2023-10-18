package iolearn;

import org.junit.Test;

import java.io.*;

public class FileImgTest {

    @Test
    public void test() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File src = new File("src/io/img.jpg");
            File dest = new File("src/io/imgcopy.jpg");

            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buf = new byte[1024];
            int len;
            while( (len = bis.read(buf)) != -1){

                    bos.write(buf,0,len);
            }

            System.out.println("copy successed");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(bos != null)
                    bos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if(bis != null)
                    bis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
