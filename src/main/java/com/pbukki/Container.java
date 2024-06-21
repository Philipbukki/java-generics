package com.pbukki;

public class Container<T> {
//    private T value;

//    the below code does not work as the type
//    parameter T cannot be referenced from a static context (T is none static type)
//    public static T myVal;

    private T value = (T) "Health"; //bad practice

    public Container(T value) {
        this.value = value;
    }
    // no args constructor
    public Container(){

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
