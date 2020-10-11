package Task_2_9;

public class Task_2_9 {
    public static void main(String[] args)
    {
        System.out.println("Prefix 1: "+isPrefix("automation","auto"));  //true
        System.out.println("Suffix 1: "+isSuffix("arachnophobia","phobia")); //true
        System.out.println("Prefix 2: "+isPrefix("retrospect","sub"));   //false
        System.out.println("Suffix 2: "+isSuffix("vocation","logy"));    //false
    }
    private static boolean isPrefix(String a, String b)
    {
        if (a.startsWith(b))
            return true;
        else return false;
    }
    private static boolean isSuffix(String a, String b)
    {
        int nA = a.length(), nB = b.length();
        int index = nA - nB;
        if (a.startsWith(b,index))
            return true;
        else return false;
    }
}
