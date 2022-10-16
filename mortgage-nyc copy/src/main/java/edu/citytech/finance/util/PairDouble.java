package edu.citytech.finance.util;

public class PairDouble {

    private double key;
    private double value;

    public PairDouble(double value, double key){
        this.key= key;
        this.value= value;
        Integer x;
    }

    public double getKey() {
        return key;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PairDouble{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
