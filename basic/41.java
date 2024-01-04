
//Java program to calculate average marks
class p41{
public static void main(String args[]){
java.util.Scanner a=new java.util.Scanner(System.in);
System.out.println("Enter the total number of subjects = ");
int n=a.nextInt();
double t=0;
for(int i=1; i<=n; i++){
System.out.println("Enter marks for subject-"+i+" :");
double m=a.nextDouble();
t +=m;
}
double average=t/n;
System.out.println("Your average is= "+average);
a.close();
}
}