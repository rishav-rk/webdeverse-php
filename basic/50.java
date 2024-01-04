
//Java Pogram To Find Distance Between Two Points
class Distance{
    int Formula(double x1, double x2, double y1, double y2){
        int sol = (int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return sol;
    }
}
class Points{
    public static void main(String a[]){
        double x1, x2, y1, y2;
        x1 = 4;
        x2 = 0;
        y1 = 3;
        y2 = 0;
        Distance obj = new Distance();
        int ans = obj.Formula(x1,x2,y1,y2);

        System.out.println("Distance Between Two Points is "+ans);
    }
}