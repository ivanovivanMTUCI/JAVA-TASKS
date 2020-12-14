package Task_6_7;

public class Task_6_7 {
    public static void main(String[] args)
    {
        System.out.println("Substring 1: " + longestNonrepeatingSubstring("abcabcbb")); //"abc"
        System.out.println("Substring 2: " + longestNonrepeatingSubstring("aaaaaa")); //"a"
        System.out.println("Substring 3: " + longestNonrepeatingSubstring("abcda")); //"abcd"
    }

    private static String longestNonrepeatingSubstring(String str)
    {
        //declaring final and temporary strings
        String temp = "", finStr = "";
        //if input string consists of only 1 character
        if (str.length() == 1)
            return str;

        for (int i=0; i<str.length()-1; i++)
        {
            temp += str.charAt(i);
            //if the next value is already in the temporary string
            if (temp.indexOf(str.charAt(i+1)) != -1)
            {
                //filling up the final string with valid values
                if (finStr.length() < temp.length())
                    finStr = temp;
                //resetting the temporary string
                temp = "";
            }
        }
        return finStr;
    }
}
