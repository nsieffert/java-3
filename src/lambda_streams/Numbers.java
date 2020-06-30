package lambda_streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

class Numbers {
    static List<Integer> nums = Arrays.asList(10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 25, 250, 2500);

    public static void main(String[] args) {

        //Part I :complete the static class methods that have been set up in this Numbers class java file.
        // Use streams to compute the results whenever possible.
        System.out.println(nums);

        //Part II - refactor all of the class methods to accept lambda expressions. You can put the lambda functions directly inside the method calls, or defined them first, then pass them into the methods. give them the same names as the static methods, but add the word 'lambda' in front of every lambda function:
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

    static boolean isOdd(int i) {
        if (i % 2 != 0) {
            return true;
        }
        return false;
    }

    static boolean isEven(int i) {
        if (i % 2 == 0) {
            return true;
        }
        return false;
    }

    static boolean isPrime(int i) {
        if(i % 2 == 0) {
            return false;
        } else if(i / i == 1) {
                return true;
            }
        return false;
    }

    static int added() {
        int sum = IntStream.of(nums.size()).sum();
        System.out.println("The sum is " + sum);
        return sum;
    }

    static int subtracted(int i) {
        Arrays.asList(nums, Collections.reverseOrder());
        for (i = nums.size() - 1; i >= 0; i--){
            System.out.println(i);
        }
            return i;
        }

    static int multipled() {
        int sum=0;
        for (int i=0; i<nums.size(); i++) {
            sum = sum * nums.get(i);
        }
        return sum;
    }

    static int divided() {
        Arrays.asList(nums, Collections.reverseOrder());
        int div=2500;
        for (int i=1; i<nums.size(); i++) {
            div = div / nums.get(i);
        }
        return div;
    }

    static int findMax() {
        int i;
        int max = 0;
        for (i = 1; i < nums.size(); i++)
            if (nums.get(i) > max)
                max = nums.get(i);

        return max;
    }

    static int findMin() {
        int min = 0;
        for(int i=1;i<nums.size();i++){
            if(nums.get(i) < min){
                min = nums.get(i);
            }
        }
        return min;
    }

    static int compare(int i, int j) {
        i = nums.get(i);
        j = nums.get(j);
        if(i > j) {
            return 1;
        } else if( j > i){
            return -1;
        } else if(i == j){
            return 0;
        } else{
            return i;
        }
        //compare the values stored in the array at index position i and j.  
        //if the value at i is greater, return 1.
        // if the value at j is greater, return -1.
        // if the two values are equal, return 0.
    }

    static int append(int n) {
        nums.add(n);
        //add a new value to the values list. return that value after adding it to the list.
        return n;
    }

}
