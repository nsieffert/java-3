package lambda_streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Animals {
    //This class will be using streams.
    static List<String> animals = Arrays.asList("peacoCK","rabbit","chiwawa","OranguTAN","vipeR","cobra","paNDa","bUffalo","DeeR","maLLard");

    public static void main(String[] args) {
        System.out.println("original animals : " + animals);

        //clean up the animals array by using the capsFirst() method. follow instructions in the method definition. 
        List<String> cleaned = capsFirst(animals, false);
        System.out.println(cleaned);

        //do not modify these addAnimal() method invocations
        addAnimal("rEIndeeR");
        addAnimal("Platypus");
        addAnimal("frOg");
        addAnimal("lEOpArD");
        //---------------------------------------


    //capsFirst(animals, true); - see main
      //  return animals;


        System.out.println(animals);
        List<String> lowered = lowerFirst(animals,false);
        System.out.println(lowered);
    }

    static List<String> capsFirst(List<String> animaList, boolean mutate) {
        Stream<String> stream = animals.stream();
        animals.iterator().toString().toLowerCase();
        stream.map(animal -> {
            if(mutate == false) {
                return animal;
        }
            return Character.toUpperCase(animal.charAt(0)) + animal.substring(1);
        }).collect(Collectors.toList());

        return animaList;
    }


    static String addAnimal(String animal) {
        Stream<String> stream = animals.stream();
        animals.add(animal);
        Collectors.toList();
        return animal;
    }


    static List<String> lowerFirst(List<String> animaList, boolean mutate) {
        Stream<String> stream = animals.stream();
        animals.iterator().toString().toUpperCase();
        stream.map(animal -> {
            if(mutate == false) {
                return animals;
            }
            return Character.toLowerCase(animal.charAt(0)) + animal.substring(1);
        }).collect(Collectors.toList());

        return animaList;
    }


    static List<String> flipAnimals(List<String> animaList, boolean mutate) {
        Stream<String> stream = animals.stream();
        if(mutate == false) {
            return animals;
        }
        Collectors.collectingAndThen(Collectors.toList(), list -> {
            Collections.reverse(animals);
            return animals.stream();
        });

        return animaList;
    }

//        List<String> instructions = Arrays.asList("Flip","the","animals","list","."," ",
//        "Mutate","the","animals","only","if","flag","true");
//        return instructions;
//    };

    static List<String> sortAnimals(List<String> animaList, boolean mutate) {
        Stream<String> stream = animals.stream();
        if(mutate == false) {
        return animals;
        }
        Collectors.collectingAndThen(Collectors.toList(), list -> {
        Collections.sort(animals);
        return animals.stream();
        });
        return animaList;
        }
    }

