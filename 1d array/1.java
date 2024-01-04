
//Program to copy all elements of one array into another array

import java.util.ArrayList;
import java.util.Arrays;
class copy{
    public static void main(String args[])
    {
    ArrayList arr1 = new ArrayList();
    int arr2[] = {1,2,4,5,6};

    for(int i=0; i < arr2.length ;i++)
    {
        arr1.add(arr2[i]);
    }

    System.out.println("Original array : "+ Arrays.toString(arr2));
    System.out.println("copy of the array: "+arr1);

    }

}