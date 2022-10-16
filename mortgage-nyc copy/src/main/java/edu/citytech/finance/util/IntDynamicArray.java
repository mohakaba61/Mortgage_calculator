package edu.citytech.finance.util;

public class IntDynamicArray {
    private int [] items;
    private int count;

    public IntDynamicArray(){
        this(2);
    }
    public IntDynamicArray(int length){
        if(length<=0){
            length=1;
        }
        this.items= new int[length];

    }


    public int [] toArray(){
        int [] storedValues= new int[count];
        for(int i=0;i<storedValues.length;i++){
            storedValues[i]=items[i];
        }

        return storedValues;
    }

    public void insert(int newItem) {
        //Check to see if the array is full
        if (items.length==count){

            int [] newItems =new int [count*2];
            for(int i=0; i<count;i++){
                newItems[i]= items[i];
            }
            items=newItems;
        }
        this.items[count]= newItem;
        count++;

    }

    public void inserts(int... newItems){
        for (int c: newItems)
            insert(c);
    }
    public int size() {
        return this.count;
    }

    public void removeAt(int deleteIndex) {
        if (deleteIndex <0 || deleteIndex >=count){
            String message ="Invalid number %s, current size of the index is %s"
                    + "the valid range is between 0 and %s";

            message = String.format(message, deleteIndex, count, count-1);

            throw new IllegalArgumentException(message);

        }

        for(int i= deleteIndex;i<count;i++){
            items[i] = items[i + 1];

        }
        count--;
    }
    @Override public String toString(){
        int [] values= this.toArray();
        String message="Array values: ";
        for(int c: values){
            message+=c + " ";
        }
        return message;
    }

    public int[] findAll(int searchValue) {

        IntDynamicArray da= new IntDynamicArray();

        for (int i=0;i<count;i++){
            if(items[i]==searchValue){
                da.insert(i);
            }
        }
        return da.toArray();
    }
    public void removeLastItem(){
        if(count==0)
            throw new IllegalArgumentException("The array is empty");
        count--;
    }
    public void removeAll(){
        count=0;
    }
    public int get(int index) {
        if(index<0 || index> count-1)
            throw new IllegalArgumentException("Index to the value " +
                    "doesn't exist!\n NOTE: The index of an array can not be negative");

        return items[index];
    }

    public int getLastItem(){
        if(count == 0)
            throw new IllegalArgumentException("The array is empty");
        return items[count-1];
    }
}
