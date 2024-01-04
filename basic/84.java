
//Write a Java program to calculate the average value of array elements
class eightyFour {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.util.ArrayList<Integer> arr = new java.util.ArrayList<>();
        int sum = 0;

        try {
            System.out.println("Enter the elements of the array:");
            String[] values = input.readLine().split(" ");

            for(String i : values)
                arr.add(Integer.parseInt(i));

            for (int num : arr) 
                sum += num;
            
            System.out.println("Average of the elements in the array: " + (double) (sum / arr.size()));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}