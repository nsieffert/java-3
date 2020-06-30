package lambda_streams;

public class Main {

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        System.out.println(numbers.isEven(0));
        System.out.println(numbers.isOdd(3));
        System.out.println(numbers.isPrime(3));
        System.out.println(numbers.added());
//        System.out.println(numbers.subtracted(1));
//        System.out.println(numbers.multipled());
//        System.out.println(numbers.divided());
//        System.out.println(numbers.findMax());
//        System.out.println(numbers.findMin());
//        System.out.println(numbers.compare(8, 9));
//        System.out.println(numbers.append(62));
    }
}
