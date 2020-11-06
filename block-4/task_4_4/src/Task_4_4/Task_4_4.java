package Task_4_4;

public class Task_4_4 {
    public static void main(String[] args)
    {
        System.out.println("Employee 1 pay calculation: " +
                overTime(9, 17, 30, 1.5));   //$240.00
        System.out.println("Employee 2 pay calculation: " +
                overTime(16, 18, 30, 1.8));  //$84.00
        System.out.println("Employee 3 pay calculation: " +
                overTime(13.25, 15, 30, 1.5));   //$52.50
    }

    private static String overTime(double start, double finish, double wage, double multiplier)
    {
        String finStr = "$";
        double finPay;
        //if (finish>17 && finish-start==8) : not relevant
        //determining if pay is with overtime
        if (finish>17)
            finPay = (17-start) * wage + (finish-17) * wage * multiplier;
        else
            finPay = (finish-start) * wage;
        //add formatted final pay value to a string
        finStr += String.format("%.2f",finPay);
        return finStr;
    }
}
