package socket;

import java.io.IOException;
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

}
