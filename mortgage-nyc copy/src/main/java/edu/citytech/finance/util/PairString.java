package edu.citytech.finance.util;

public class PairString {

    private String key;
    private String value;

    public PairString(String value, String key){
        this.key= key;
        this.value= value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PairString{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
