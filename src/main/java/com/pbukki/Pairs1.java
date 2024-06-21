package com.pbukki;

import java.io.Serial;
import java.io.Serializable;


/*
  We use (&) in order for the type parameters be of types
  that implements more than one interface // can have multiple bounds
*/

public class Pairs1<K,V extends Comparable<V> & Serializable> implements Comparable<Pairs1<K,V>>, Serializable
{
    private K key;
    private V value;
    @Serial
    private  static final long serialVersionUID = 1L;

    public Pairs1(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pairs1{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    @Override
    public int compareTo(Pairs1<K, V> o) {
        return this.value.compareTo(o.value);
    }
}
