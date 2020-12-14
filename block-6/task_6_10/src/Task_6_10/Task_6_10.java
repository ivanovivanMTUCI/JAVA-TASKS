package Task_6_10;

public class Task_6_10 {
    public static void main(String[] args)
    {
        System.out.println("Is a palindrome or a palindrome descendant? Result 1: " +
                palindromeDescendant(11211230)); //true
        System.out.println("Is a palindrome or a palindrome descendant? Result 2: " +
                palindromeDescendant(13001120)); //true
        System.out.println("Is a palindrome or a palindrome descendant? Result 3: " +
                palindromeDescendant(23336014)); //true
        System.out.println("Is a palindrome or a palindrome descendant? Result 4: " +
                palindromeDescendant(11)); //true
    }

    private static boolean palindromeDescendant(int input)
    {
        //declaring variables
        String currStr = Integer.toString(input), temp = "";
        //if input number is single-digit
        if (currStr.length() == 1)
            return true;
        while (currStr.length() >= 2)
        {
            //reversing the second half of the current string
            String reverse = new StringBuilder(currStr.substring(currStr.length()/2)).reverse().toString();
            //checking if the current string is a palindrome
            if (currStr.substring(0,currStr.length()/2).equals(reverse))
                return true;
            //resetting the current string
            temp = "";
            for (int i=0; i<currStr.length(); i+=2)
                //summing up every two digits of the current string
                temp += Integer.toString(Integer.parseInt(currStr.substring(i,i+1)) + Integer.parseInt(currStr.substring(i+1,i+2)));
            currStr = temp;
        }
        return false;
    }
}
