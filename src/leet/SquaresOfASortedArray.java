package leet;

/**
 * @author fengyadong
 * @date 2019/5/12 0:28
 * @description Leetcode第977题 Squares of a Sorted Array
 */
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        int[] B = new int[A.length];
        if(A[0] >= 0){
            for(int i = 0; i < A.length; i++){
                B[i] = A[i] * A[i];
            }
            return B;
        }

        if(A[A.length - 1] <= 0){
            for(int i = 0; i < A.length; i++){
                B[A.length - i -1] = A[i] * A[i];
            }
            return B;
        }

        int pos = getMinAbsWithSortArray(A, 0);
        B[0] = A[pos] * A[pos];
        int left = pos - 1;
        int right = pos + 1;
        for(int i = 1; i < A.length; i++) {
            if (left >= 0 && right < A.length) {
                if (Math.abs(A[left]) < Math.abs(A[right])) {
                    B[i] = A[left] * A[left];
                    left--;
                } else {
                    B[i] = A[right] * A[right];
                    right++;
                }
            } else if(left < 0 && right < A.length){
                B[i] = A[right] * A[right];
                right++;
            } else {
                B[i] = A[left] * A[left];
                left--;
            }
        }
        return B;
    }

    /**
     * 找到和a差值最小的数字的位置
     * */
    public int getMinAbsWithSortArray(int[] A, int a){
        int low = 0, high = A.length-1, mid = (low + high)/2;
        while(low < high){
            if(A[mid] < a) {
                low = mid + 1;
            }
            else if(A[mid] > a){
                high = mid - 1;
            } else {
                return mid;
            }
            mid = (low + high) / 2;
        }

        int result = mid;
        int min = Math.abs(a - A[mid]);
        if(mid + 1 < A.length && min > Math.abs(a - A[mid + 1])){
            result = mid + 1;
            min = Math.abs(a - A[mid + 1]);
        }
        if(mid - 1 >= 0 && min > Math.abs(a - A[mid - 1])){
            result = mid - 1;
            //min = Math.abs(a - A[result - 1]);
        }
        return result;
    }


    /**
     * 最好的的答案：换个思路有时候会更好，从最小值不好找可以找最大值
     * */
    public int[] answer(int[] A) {
        int i = 0, j = A.length -1, k=j;
        int[] B = new int[A.length];
        while(k>=0){
            int x = A[i]*A[i], y = A[j]*A[j];
            if(x >= y){
                B[k] = x;
                i++;
                k--;
            } else{
                B[k] = y;
                j--;
                k--;
            }
        }
        return B;

    }

    public static void main(String[] args) {
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] A = {-1,1};
        System.out.println(squaresOfASortedArray.sortedSquares(A));
    }
}
