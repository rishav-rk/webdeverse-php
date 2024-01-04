//How to convert Decimal to Hex

class DecimalToHexConversion {
public static void main(String[] args) {
// Decimal number
int decimalNumber = 255;

// Convert decimal to hex
String hexString = Integer.toHexString(decimalNumber);

// Display the results
System.out.println("Decimal number: " + decimalNumber);
System.out.println("Converted to Hex: " + hexString.toUpperCase());
}
}