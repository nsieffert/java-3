package lambda_streams;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import static lambda_streams.Numbers.nums;
import static lambda_streams.Animals.animals;

public class Main {

    public static void main(String[] args) {
      //  Numbers numbers = new Numbers();
//        System.out.println(numbers.isEven.test(0));
//        System.out.println(numbers.isOdd.test(3));
//        System.out.println(numbers.isPrime.test(3));
       // System.out.println(numbers.added.compute1(nums));
//        System.out.println(numbers.subtracted.compute1(nums));
//        System.out.println(numbers.multiplied.compute1(BigInteger.ONE));
//        System.out.println(numbers.divided.compute2(3, 5));
//        System.out.println(numbers.findMax.compute1(nums));
//        System.out.println(numbers.findMin.compute1(nums));
//        System.out.println(numbers.compare.compute2(0, 13));
//        System.out.println(numbers.append.compute1(42));

        Animals animal = new Animals();
        System.out.println("original animals : " + animals.toString());
        System.out.println("+++++++++++++++++");
        animal.capsFirst(animals, false);
        System.out.println("+++++++++++++++++");
        animal.capsFirst(animals, true);
        System.out.println("+++++++++++++++++");
        animal.lowerFirst(animals,false);
        System.out.println("+++++++++++++++++");
        animal.lowerFirst(animals,true);
        System.out.println("+++++++++++++++++");
        //System.out.println(animal.addAnimal("Coyote"));
        System.out.println("+++++++++++++++++");
        animal.flipAnimals(animals, true);
        System.out.println("+++++++++++++++++");
        animal.flipAnimals(animals, false);
        System.out.println("+++++++++++++++++");
        animal.sortAnimals(animals, true);
        System.out.println("+++++++++++++++++");
        animal.sortAnimals(animals, false);
        System.out.println("+++++++++++++++++");
    }
}
