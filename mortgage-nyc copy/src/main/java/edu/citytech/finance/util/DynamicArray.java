package edu.citytech.finance.util;


import com.jbbwebsolutions.ds.facade.IList;

import java.util.function.Consumer;
import java.util.function.IntFunction;

public class DynamicArray<T extends Comparable <T>> implements IList<T> {
    private T [] items;
    private int size;
    private IntFunction<T[]> intFunction;

    public DynamicArray(IntFunction<T[]> intFunction){
        this(3, intFunction);
    }
    public DynamicArray(int length, IntFunction<T[] > intFunction){

        if(length<=0){
            length=1;
        }
        this.intFunction= intFunction;
        this.items= intFunction.apply(length);


    }

    @Override
    public void setConsumer(Consumer<T> consumer) {

    }
    @Override
    public void insert(T newItem) {
        //Check to see if the array is full
        if (items.length==size){

            T [] newItems =this.intFunction.apply(size*2);
            for(int i=0; i<size;i++){
                newItems[i]= items[i];
            }
            items=newItems;
        }
        this.items[size]= newItem;
        size++;

    }
    @Override
    public void inserts(T... newItems){
        for (T c: newItems)
            insert(c);
    }
    @Override
    public T [] toArray(){
        T [] storedValues= this.intFunction.apply(size);
        for(int i=0;i<storedValues.length;i++){
            storedValues[i]=items[i];
        }

        return storedValues;
    }

    /*
     * creating others methods, so it can be used by the T object
     */
    @Override

    public int size() {
        return this.size;
    }

    @Override
    public void removeAt(int deleteIndex) {
        if (deleteIndex <0 || deleteIndex >=size){
            String message ="Invalid number %s, current size of the index is %s"
                    + "the valid range is between 0 and %s";
            message = String.format(message, deleteIndex, size, size-1);

            throw new IllegalArgumentException(message);
        }

        for(int i= deleteIndex;i<size;i++){
            items[i] = items[i + 1];

        }
        size--;
    }

    @Override public String toString(){
        T [] values= this.toArray();
        String message="Array values: ";
        for(T c: values){
            message+=c + " ";
        }
        return message;
    }
    @Override
    public Integer[] findAll(T searchValue) {
        DynamicArray <Integer> da = new DynamicArray<Integer>(size, Integer[]::new);

        for (int i=0;i<size;i++){
            if(items[i].compareTo(searchValue)==0){
                da.insert(i);
            }
        }
        return da.toArray();
    }

    @Override
    public boolean remove(T t) {
        return false;
    }
    @Override
    public void removeLastItem(){
        size--;
    }
    @Override
    public void removeAll(){
        size=0;
    }
    @Override
    public T get(int index) {
        if(index<0 || index>=size){
            String message= "Invalid number %s, current size of the index is %s "
                    + "the valid range is between 0 and %s";

            message= String.format(message, index, size, size-1);
        }

        return items[index];
    }
    @Override
    public T getLastItem(){
        return items[size-1];
    }

}
