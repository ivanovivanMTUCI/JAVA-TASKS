package Task_4_8;

public class Task_4_8 {
    public static void main(String[] args)
    {
        System.out.println("Does the 1st couple of statements rhyme? Result: " +
                doesRhyme("Sam I am!", "Green eggs and ham."));  //true
        System.out.println("Does the 2nd couple of statements rhyme? Result: " +
                doesRhyme("Sam I am!", "Green eggs and HAM."));  //true
        System.out.println("Does the 3rd couple of statements rhyme? Result: " +
                doesRhyme("You are off to the races", "a splendid day."));  //false
        System.out.println("Does the 4th couple of statements rhyme? Result: " +
                doesRhyme("and frequently do?", "you gotta move."));  //false
    }

    private static boolean doesRhyme(String str1, String str2)
    {
        //declaring the variables
        int strSeparator1 = 0, strSeparator2 = 0;
        String rhyme1 = "", rhyme2 = "";

        //finding the last space and assigning to a separator variable
        for (int i = str1.length()-1; i > 0; i--)
            if (str1.charAt(i) == ' ')
            {
                strSeparator1 = i;
                break;
            }
        for (int i = str2.length()-1; i > 0; i--)
            if (str2.charAt(i) == ' ')
            {
                strSeparator2 = i;
                break;
            }

        //getting and formatting the last word of a rhyme
        str1 = str1.toLowerCase().substring(strSeparator1 + 1, str1.length());
        str2 = str2.toLowerCase().substring(strSeparator2 + 1, str2.length());

        //checking if vowels are same (if words rhyme)
        for (int i = 0; i<str1.length(); i++)
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' ||
                    str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u')
                rhyme1 += str1.charAt(i);
        for (int i = 0; i<str2.length(); i++)
            if (str2.charAt(i) == 'a' || str2.charAt(i) == 'e' ||
                    str2.charAt(i) == 'i' || str2.charAt(i) == 'o' || str2.charAt(i) == 'u')
                rhyme2 += str2.charAt(i);

        if (rhyme1.equals(rhyme2))
            return true;
        else return false;
    }
}
