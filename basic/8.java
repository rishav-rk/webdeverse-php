
//Write a Java program to convert a binary number to decimal number
import java.util.ArrayList;
class convert{
    ArrayList<Integer> binary = new ArrayList<Integer>();
    String num;

    void input()
    {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        try{this.num = input.readLine();}
        catch(java.io.IOException a)
            {a.getMessage();}  
    }

    void todecimal(String n)
    {
         for(int i=0;i< n.length();i++)
        { this.binary.add(Character.getNumericValue(n.charAt(i)));  }
       
        int sum=0;
        for(int i=0;i< this.binary.size();i++)
        { sum += this.binary.get(i)*(Math.pow(2,this.binary.size()-i-1));  }

        System.out.println("Decimal conversion = "+ sum);
    }

    public static void main(String str[])
    {
        convert test = new convert();
        test.input();
        test.todecimal(test.num);
    }
}