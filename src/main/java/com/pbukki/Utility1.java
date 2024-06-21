package com.pbukki;

import java.io.*;

public class Utility1 {

    public static <K extends Comparable<K>,V extends Comparable<V> & Serializable> Pairs1<K,V>
    getLargerPair(Pairs1<K,V> p1, Pairs1<K,V> p2) throws IOException {

        if(p1.getKey().compareTo(p2.getKey()) == 0){
            if(p1.compareTo(p2) > 0){
                writeLarger(p1);
                return p1;
            }
            writeLarger(p2);
            return p2;

        } else if (p1.getKey().compareTo(p2.getKey()) > 0) {
            writeLarger(p1);
            return p1;
        }
        writeLarger(p2);
        return p2;

    }


    public static <K,V extends Comparable<V> & Serializable> void readLarger() throws IOException, ClassNotFoundException {
        String filePath = "D:\\philip\\Projects\\Generics\\src\\main\\java\\com\\pbukki\\file.txt";

        try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(
                new FileInputStream(filePath)
        ))){

            @SuppressWarnings("unchecked")
            Pairs1<K,V> pair = (Pairs1<K, V>)  ois.readObject();

            System.out.println(pair);
            System.out.println("Larger pair found");

        }finally{
            System.out.println("Reading completed");
        }
    }


    public static <K, V extends Comparable<V> & Serializable> void writeLarger(Pairs1<K,V> pair) throws IOException {
        String filePath = "D:\\philip\\Projects\\Generics\\src\\main\\java\\com\\pbukki\\file.txt";

        try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream
                (new FileOutputStream(filePath)))){

            oos.writeObject(pair);

        }finally {

            System.out.println("Writing completely");

        }

    }















}
