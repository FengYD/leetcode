package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author fengyadong
 * @date 2022/7/29 14:21
 * @Description
 */
public class SocketReceive implements Runnable {


    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            System.out.println("服务端 -- 服务端启动，等待连接。");
            Socket socket = serverSocket.accept();
            System.out.println(String.format("服务端 -- 连接成功，ip = %s, port = %d", socket.getInetAddress().getHostAddress(), socket.getPort()));
            InputStreamReader reader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(reader);
            while (true) {
                String s = bufferedReader.readLine();
                if (s != null) {
                    System.out.println("服务端 -- " + s);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws Exception {
        SocketReceive socketReceive = new SocketReceive();
        new Thread(socketReceive).start();

        try (Socket socket = new Socket("localhost", 8888)) {
            System.out.println("客户端 -- 已连接到服务端！");
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write("测试数据\n");
            writer.flush();
        } catch (Exception e) {
            System.out.println("客户端 -- 连接服务端失败！");
            e.printStackTrace();
        }
    }



}
