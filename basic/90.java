
//Write a Java program to find the duplicate values of an array of integer values
class ninety {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter values of array: ");
            String[] strArray = input.readLine().split(" ");
            java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();

            for (String str : strArray) {
                arrayList.add(Integer.parseInt(str));
            }

            java.util.Vector<Integer> track = new java.util.Vector<>();
            java.util.HashSet<Integer> duplicates = new java.util.HashSet<>();

            for(int num : arrayList){
                if(track.contains(num)){
                    duplicates.add(num);
                } else {
                    track.add(num);
                }
            }

            System.out.println("Duplicate values in the array: " + duplicates);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers separated by spaces.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}