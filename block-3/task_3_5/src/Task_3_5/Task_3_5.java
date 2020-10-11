package Task_3_5;

import java.util.regex.*;

public class Task_3_5 {
    public static void main(String[] args)
    {
        System.out.println("Result 1: "+isValidHexCode("#CD5C5C")); //true
        System.out.println("Result 2: "+isValidHexCode("#EAECEE")); //true
        System.out.println("Result 3: "+isValidHexCode("#eaecee")); //true
        System.out.println("Result 4: "+isValidHexCode("#CD5C58C")); //false
        System.out.println("Result 5: "+isValidHexCode("#CD5C5Z")); //false
        System.out.println("Result 6: "+isValidHexCode("#CD5C&C")); //false
        System.out.println("Result 7: "+isValidHexCode("CD5C5C")); //false
    }
    private static boolean isValidHexCode(String str)
    {
        Pattern pattern = Pattern.compile("^#([A-Fa-f0-9]{6})$");
        Matcher matcher = pattern.matcher(str);
        if (str.charAt(0) != '#')
        {
            return false;
        }
        else if (str.length() != 7)
        {
            return false;
        }
        else return matcher.matches();
    }
}
