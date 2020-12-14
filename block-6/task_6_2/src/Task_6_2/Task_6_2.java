package Task_6_2;

public class Task_6_2 {
    public static void main(String[] args)
    {
        System.out.println("Fake latin word 1: " + translateWord("flag")); //"agflay"
        System.out.println("Fake latin word 2: " + translateWord("Apple")); //"Appleyay"
        System.out.println("Fake latin word 3: " + translateWord("button")); //"uttonbay"
        System.out.println("Fake latin word 4: " + translateWord("")); //""
        System.out.println("Fake latin sentence 1: " + translateSentence("I like to eat honey waffles.")); //"Iyay ikelay otay eatyay oneyhay afflesway."
        System.out.println("Fake latin sentence 2: " + translateSentence("Do you think it is going to rain today?")); //"Oday youyay inkthay ityay isyay oinggay otay ainray odaytay?"
    }

    private static String translateWord(String str)
    {
        String finStr = str;
        //declaring a counter
        int i = 0;
        //if input is empty
        if (finStr.length() <= 0)
            return finStr;
        //if a word starts with a vowel
        if (finStr.charAt(0) == 'a' || finStr.charAt(0) == 'e' || finStr.charAt(0) == 'i' || finStr.charAt(0) == 'o' || finStr.charAt(0) == 'u' || finStr.charAt(0) == 'y' ||
                finStr.charAt(0) == 'A' || finStr.charAt(0) == 'E' || finStr.charAt(0) == 'I' || finStr.charAt(0) == 'O' || finStr.charAt(0) == 'U' || finStr.charAt(0) == 'Y')
            //only add suffix "yay"
            finStr += "yay";
        else
        {
            i = 1;
            //finding the vowel
            while (i<finStr.length() && finStr.charAt(i) != 'a' && finStr.charAt(i) != 'e' && finStr.charAt(i) != 'i' && finStr.charAt(i) != 'o' && finStr.charAt(i) != 'u' && finStr.charAt(i) != 'y')
                i++;
        }
        //if a word doesn't start with a vowel
        if (i != 0)
            //constructing the final string
            finStr = finStr.substring(i) + finStr.substring(0, i) + "ay";
        return finStr;
    }

    private static String translateSentence(String str)
    {
        //declaring a counter and final and temporary strings
        int i = 0;
        String temp = "", finStr = "";
        while (i < str.length())
        {
            //working with each word separately
            while (str.charAt(i) >= 65 && str.charAt(i) <= 90 || str.charAt(i) >= 97 && str.charAt(i) <= 122)
            {
                temp += str.charAt(i);
                i++;
            }
            finStr += translateWord(temp) + str.charAt(i);
            //resetting the temporary string
            temp = "";
            i++;
        }
        return finStr;
    }
}
