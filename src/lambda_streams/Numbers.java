package lambda_streams;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

class Numbers {
    static List<Integer> nums = Arrays.asList(10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 25, 250, 2500);

    public static void main(String[] args) {

        //Part I :complete the static class methods that have been set up in this Numbers class java file.
        // Use streams to compute the results whenever possible.
        System.out.println(nums);

        //Part II - refactor all of the class methods to accept lambda expressions.
        // You can put the lambda functions directly inside the method calls, or define them first,
        // then pass them into the methods. give them the same names as the static methods, but add the word
        // 'lambda' in front of every lambda function:
        /* e.g.

        added(() -> {});

        OR

        lambdaAdd = () -> {};
        added(lambdaAdd);

        isOdd(() -> {});

        OR

        lambdaOdd = () -> {};
        isOdd(lambdaOdd);
        etc...

        */

    }

    Predicate<Integer> isOdd = (i) -> i % 2 != 0;
    Predicate<Integer> isEven = (i) -> i % 2 == 0;
    Predicate<Integer> isPrime = (i) -> i % 2 != 0 && i / i == 1;
    oneFunction<List<Integer>> added = (List<Integer> nums) -> {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return Collections.singletonList(sum);
    };
    oneFunction<List<Integer>> subtracted = (List<Integer> nums) -> {
        Arrays.asList(nums, Collections.reverseOrder());
        int sub = 2500;
        for (int i : nums) {
            sub -= i;
        }
        return Collections.singletonList(sub);
    };

    oneFunction<BigInteger> multiplied = (n) -> {
        BigInteger mult = new BigInteger("1");
        for (int i : nums) {
            mult = mult.multiply(BigInteger.valueOf(i));
        }
        return mult;
    };

        twoFunction<Integer> divided = (k, j) -> {
            int div = nums.get(j) / nums.get(k);
            return div;
        };
        oneFunction<List<Integer>> findMax = (p) -> {
            int b;
            int max = 0;
            for (b = 1; b < nums.size(); b++)
                if (nums.get(b) > max) {
                    max = nums.get(b);
                }
            return Collections.singletonList(max);
        };

        oneFunction<List<Integer>> findMin = (d) -> {
            int min = 10;
            for (int c = 1; c < nums.size(); c++) {
                if (nums.get(c) < min) {
                    min = nums.get(c);
                }
            }
            return Collections.singletonList(min);
        };

        twoFunction<Integer> compare = (l, m) -> {
            l = nums.get(l);
            m = nums.get(m);
            if (l > m) {
                return 1;
            } else if (m > l) {
                return -1;
            } else if (l == m) {
                return 0;
            } else {
                return l;
            }
        };

        oneFunction<Integer> append = (a) -> {
            List<Integer> nums1 = Arrays.asList(10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 25, 250, 2500);
            nums1 = new ArrayList<Integer>();
            nums1.add(a);
            return (a);
        };
    };




