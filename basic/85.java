
//Write a Java program to test if an array contains a specific value
class eightyFive {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.util.ArrayList<Integer> arr = new java.util.ArrayList<>();

        try {
            System.out.println("Enter the elements of the array:");
            String[] values = input.readLine().split(" ");

            for(String i : values)
                arr.add(Integer.parseInt(i));

            System.out.print("Enter the value to check: ");
            int target = Integer.parseInt(input.readLine());

            if (arr.contains(target)) {
                System.out.println(target + " is present in the array.");
            } else {
                System.out.println(target + " is not present in the array.");
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}