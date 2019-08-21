package leet;

/**
 * @author fengyadong001
 * @date 2019/4/26 9:08 PM
 * @description Leetcode第10题 Container With Most Water
 */
public class ContainerWithMostWater {

    private int area;

    public int maxArea(int[] height) {

        if(height.length == 2){
            return height[0]*height[1];
        }

        int left = height.length/2;
        int right = left+1;

        return 0;


    }

    public int maxAreaLeft(int[] height, int left, int right){
        for(int i = left - 1; i >= 0; i--){
            if(height[i] >= height[right]){
                right++;
            }else {
                return right;
            }
        }
        return right;
    }

    public int maxAreaRight(int[] height, int left, int right){
        for(int i = right + 1; i < height.length; i++){
            if(height[i] >= height[right]){
                right++;
            }else {
                return right;
            }
        }
        return right;
    }

}