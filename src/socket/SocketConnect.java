package socket;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author fengyadong
 * @date 2022/7/29 14:04
 * @Description
 */
public class SocketConnect implements Runnable {

    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            System.out.println("服务端：服务端启动，等待连接。");
            Socket socket = serverSocket.accept();
            System.out.println(String.format("服务端：连接成功，ip = %s, port = %d", socket.getInetAddress().getHostAddress(), socket.getPort()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws Exception {
        SocketConnect socketConnect = new SocketConnect();
        new Thread(socketConnect).start();

        try (Socket socket = new Socket("localhost", 8888)) {
            System.out.println("客户端：已连接到服务端！");
        } catch (Exception e) {
            System.out.println("客户端：连接服务端失败！");
            e.printStackTrace();
        }
    }


}
