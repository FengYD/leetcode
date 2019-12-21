package jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author fengyadong001
 * @date 2019/12/5 11:52 AM
 * @description
 */
public class TestRemoveFloatZero {

    public static void main(String[] args) {
        String s = "    {\n"
                + "        \"test1\": \"test1\",\n"
                + "        \"test2\": 1.0\n"
                + "    }";
        ObjectMapper mapper = new ObjectMapper();
        try {
            Object o = mapper.readValue(s, Object.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int a = 1;
    }

}