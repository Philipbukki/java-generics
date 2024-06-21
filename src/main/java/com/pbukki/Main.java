package com.pbukki;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Utility1.readLarger();


        Consumer<String> cons = System.out::println;
        cons.accept("Hello");

        Pairs1<String,Integer> pair1 = new Pairs1<>("A",20);
        Pairs1<String,Integer> pair2 = new Pairs1<>("A",27);

        List<Pairs1<String,Integer>> list = new ArrayList<>(Arrays.asList(pair1,pair2));
//        Collections.reverse(list);
        Collections.sort(list);
        System.out.println(list);


        Pairs1<String,Integer> res = Utility1.getLargerPair(pair1, pair2);
        System.out.println(res);

//        Pair<String,Integer> largest = Utility.returnLarger(pair1, pair2);
//        System.out.println(largest);


//        int res = pair1.compareTo(pair2);
//        System.out.println("res: " + res);



//       boolean result =  Utility.compare(pair1, pair2);
//       System.out.println(result);

        Utility.printDetails("Name","Vero");

        List<String> myList = Arrays.asList("cow", "dog","cat","hyena");
        List<Integer> myIntList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Utility.<Integer>swap(myIntList,4,5);
        Utility.swap(myList, 0, 1);

        System.out.println(myList);
        System.out.println(myIntList);

/*
        leads to error due to the generic value cast to string
        Container<Integer> myInt = new Container<>();
        int value = myInt.getValue();
        System.out.println(value);
*/

        Container<Integer> intContainer = new Container<>(11);
        System.out.println(intContainer.getValue());

        Container<String> stringContainer = new Container<>("Seyo");
        System.out.println(stringContainer.getValue());
    }
}