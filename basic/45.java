
//Java Program to calculate electricity bill
import java.util.Scanner;
class electricBill{
	void CalcBill(){
		System.out.println("Program to calculate Electricity Bill");
		Scanner scan = new Scanner(System.in);
		double rate, unit, total;
		System.out.print("Enter the rate per unit (in rupees) : ");
		rate = scan.nextInt();
		System.out.print("Enter the number of units consumed : ");
		unit = scan.nextInt();
		total = rate * unit;
		System.out.println("Total Electricity Bill is : " + total);
	}
	public static void main(String args[]){
		electricBill obj = new electricBill();
		obj.CalcBill();
	}
}