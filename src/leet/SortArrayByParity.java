package leet;

/**
 * @author fengyadong
 * @date 2019/5/11 17:33
 * @description Leetcode第905题 Sort Array By Parity
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        if(A.length < 2){
            return A;
        }

        int i = 0;
        int j = A.length - 1;
        while (i < j){
            while (i < j && A[i] % 2 == 0){
                i++;
            }
            while (i < j && A[j] % 2 == 1){
                j--;
            }
            if(i != j){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }
        return A;
    }



    /**
     * 一个更好的答案
     * */
    public int[] answer(int[] A) {
        int i=0;
        int j=A.length-1;
        while(i<=j){
            while(i<j){

                //位运算代替%
                if((A[i] & 1) ==1){
                    break;
                }
                i++;

            }

            while(i<j){
                if((A[j]&1) ==0){
                    break;
                }
                j--;
            }
            //位运算代替两个数字交换，节省空间
            if(i!=j) {
                A[i]=A[i]^A[j];
                A[j]=A[i]^A[j];
                A[i]=A[i]^A[j];
            }
            //这里可以少判断一次
            i++;
            j--;
        }
        return A;
    }


    public static void main(String[] args) {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] A = {3,1,2,4};
        System.out.println(sortArrayByParity.sortArrayByParity(A));
    }
}
