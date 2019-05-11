package leet;

/**
 * @author fengyadong
 * @date 2019/5/11 18:01
 * @description Leetcode第832题 Flipping an Image
 */
public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] A) {
        for(int row = 0; row < A.length; row++){
            for(int i = 0, j = A[row].length - 1; i <= j; i++, j--){
                if(A[row][i] == A[row][j]){
                    A[row][j] = A[row][i] = A[row][i] ^ 1;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {
        FlippingAnImage flippingAnImage = new FlippingAnImage();
        int A[][] = {{1,1,0}, {1,0,1}, {0,0,0}};
        System.out.println(flippingAnImage.flipAndInvertImage(A));
    }

}
