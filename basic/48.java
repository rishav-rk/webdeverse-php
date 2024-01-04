
//Java Program To Calculate Batting Average
class batting_average
{
    public static void main(String arg[]) throws java.io.IOException
    {
        java.io.BufferedReader input= new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.println("Enter the total number of hits or runs scored : ");
        int runs = Integer.parseInt(input.readLine());
        System.out.println("Enter the number of at-bats(baseball hit attempts) or outs : ");
        float outs = Integer.parseInt(input.readLine());
        float ans = runs/outs;
        System.out.println("The batting average of the player is : "+ans);
    }
}