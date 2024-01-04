//How to convert Timestamp to Date

import java.sql.Timestamp;
import java.util.Date;

class TimestampToDateConversion {
public static void main(String[] args) {
// Create a Timestamp
Timestamp timestamp = new Timestamp(System.currentTimeMillis());

// Convert Timestamp to Date
Date date = new Date(timestamp.getTime());

// Display the results
System.out.println("Original Timestamp: " + timestamp);
System.out.println("Converted to Date: " + date);
}
}