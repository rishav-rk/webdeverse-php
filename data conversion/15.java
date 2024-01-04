//How to convert int to long

class IntToLongConversion {
public static void main(String[] args) {
// Convert int to long using cast
int intValue = 42;
long longValue1 = (long) intValue;

// Convert int to long using direct assignment
int intValue2 = 123456789;
long longValue2 = intValue2;

// Display the results
System.out.println("Original int value: " + intValue);
System.out.println("Converted to long (cast): " + longValue1);

System.out.println("Original int value: " + intValue2);
System.out.println("Converted to long (direct assignment): " + longValue2);
}
}