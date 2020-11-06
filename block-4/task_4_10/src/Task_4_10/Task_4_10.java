package Task_4_10;

public class Task_4_10 {
    public static void main(String[] args)
    {
        System.out.println("Amount of unique \"books\" 1: " + countUniqueBooks("AZYWABBCATTTA", 'A')); //4
        System.out.println("Amount of unique \"books\" 2: " + countUniqueBooks("$AA$BBCATT$C$$B$", '$'));  //3
        System.out.println("Amount of unique \"books\" 3: " + countUniqueBooks("ZZABCDEF", 'Z'));  //0
    }

    private static int countUniqueBooks(String str, char letter)
    {
        //declaring variables
        int start = -1, finish = -1, result = 0;
        String checkStr, bookStr;
        for (int i=0; i<str.length(); i++)
        {
            //starting or finishing a book
            if (str.charAt(i) == letter)
            {
                if (start == -1)
                    start = i;
                else
                    finish = i;
            }
            if (start != -1 && finish != -1)
            {
                //getting a book substring
                bookStr = str.substring(start+1, finish);
                //declaring a new unique value check string
                checkStr = "";
                for (int j = 0; j < bookStr.length(); j++)
                    //if a char not yet in a checkStr - add to a checkStr
                    if (checkStr.indexOf(bookStr.charAt(j)) < 0)
                        checkStr += bookStr.charAt(j);
                //adding unique characters to a result string
                result += checkStr.length();
                start = -1;
                finish = -1;
            }
        }
        return result;
    }
}
