package com.pbukki;

import java.util.List;

public class Utility {

    /**
    * swaps two elements in a list
    * @param list - list of items
    * @param index1 first element for the swap
    * @param index2 second element to be swapped
    **/

/*   the method below should be static as it does not
     use any member variables of the Utility class
     since T cannot be referenced from a static reference
     we define it at the method level and remove T at the class level
     public void swap(List<T> list, int index1, int index2){
 */

    public static <T> void swap(List<T> list, int index1, int index2){

        T val1 = list.get(index1);
        T val2 = list.get(index2);

        list.set(index1, val2);
        list.set(index2, val1);
    }


    public static boolean compare(Pair<String,Integer> pair1, Pair<String,Integer> pair2)
    {
        return pair1.getKey().equals(pair2.getKey()) && pair1.getValue().equals(pair2.getValue());

    }




    public static <K,V> void printDetails(K key, V value){
        System.out.println(key + ": " + value);
    }

    /**
     * @param <K> pair key
     * @param <V> pair value
    * */

    public static <K extends Comparable<K>,V extends Number> Pair<K,V> returnLarger(Pair<K,V> pair1, Pair<K,V> pair2)
    {
        if(pair1.getKey().compareTo(pair2.getKey()) > 0){
            return pair1;
        }else if(pair2.getKey().compareTo(pair1.getKey()) < 0){
            return pair2;
        }
        return pair1;
    }

/*
    this overloading cannot work as overloading
    does not work for the generic type of the input arguments
*/

/*    public void swap(List<Integer> list, int index1, int index2){
        int val1 = list.get(index1);
        int val2 = list.get(index2);

        list.set(index1, val2);
        list.set(index2, val1);
    }*/
}
