package socket;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author fengyadong
 * @date 2022/7/29 14:45
 * @Description
 */
public class SocketEchoTotal {

    public void echo() {
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

    public static void main(String[] args) {
        SocketEchoTotal echo = new SocketEchoTotal();
        echo.echo();
    }

}
