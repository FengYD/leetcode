package fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @author fengyadong001
 * @date 2019/12/12 6:31 PM
 * @description
 */
public class TestType {

    public static void main(String[] args) {
        String s = "    {\n"
                + "        \"test1\": \"test1\",\n"
                + "        \"test2\": 1.0\n"
                + "    }";
        JSONObject jsonObject = JSON.parseObject(s, JSONObject.class);
        Object o = jsonObject.get("test2");
        Object o1 = jsonObject.get("test1");
        TestA testA = new TestType().new TestA();
        String str = JSON.toJSONString(testA);
        JSONObject jsonObject1 = JSON.parseObject(str, JSONObject.class);
        int a = 1;
    }

    @Data
    public class TestA{
        Integer a = 1;
        Float b = 1.1f;
        String c = "testc";
    }

}