package Task_4_7;

public class Task_4_7 {
    public static void main(String[] args)
    {
        System.out.println("Converted string 1: " + toStarShorthand("abbccc"));  //"ab*2c*3"
        System.out.println("Converted string 2: " + toStarShorthand("77777geff"));   //"7*5gef*2"
        System.out.println("Converted string 3: " + toStarShorthand("abc")); //"abc"
        System.out.println("Converted string 4: " + toStarShorthand(""));    //""
    }

    private static String toStarShorthand(String str)
    {
        //declaring a result string
        String resStr = "\"";
        //declaring a previous value, assigned a token value
        char previous = '0';
        int count = 1;
        for (int i=0;i<str.length();i++)
        {
            //determining if current char is a repeat of a previous one
            if (previous != str.charAt(i))
            {
                //determining if a previous value was repeated in a row
                if (count>1)
                    resStr += "*" + count;
                previous = str.charAt(i);
                resStr += previous;
                count = 1;
            }
            else
            {
                count++;
                //if last char in a string
                if (i == str.length() - 1 && count > 1)
                    resStr += "*" + count;
            }
        }
        return resStr += "\"";
    }
}
