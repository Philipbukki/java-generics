package com.pbukki;

public class Box<T> extends Container1{

    private T anotherValue;

    public Box(T value, T anotherValue){
        super(value);
        this.anotherValue = anotherValue;
    }

    public T getAnotherValue() {
        return anotherValue;
    }


    @Override
    public String toString() {
        return "Box{" +
                "Value='" + getValue() + '\'' +
                "anotherValue='" + anotherValue + '\'' +
                '}';
    }


/*
   the below only works for Box with Number as the parameter type
   to enforce this to work with integer parameter types as well
   we use wildcards as shown below
   There are 3 types of wildcards, unbounded, upper bounded and lower bounded
   <?> - unbounded
   <? extends Number> - works with any parameter that extends Number class(lower bounded)
   <? super Integer> - works with parameter types that are integer or superclass of integer(Number or Object)
   public static void printBoxDetails(Box<Number> box){
*/

    public static void printBoxDetails(Box<? extends Number> box){
        Number value = (Number) box.getValue();
        Number anotherValue = box.getAnotherValue();
        System.out.println("Value: " + value + ", anotherValue: " + anotherValue);

    }

    public static void main(String[] args) {
        Container1<Integer> c = new Box(20,"Vee");
        System.out.println(c);
        Box<Number> box1 = new Box<>(16,18);

        // below code does not work as printBoxDetails expect a box
        // with Number as the generic type
        // This is where wildcards come in

        printBoxDetails(box1);
//        System.out.println("Value: " + box1.getValue() +" "+ "Another Value: " + box1.getAnotherValue());
//        System.out.println("Value: " + c.getValue() +" "+"Another Value");
    }
}
