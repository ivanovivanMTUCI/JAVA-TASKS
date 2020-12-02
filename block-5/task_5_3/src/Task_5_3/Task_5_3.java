package Task_5_3;

public class Task_5_3 {
    public static void main(String[] args)
    {
        System.out.println("Can the 1st word be completed? " + canComplete("butl", "beautiful")); //true
        System.out.println("Can the 2nd word be completed? " + canComplete("butlz", "beautiful")); //false
        System.out.println("Can the 3rd word be completed? " + canComplete("tulb", "beautiful")); //false
        System.out.println("Can the 4th word be completed? " + canComplete("bbutl", "beautiful")); //false
    }

    private static boolean canComplete(String input, String target)
    {
        //declaring a character counter for target
        int counter = 0;
        for (int i=0; i<input.length(); i++)
        {
            //counting the amount of characters between same characters in input and target
            while (counter < target.length() && target.charAt(counter) != input.charAt(i))
                counter++;
            counter++;
            //if the amount got too high
            if (counter > target.length()) return false;
        }
        return true;
    }
}
