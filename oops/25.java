// Create a class, entering the command line arguments from the user and show all the arguments as output.

class pro24 {
public static void main(String[] args) {
// Check if any arguments were provided
if (args.length == 0) {
System.out.println("No command-line arguments provided.");
} else {
System.out.println("Command-line arguments:");
// Display all command-line arguments provided by the user
for (int i = 0; i < args.length; i++) {
System.out.println("Argument " + (i + 1) + ": " + args[i]);
}
}
}
}