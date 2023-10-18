package tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TransferImgTest {

    @Test
    public void client() throws IOException {
        //
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        int port = 9111;
        Socket socket = new Socket(inetAddress,port);

        //创建文件
        File file = new File("img01.jpg");
        FileInputStream fis = new FileInputStream(file);
        //通过Socket 获取输出流
        OutputStream os = socket.getOutputStream();

        byte[] buf = new byte[1024];
        int len;
        while((len = fis.read(buf)) != -1){
            //客户端发送数据
            os.write(buf, 0, len);
        }
        System.out.println("数据发送完毕");
        //客户端表明不再发送数据
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len1;
        while((len1 = is.read(bytes)) != -1){
            baos.write(bytes, 0, len1);
        }
        System.out.println(baos.toString());

        baos.close();
        is.close();
        os.close();
        fis.close();

    }

    @Test
    public void server() throws IOException{
        int port = 9111;
        ServerSocket serverSocket = new ServerSocket(9111);
        Socket socket = serverSocket.accept();

        //服务器接受数据
        InputStream is = socket.getInputStream();

        File file = new File("./src/tcpudp/acptimg.jpg");
        FileOutputStream fos = new FileOutputStream(file);

        byte[] buf = new byte[1024];
        int len;
        while((len = is.read(buf)) != -1){
            fos.write(buf,0,len);
        }

        System.out.println("服务器接收完毕");

        //服务器向客户端发送信息
        OutputStream os = socket.getOutputStream();
        os.write("I got it!".getBytes());


        os.close();
        fos.close();
        is.close();
        serverSocket.close();
        socket.close();

    }
}
