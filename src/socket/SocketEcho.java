package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author fengyadong
 * @date 2022/7/29 14:29
 * @Description
 */
public class SocketEcho implements Runnable{

    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(8888);) {
            System.out.println("服务端 -- 服务端启动，等待连接。");
            Socket socket = serverSocket.accept();
            System.out.println(String.format("服务端 -- 连接成功，ip = %s, port = %d", socket.getInetAddress().getHostAddress(), socket.getPort()));
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            InputStreamReader reader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(reader);
            while (true) {
                String s = bufferedReader.readLine();
                if (s != null) {
                    System.out.println("服务端接受 -- " + s);
                    s = s + "\n";
                    bufferedWriter.write(s);
                    bufferedWriter.flush();
                    System.out.println("服务端发送 -- " + s);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws Exception {
        SocketEcho socketEcho = new SocketEcho();
        new Thread(socketEcho).start();

        try (Socket socket = new Socket("localhost", 8888);
             OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
             BufferedWriter bufferedWriter = new BufferedWriter(writer);
             InputStreamReader reader = new InputStreamReader(socket.getInputStream());
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            System.out.println("客户端 -- 已连接到服务端！");
            bufferedWriter.write("测试数据\n");
            bufferedWriter.flush();
            System.out.println("客户端发送 -- 测试数据");
            String s = bufferedReader.readLine();
            if (s != null) {
                System.out.println("客户端接受 -- " + s);
            }
        } catch (Exception e) {
            System.out.println("客户端 -- 连接服务端失败！");
            e.printStackTrace();
        }
    }
}
