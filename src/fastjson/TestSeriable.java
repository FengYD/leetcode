package fastjson;

import com.alibaba.fastjson.JSON;

/**
 * @author fengyadong001
 * @date 2019/12/5 5:45 PM
 * @description
 */
public class TestSeriable {

    public static void main(String[] args) {
        TestSeriable t = new TestSeriable();
        Dat dat = t.new Dat();
        JSON.toJSONString(dat);
    }

    public class Dat {
        Float d = 1.0f;

        public Float getD() {
            return d;
        }

        public void setD(Float d) {
            this.d = d;
        }
    }
}