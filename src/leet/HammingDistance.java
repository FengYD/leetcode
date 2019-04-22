package leet;


/**
 * @author fengyadong
 * @date 2019/4/21 15:52
 * @description
 */
public class HammingDistance {

    /**
     * 计算一个 Integer 有多少 1
     * */
    public int countBits(int x){
        int count = 0;
        for(int i = 0; i < 32; i++){
            if(x == 0) {
                break;
            }
            count = count + (x & 1);
            x = x >> 1;
        }
        return count;
    }

    public int hammingDistance(int x, int y){
        int z = x ^ y;
        return countBits(z);
    }


    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        int x = 1;
        int y = 4;
        System.out.println(hammingDistance.hammingDistance(x, y));
    }
}
