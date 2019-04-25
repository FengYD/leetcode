package leet;

/**
 * @author fengyadong
 * @date 2019/4/21 19:13
 * @description Leetcode第299题 Bulls and Cows
 */
public class BullsAndCows {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        int[] bit = new int[128];
        int length = secret.length();
        for(int i = 0; i < length; i++){
            if(secret.charAt(i) == guess.charAt(i)){
                bull++;
            } else {
                if(bit[secret.charAt(i)] < 0){
                    cow++;
                }
                if(bit[guess.charAt(i)] > 0){
                    cow++;
                }
                bit[secret.charAt(i)]++;
                bit[guess.charAt(i)]--;

            }
        }

        //return String.format("%dA%dB",bull, cow);
        return bull+"A"+cow+"B";
    }

    public static void main(String[] args) {
        BullsAndCows bullsAndCows = new BullsAndCows();
        System.out.println(bullsAndCows.getHint("1807","7801"));
    }
}
