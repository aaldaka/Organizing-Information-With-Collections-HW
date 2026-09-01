// Homework: Organizing Information With Collections

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
    }

    public static int[] findLargestAndSmallest(int[] array) {
        int smallest = array[0];
        int biggest = array[0];
        int[] res = new int[2];

        for (int i =1; i<array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }else if (array[i] > biggest){
                biggest = array[i];
            }
        }
        res[0] = smallest;
        res[1] = biggest;
        return res;
    }

    public static Object[] removeDuplicatesFromArray(int[] array) {
        HashSet<Integer> noDupes = new HashSet<>();
        for (int num: array){
            noDupes.add(num);
        }
        return noDupes.toArray();
    }

    public static int sumOfTwoLargest(int[] array) {
        int big1, big2;
        if (array.length == 0){
            return 0;
        }else if (array.length ==1){
            return array[0];
        }else{
            if (array[0] > array[1]) { //making sure the right values swap and we're not
                big1 = array[0];
                big2 = array[1];
            }else {
                big1 = array[1];
                big2 = array[0];
            }
            for (int i =2; i< array.length; i++) {
                if (array[i] > big1) {
                    big2 = big1;
                    big1 = array[i];
                } else if (array[i] > big2) {
                    big2 = array[i];
                }
            }
        }
        return (big1+big2);
    }
}
