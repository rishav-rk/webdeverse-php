// Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.

import java.util.Date;
import java.text.SimpleDateFormat;
class Airplane {
private String flightNumber;
private String destination;
private String departureTime;

public Airplane(String flightNumber, String destination, String departureTime) {
this.flightNumber = flightNumber;
this.destination = destination;
this.departureTime = departureTime;
}

public String getFlightStatus() {
return "Flight " + flightNumber + " to " + destination + " is scheduled to depart at " + departureTime + ".";
}

public void delay(int delayInMinutes) {
departureTime = new SimpleDateFormat("HH:mm").format(new Date(new Date().getTime() + delayInMinutes * 60000));
}

public static void main(String[] args) {
Airplane flight1 = new Airplane("AA1234", "New York", "10:30");
System.out.println(flight1.getFlightStatus());

flight1.delay(30);
System.out.println("Flight status after delay: " + flight1.getFlightStatus());
}
}