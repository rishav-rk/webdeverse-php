//Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.

class Bank 
{

String account;
String name;
Float bal=0.0f;

void add(String a,String n,float am)
{

account=a;
name=n;
bal=am;
System.out.println("Successfully created");
} 

void delete(String a)
{
if(account==a)
{
account=null;
name=null;
System.out.println("Successfull deleted\nCollet Amount = " +bal);
bal=0.0f;
}
else
{
System.out.println("Account does not exist");
}

}


void deposit(int b)
{

bal=bal+b;
System.out.println("Amount " +b+ " Successfully deposited\nCurrent balance = " +bal+ "\n");
}

void withdraw(int b)
{
if (b>0 && b<=bal)
{
System.out.println("Collect your amount = " +b);
bal=bal-b;
System.out.println("Current balance = " +bal+ "\n");
}
else
{
System.out.println("Insufficient balance");
}
}

}

class Account
{

String Adhar,Pen,name,account;

Account(String A,String P,String N)
{
Adhar=A;
Pen=P;
name=N;
account=A;
}

void details(String s)
{
if(s==Adhar || s==Pen || s==account)
{
System.out.println("Account no = " +account+ "\nPen = " +Pen+ "\nName = " +name+ "\nAdhar = " +Adhar);
}


}

public static void main(String args[])

{
Account obj1 = new Account("123456789","A12345678","Rohit");
Bank objA1=new Bank();
objA1.add("123456789","Rohit",10000);

objA1.deposit(1000);
objA1.withdraw(3000);
objA1.delete("123456789");

System.out.println("\n\n");
obj1.details("123456789");

}


} 