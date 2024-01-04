
// Write a program to find out first non repeated character from input String?
class check {
    public static void main(String[] args) {
        String str = "HelloWorld";
        char c = getChar(str);
        if(c != 0){
            System.out.println("The first non repeated character is " + c);
        }else{
            System.out.println("No unique character found");
        }
    }

    private static char getChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                return c;
            }
        }
        return 0;
    }
}
