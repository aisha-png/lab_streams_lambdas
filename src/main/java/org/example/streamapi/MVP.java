package org.example.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MVP {



    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */

    public void printNames(List<String> names) {
        // Implement me :)
        names.stream().forEach(System.out::println);

    }

    /*
        Given a List<Integers>, return a List<Integer> with event numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
        // Implement me :)
        //return null;
        return numbers.stream().filter(num -> 0 == num % 2).collect(Collectors.toList());
    }

    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {
        // Implement me :)
        //return null;
        return Arrays.stream(numbers)
                //.filter(num -> num*2)
                .map(num -> num*2).toArray();

    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {
        // Implement me :)
        //Arrays.stream converts an array into a stream
        return Arrays.stream(input.split("")).map(str -> str.toUpperCase()).collect(Collectors.toList());
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
        // Implement me :)
        //return null;
        return list.stream()
                .filter(s -> s.startsWith(letter))
                .map(String::toUpperCase).sorted().toList();
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */


    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        // Implement me :)
        //return null;
        return words.stream()
                .filter(str -> str.length() < maxLength && str.startsWith(firstLetter)).collect(Collectors.toList());
                //.filter(str -> str.startsWith(firstLetter))
                //.filter(str -> str.length(maxLength())).collect(Collectors.toList());
    }


}