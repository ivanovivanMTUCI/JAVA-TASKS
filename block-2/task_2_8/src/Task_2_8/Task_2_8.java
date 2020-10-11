package Task_2_8;

public class Task_2_8 {
    public static void main(String[] args)
    {
        System.out.println(isStrangePair("ratio","orator")); //true
        System.out.println(isStrangePair("sparkling","groups")); //true
        System.out.println(isStrangePair("bush","hubris")); //false
    }
    private static boolean isStrangePair(String a, String b)
    {
        char aFirst = a.charAt(0);
        char aLast = a.charAt(a.length()-1);
        char bFirst = b.charAt(0);
        char bLast = b.charAt(b.length()-1);
        if (aFirst==bLast && aLast==bFirst)
            return true;
        else return false;
    }
}
