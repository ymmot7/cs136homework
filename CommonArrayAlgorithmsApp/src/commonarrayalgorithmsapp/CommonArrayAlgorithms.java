package commonarrayalgorithmsapp;

import java.util.Arrays;

public class CommonArrayAlgorithms {

    public String arrayToString(int[] array) {
        String stringArray = "";    //empty string to add to
        if (array.length == 1) {
            return (Integer.toString(array[0])); //return length 1 array
        }
        else {
            for (int i = 0; i < array.length; i++) {    //loop through array
                stringArray += array[i];    //add each value to stringArray
                if (i < array.length - 1) {
                    stringArray += "|";     // add a | after every value except the last
                }
            }
            return stringArray;
        }
    }

    public int arraySum(int[] array) {
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {    //loop through array
            arraySum += array[i];   //add onto arraySum each loop to get sum of array
        }
        return arraySum;
    }

    public double arrayAvg(int[] array) {
        double arrayLength = array.length;  //cast one of the numbers as a double so the answer will be a double
        return arraySum(array) / arrayLength;   //return the sum of the array / # of values for average
    }

    public int arrayMax(int[] array) {
        int arrayMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > arrayMax) { //if index of array is greater than the previous values, it becomes the new max
                arrayMax = array[i];
            }
        }
        return arrayMax;

    }

    public int arraySearch(int[] array, int searchValue) {
        int searchIndex = -1;   //initialize searchIndex to -1
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {      //loop through array to see if searchIndex is a value in array
                searchIndex = i;    //set searchIndex to index value
            }
        }

        return searchIndex;
    }

    public boolean arraySwap(int[] array, int index1, int index2) {
        boolean isSuccess = true;
        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            isSuccess = false;  //check conditions to make sure swap can be successful
            return isSuccess;
        }
        else {
            int temp1 = array[index1];
            array[index1] = array[index2];  //swap index1 and index2
            array[index2] = temp1;
            return isSuccess;
        }
    }

    public int[] arrayGrowDouble(int[] array) {
        int[] doubleArray = new int[array.length * 2];  //create a new array twice the size of the original
        for (int i = 0; i < array.length; i ++) {
            doubleArray[i] = array[i];  //add the original array's values into the new array
        }
        return doubleArray;
    }
}
