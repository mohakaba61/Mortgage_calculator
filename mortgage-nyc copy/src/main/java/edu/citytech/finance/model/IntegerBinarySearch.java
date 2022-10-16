package edu.citytech.finance.model;

public class IntegerBinarySearch {
    public static int binarySearch(int searchValue, int[] data){

        int inputSize=data.length;
        int low=0;
        int high = inputSize-1;
        int middle=0;
        int positionFound=-1;
        int numberOfOperation=0;

        while(low<=high){
            ++numberOfOperation;
            middle=(low+high)/2;

            if(data[middle]==searchValue){
                positionFound=middle;
                break;
            } else if (data[middle]<searchValue) {
                low= middle+1;
            } else if (data[middle]>searchValue) {
                high = middle-1;
            }
        }
        System.out.println("Number of Operation: "+ numberOfOperation);
        return positionFound;
    }




}
