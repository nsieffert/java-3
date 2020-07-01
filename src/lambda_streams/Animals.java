package lambda_streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Animals {
    //This class will be using streams.
    static List<String> animals = Arrays.asList("peacoCK", "rabbit", "chiwawa", "OranguTAN", "vipeR", "cobra", "paNDa", "bUffalo", "DeeR", "maLLard");
    List<String> animaList = new ArrayList<>();
    List<String> animaList1 = Arrays.asList("Coyote");
    List<String> animaList2 = Arrays.asList("Bear", "Chicken", "Cow", "Dog", "Egret", "Frog", "Goat");
    List<String> animaList3 = Arrays.asList("Sheep");

    public static void main(String[] args) {
        System.out.println("original animals : " + animals);

        //clean up the animals array by using the capsFirst() method. follow instructions in the method definition. 
        // List<String> cleaned = capsFirst(animals, false); // no idea what this is
        // System.out.println(cleaned);

        //do not modify these addAnimal() method invocations
//        addAnimal("rEIndeeR");
//        addAnimal("Platypus");
//        addAnimal("frOg");
//        addAnimal("lEOpArD");
        //---------------------------------------


        // capsFirst(animals, true);
        //   return animals;


//        System.out.println(animals);
//        List<String> lowered = lowerFirst(animals,false);
//        System.out.println(lowered);
    }

    oneFunction<List<String>> capsFirst = animaList -> {
        Supplier<Stream<String>> streamSupplier = () -> animals.stream();
        Stream<String> lowerCaseStream = streamSupplier.get().map((String animal) -> {
            return animal.toLowerCase();
        });
        Supplier<Stream<String>> upperCaseStream = () -> lowerCaseStream.map((String animal) -> {
            return animal.substring(0, 1).toUpperCase() + animal.substring(1);
        });

        upperCaseStream.get().forEach((String animal) -> {
            System.out.println("Caps first " + animal);
        });

        return animaList;
    };

    oneFunction<List<String>> addAnimal = (List<String> animals) -> {
        animaList1 = Stream.concat(animaList1.stream(), animals.stream()).parallel()
                .collect(Collectors.toList());
        System.out.println(animaList1);
        return animaList1;
    };
    oneFunction<List<String>> lowerFirst = animaList -> {
        Supplier<Stream<String>> streamSupplier = () -> animals.stream();
        Stream<String> upperCaseStream = streamSupplier.get().map((String animal) -> {
            return animal.toUpperCase();
        });
        Supplier<Stream<String>> lowerCaseStream = () -> upperCaseStream.map((String animal) -> {
            return animal.substring(0, 1).toLowerCase() + animal.substring(1);
        });

        lowerCaseStream.get().forEach((String animal) -> {
            System.out.println("lowerFirst " + animal);
        });

        return animaList;
    };

    oneFunction<List<String>> flipAnimals = animaList -> {

        Supplier<Stream<String>> streamSupplier = () -> animals.stream();
        animals.stream().sorted(Collections.reverseOrder()).forEach((String animal) -> {
            System.out.println("Flip animals " + animal);
        });
        return animaList;
    };

    oneFunction<List<String>> sortAnimals = animaList -> {
        Supplier<Stream<String>> streamSupplier = () -> animals.stream();
        animaList.stream().sorted(Comparator.naturalOrder()).forEach((String animal) -> {
            System.out.println("sort animals " + animal);
        });
        return animaList;
    };
}



        //animaList.stream().sorted().forEach(System.out::println);
        //animals.stream().sorted().collect(Collectors.toList());
       // animaList.forEach(System.out::println);
        //System.out.println("Animal List " + animaList);


    //Bonus try: add a new lambda function that adds random animals to an array
//    oneFunction<List<String>> randomAnimals = animaList2 -> {
//    Random random = new Random();
//    int index = random.nextInt(animaList2.size());
//    int a = vals.charAt(index);


