package leet;

/**
 * @author fengyadong
 * @date 2019/5/12 1:45
 * @description Leetcode第922题 Sort Array By Parity II
 */
public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int i = 0;
        int j = 1;
        while (i < A.length && j < A.length){
            while (i < A.length && (A[i] & 1) == 0){
                i = i + 2;
            }
            while (j < A.length && (A[j] & 1) == 1){
                j = j + 2;
            }
            if (i < A.length && j < A.length){
                A[i] = A[i] ^ A[j];
                A[j] = A[i] ^ A[j];
                A[i] = A[i] ^ A[j];
            }
        }
        return A;
    }

    public static void main(String[] args) {
        SortArrayByParityII sortArrayByParityII = new SortArrayByParityII();
        int[] A = {4,2,5,7};
        System.out.println(sortArrayByParityII.sortArrayByParityII(A));
    }
}
