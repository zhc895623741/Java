package tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPTest {

    //客户端
    @Test
    public void client() throws IOException {
        Socket socket = null;
        OutputStream os = null;
        try {
            //创建一个socket
            InetAddress inetAddress = InetAddress.getByName("192.168.23.22");
            int port = 8989;
            socket = new Socket(inetAddress,port);
            System.out.println("client start...");

            //发送数据
            os = socket.getOutputStream();
            os.write("client write".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭socket、流
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (os != null) {
                    os.close();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    //服务端
    @Test
    public void server() throws IOException {

        System.out.println("wait client...");
        ServerSocket serverSocket = null;
        Socket socket = null;   //阻塞式
        InputStream is = null;
        try {
            int port = 8989;
            serverSocket = new ServerSocket(port);

            socket = serverSocket.accept();
            System.out.println("server started");
            System.out.println("收到了"+socket.getInetAddress().getHostAddress()+"的连接");

            //接受数据
            is = socket.getInputStream();
            byte[] bytes = new byte[5];
            int len;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();   //内部维护一个byte数组

            while((len = is.read(bytes)) != -1){
                //错误的， 如果客户端传汉字过来 受byte数组大小影响 可能会乱码
                //应该等循环结束再输出 而不是中途打开
//                String str = new String(bytes,0,len);
//                System.out.println(str);

                baos.write(bytes,0,len);
            }
            System.out.println(baos);
            System.out.println("transfer end");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭资源
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
