package lambda_streams;

import java.math.BigInteger;

import static lambda_streams.Numbers.nums;

public class Main {

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        System.out.println(numbers.isEven.test(0));
        System.out.println(numbers.isOdd.test(3));
        System.out.println(numbers.isPrime.test(3));
        System.out.println(numbers.added.compute1(nums));
        System.out.println(numbers.subtracted.compute1(nums));
        System.out.println(numbers.multiplied.compute1(BigInteger.ONE));
        System.out.println(numbers.divided.compute2(3, 5));
        System.out.println(numbers.findMax.compute1(nums));
        System.out.println(numbers.findMin.compute1(nums));
        System.out.println(numbers.compare.compute2(0, 13));
        System.out.println(numbers.append.compute1(42));
    }
}
