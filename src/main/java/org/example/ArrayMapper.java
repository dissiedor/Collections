package org.example;

import java.util.Arrays;

public class ArrayMapper {

    public static <T> T[] arrayMapping(T[] array, Function<T> function) {
        T[] result = Arrays.copyOf(array, array.length);
        for (int i = 0; i < result.length; i++) {
            result[i] = function.apply(array[i]);
        }
        return result;
    }
}