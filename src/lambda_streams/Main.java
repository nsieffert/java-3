package lambda_streams;

import static lambda_streams.Numbers.nums;

public class Main {

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        System.out.println(numbers.isEven(0));
        System.out.println(numbers.isOdd(3));
        System.out.println(numbers.isPrime(3));
        System.out.println(numbers.added(nums));
        System.out.println(numbers.subtracted(nums));
        System.out.println(numbers.multipled(nums));
        System.out.println(numbers.divided(nums, 3, 5));
        System.out.println(numbers.findMax(nums));
        System.out.println(numbers.findMin(nums));
        System.out.println(numbers.compare(nums, 0, 13));
        System.out.println(numbers.append(nums, 42));
    }
}
