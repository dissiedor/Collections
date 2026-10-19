package org.example;

@FunctionalInterface
public interface Function<T> {
    T apply(T o);
}