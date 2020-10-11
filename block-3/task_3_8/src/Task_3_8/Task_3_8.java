package Task_3_8;

public class Task_3_8 {
    public static void main(String[] args)
    {
        System.out.println("Result 1: "+longestZero("01100001011000")); //0000
        System.out.println("Result 2: "+longestZero("100100100")); //00
        System.out.println("Result 3: "+longestZero("11111")); //
    }
    private static String longestZero(String str)
    {
        String[] subStr;
        int max = 0;
        String maxString = "";
        subStr = str.split("1");
        for (String elem: subStr)
        {
            if (elem.length() > max)
            {
                max = elem.length();
                maxString = elem;
            }
        }
        return maxString;
    }
}
