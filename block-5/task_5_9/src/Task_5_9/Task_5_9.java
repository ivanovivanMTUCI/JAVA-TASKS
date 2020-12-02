package Task_5_9;

public class Task_5_9 {
    public static void main(String[] args)
    {
        System.out.println("Formatted string 1: " +
                correctTitle("jOn SnoW, kINg IN thE noRth.")); //"Jon Snow, King in the North."
        System.out.println("Formatted string 2: " +
                correctTitle("sansa stark, lady of winterfell.")); //"Sansa Stark, Lady of Winterfell."
        System.out.println("Formatted string 3: " +
                correctTitle("TYRION LANNISTER, HAND OF THE QUEEN.")); //"Tyrion Lannister, Hand of the Queen."
    }

    private static String correctTitle(String str)
    {
        //declaring final and temporary buffer strings
        String finStr = "\"", temp = "";
        int i = 0;
        while (i < str.length())
        {
            //taking every word one by one
            while (str.charAt(i) >= 65 && str.charAt(i) <= 90 || str.charAt(i) >= 97 && str.charAt(i) <= 122)
            {
                temp += str.charAt(i);
                i++;
            }
            //turning into lowercase
            temp = temp.toLowerCase();
            //"and", "the", "of", "in" are to remain lowercase
            if (!temp.equals("and") && !temp.equals("the") && !temp.equals("of") && !temp.equals("in") && temp.length() >= 1)
                //turning only first letter uppercase
                temp = temp.substring(0,1).toUpperCase() + temp.substring(1);
            finStr += temp + str.charAt(i);
            //resetting the temporary buffer string
            temp = "";
            //starting at new word
            i++;
        }
        return finStr + "\"";
    }
}
