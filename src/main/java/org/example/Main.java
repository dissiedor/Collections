package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static <T> Map<T, Integer> countElements(T[] array) {
        Map<T, Integer> result = new HashMap<>();
        for (T element : array) {
            result.put(element, result.getOrDefault(element, 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        //Задача 1
        Integer[] numbers = {1, 2, 3, 4, 5};
        Integer[] resultNumbers = ArrayMapper.arrayMapping(
                numbers,
                number -> number * 2
        );
        System.out.println(Arrays.toString(resultNumbers));

        String[] words = {"ddddd", "aaaaaa", "bbbbb"};
        String[] resultWords = ArrayMapper.arrayMapping(
                words,
                word -> word.toUpperCase()
        );
        System.out.println(Arrays.toString(resultWords));

        //Задача 2
        String[] str = {"aaa", "bb", "aaa", "aaa", "aaa", "bb"};
        Map<String, Integer> result = countElements(str);
        System.out.println(result);
    }
}
