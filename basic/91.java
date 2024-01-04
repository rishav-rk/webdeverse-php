
//Write a Java program to convert an array to ArrayList
import java.util.ArrayList;
import java.util.Arrays;

class ninetyOne {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int value : array) 
            arrayList.add(value);

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Converted ArrayList: " + arrayList);
    }
}