
//Write a Java Program to Search Key Elements in an Array
class oneHundredFour {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter elements of array : ");
            String[] elements = input.readLine().split(" ");

            java.util.ArrayList<Integer> array = new java.util.ArrayList<Integer>();
            for (String num : elements) 
                array.add(Integer.parseInt(num));

            System.out.print("Enter the key element to search: ");
            int key = Integer.parseInt(input.readLine());

            if (array.contains(key)) {
                System.out.println("Element " + key + " is present in the array.");
            } else {
                System.out.println("Element " + key + " is not present in the array.");
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}