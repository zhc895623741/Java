package iolearn;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class commonsIOTest {
    @Test
    public void test() throws IOException {
        File file = new File("./src/iolearn/img.jpg");
        FileUtils.copyFile(file, new File("./src/iolearn/imgnewcopy.jpg"));

        System.out.println("copy successed");
    }
}
