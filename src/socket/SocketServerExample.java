package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author fengyadong
 * @date 2019/4/5 16:37
 * @description
 */
public class SocketServerExample {

    public void tcpEchoServer(){

    }

    public static void main(String[] args) {
        try {
            //创建服务器套接字
            ServerSocket server = new ServerSocket(8000);
            System.out.println("服务器启动完毕！");
            //等待客户端连接，返回的是已经连接到服务器的客户端socket对象
            Socket socket = server.accept();
            System.out.println("客户端已经连接上服务器啦！");
            //获取客户端socket对象的输入流
            InputStream inputStream = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while (true) {
                String string = bufferedReader.readLine();
                //如果接收到exit就退出服务器
                if (string.equals("exit")) {
                    break;
                }
                //如果接收到的不是exit，就输出接收到的内容
                System.out.println("接受内容为：" + string);
            }
            System.out.println("连接断开！");
            bufferedReader.close();
            reader.close();
            inputStream.close();
            socket.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
