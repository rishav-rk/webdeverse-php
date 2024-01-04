
//Program to prove String is immutable programmatically?

class string {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1;

        System.out.println("Before modification:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        str1 = str1 + " World";
        str2= str2+ " Java";

        System.out.println("After modification:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}
