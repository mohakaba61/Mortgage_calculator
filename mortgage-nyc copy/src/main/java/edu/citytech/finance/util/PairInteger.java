package edu.citytech.finance.util;

public class PairInteger {

    private int key;
    private int value;

    public PairInteger(int value, int key){
        this.key= key;
        this.value= value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PairInteger{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
