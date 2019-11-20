package java8.stream;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

/**
 * @author fengyadong001
 * @date 2019/10/30 4:04 PM
 * @description
 */
public class ForkJoin extends RecursiveTask<Long> {

    public static final long THRESHOLD = 2;

    private final long[] numbers;
    private final int start;
    private final int end;

    public ForkJoin(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute(){
        if (end - start < THRESHOLD) {
            return add();
        } else {
            int mid = (start + end)/2;
            ForkJoin left = new ForkJoin(numbers, start, mid);
            left.fork();
            ForkJoin right = new ForkJoin(numbers, mid + 1, end);
            Long r = right.compute();
            Long l = left.join();
            System.out.println("中间结果:" + "l = " + l + " r = " + r);
            return l + r;
        }
    }

    private Long add(){
        if (start == end) {
            System.out.println("叶子结果:" + numbers[start]);
            return numbers[start];
        } else {
            System.out.println("叶子结果:" + (numbers[start] + numbers[end]));
            return numbers[start] + numbers[end];
        }
    }

    public static void main(String[] args) {
        long[] nums = LongStream.range(1, 101).toArray();
        ForkJoin forkJoin = new ForkJoin(nums, 0, nums.length-1);
        System.out.println("最终结果:" + new ForkJoinPool().invoke(forkJoin));
    }
}