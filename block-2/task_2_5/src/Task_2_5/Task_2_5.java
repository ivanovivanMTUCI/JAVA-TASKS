package Task_2_5;

public class Task_2_5 {
    public static void main(String[] args)
    {
        getDecimalPlaces("43.20"); //2
        getDecimalPlaces("400"); //error
        getDecimalPlaces("3.1"); //1
    }
    private static void getDecimalPlaces(String number)
    {
        try {
            int res;
            String subNum = number.substring(number.indexOf('.'));  //subNum = ".#"
            char[] charNum = subNum.toCharArray();
            res = charNum.length - 1;
            System.out.println("Number of decimals: "+res);
        }
        catch(Exception e)
        {
            System.out.println("Error! Most likely, there are no decimals in a given number.");
        }
    }
}
