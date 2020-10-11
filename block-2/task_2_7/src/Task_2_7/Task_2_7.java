package Task_2_7;

public class Task_2_7 {
    public static void main(String[] args)
    {
        System.out.println("Is post number 1 real? Result: "+isValid("59001")); //true
        System.out.println("Is post number 2 real? Result: "+isValid("853a7")); //false
        System.out.println("Is post number 3 real? Result: "+isValid("732 32")); //false
        System.out.println("Is post number 4 real? Result: "+isValid("393939")); //false
    }
    private static boolean isValid(String post)
    {
        if ((post.matches("\\d+")) && (post.length()==5))
            return true;
        else return false;
    }
}
