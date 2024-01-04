
//Write a Java program to find the common elements between two arrays
class eightyNine {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        System.out.println("Array 1: " + java.util.Arrays.toString(array1));
        System.out.println("Array 2: " + java.util.Arrays.toString(array2));

        java.util.HashSet<Integer> commonElements = new java.util.HashSet<>();

        for (int element : array1) {
            if (java.util.Arrays.binarySearch(array2, element) >= 0) {
                commonElements.add(element);
            }
        }

        System.out.println("Common elements: " + commonElements);
    }
}