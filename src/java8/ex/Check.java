package java8.ex;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fengyadong001
 * @date 2019/11/14 12:31 PM
 * @description
 */
public class Check {

    public static void main(String[] args) {
        String s = "{\"errno\":0,\"errmsg\":\"\",\"traceId\":\"47356483656267672\"}";
        byte[] b = new String(s.getBytes(), StandardCharsets.UTF_8).getBytes();
        Map<String, String> map = new HashMap<>();
    }

}