
//Write a Java program to check whether Java is installed on your computer or not
 class Main {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("java -version");
            process.waitFor();
            System.out.println("Java is installed on your system.");
        } catch (Exception e) {
            System.out.println("Java is not installed on your system.");
        }
    }
}
