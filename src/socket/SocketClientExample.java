package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author fengyadong
 * @date 2019/4/5 16:50
 * @description
 */
public class SocketClientExample {

    private Socket socket;

    public SocketClientExample(String server, int port){
        try {
            this.socket = new Socket(server, port);
        } catch (UnknownHostException e){
            System.out.println("client 初始化失败, " + e.getMessage());
        } catch (IOException e){
            System.out.println("IO 异常, " + e.getMessage());
        }
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public static void main(String[] args) {
        SocketClientExample socketClientExample = new SocketClientExample("127.0.0.1", 8888);
        try {
            OutputStream out = socketClientExample.socket.getOutputStream();
            out.write("这是客户端发送给服务器的文字\n".getBytes());
            //发送退出信息
            out.write("exit\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
