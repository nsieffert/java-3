package lambda_streams;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Animals {
    //This class will be using streams.
    static List<String> animals = Arrays.asList("peacoCK", "rabbit", "chiwawa", "OranguTAN", "vipeR", "cobra", "paNDa", "bUffalo", "DeeR", "maLLard");
    List<String> animaList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("original animals : " + animals);

        //clean up the animals array by using the capsFirst() method. follow instructions in the method definition. 
        List<String> cleaned = capsFirst(animals, false); // no idea what this is
        System.out.println(cleaned);

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

    static List<String> capsFirst(List<String> animaList, boolean mutate) {
        if (mutate == false) {
            return animals;
        } else {
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
        }

//    static String addAnimal(String animal) {
//        Supplier<Stream<String>> streamSupplier = () -> animals.stream();
//        animals.add(animal);
//        Collectors.toList();
//        return animal;
//    }
    }

    static List<String> lowerFirst(List<String> animaList, boolean mutate) {
        if (mutate == false) {
            return animals;
        } else {
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
        }
    }

    static List<String> flipAnimals(List<String> animaList, boolean mutate) {
        if (mutate == false) {
            return animals;
        }
        Supplier<Stream<String>> streamSupplier = () -> animals.stream();
        animals.stream().sorted(Collections.reverseOrder()).forEach((String animal) -> {
            System.out.println("Flip animals " + animal);
        });
        return animaList;
    }

    static List<String> sortAnimals(List<String> sortedList, boolean mutate) {
        if (mutate == false) {
            return animals;
        }
        sortedList = animals.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        return sortedList;
    };
}



