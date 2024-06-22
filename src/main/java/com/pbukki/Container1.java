package com.pbukki;

public class Container1<T> {
    private T value;
    public Container1(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Container1{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}
