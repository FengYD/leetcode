package leet;

/**
 * @author fengyadong
 * @date 2019/5/25 18:46
 * @description Leetcode第509题 Fibonacci Number
 */
public class FibonacciNumber {

    public int fib(int N) {
        int[] f = new int[35];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= N; ++i){
            f[i] = f[i-1]+f[i-2];
        }
        return f[N];
    }

}
