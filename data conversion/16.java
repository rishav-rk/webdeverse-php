//How to convert long to int

class LongToIntConversion {
public static void main(String[] args) {
// Convert long to int using cast
long longValue = 987654321L;
int intValue1 = (int) longValue;

// Convert long to int using direct assignment
long longValue2 = 987654322L;
int intValue2 = (int) longValue2;

// Display the results
System.out.println("Original long value: " + longValue);
System.out.println("Converted to int (cast): " + intValue1);

System.out.println("Original long value: " + longValue2);
System.out.println("Converted to int (direct assignment): " + intValue2);
}
}