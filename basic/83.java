
//Write a Java program to find the index of an array element
class eightyThree {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.util.ArrayList<Integer> arr = new java.util.ArrayList<>();

        try {
            System.out.println("Enter the elements of the array:");
            String[] values = input.readLine().split(" ");

            for(String i : values)
                arr.add(Integer.parseInt(i));
            
            System.out.print("Enter the element to find its index: ");
            int target = Integer.parseInt(input.readLine());

            int index = arr.indexOf(target);

            if (index != -1) {
                System.out.println("Index of " + target + ": " + index);
            } else {
                System.out.println(target + " not found in the array.");
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}