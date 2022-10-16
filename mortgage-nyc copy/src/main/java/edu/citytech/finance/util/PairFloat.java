package edu.citytech.finance.util;

public class PairFloat {

    private float key;
    private float value;

    public PairFloat(float value, float key){
        this.key= key;
        this.value= value;
    }

    public float getKey() {
        return key;
    }

    public float getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PairFloat{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
