
//Java Program to find volume of cuboid
class volume
{
	java.util.Scanner s1 =new java.util.Scanner(System.in);
	double l,b,h;
	volume()
	{
		System.out.print("Object is created");
	}
	void input()
	{
		System.out.print("\nEnter the length of cuboid :- ");
		l=s1.nextDouble();
		System.out.print("\nEnter the Breadth of cuboid :- ");
		b=s1.nextDouble();
		System.out.print("\nEnter the height of cuboid :- ");
		h=s1.nextDouble();
	}
	void volume()
	{
		System.out.print("\nVolume of cuboid of length "+l+" Breadth "+b+" height "+h +" will be :- "+(l*b*h));
	}
	public static void main(String arr[])
	{
		volume v1=new volume();
		v1.input();
		v1.volume();
	}
}