package fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author fengyadong001
 * @date 2019/12/5 11:41 AM
 * @description
 */
public class TestRemoveFloatZero {

    public static void main(String[] args) {
        testRemoveFloatZero();
        testIntegerSeriable();
    }

    public static void testRemoveFloatZero() {
        String s = "    {\n"
                + "        \"test1\": \"test1\",\n"
                + "        \"test2\": 1.0\n"
                + "    }";
        JSONObject jsonObject = JSON.parseObject(s, JSONObject.class);
    }

    public static void testIntegerSeriable() {
        try {
            Float a = JSON.parseObject("5", Float.class);
        } catch (Exception e){
            e.printStackTrace();
        }
        int b = 1;
    }


}