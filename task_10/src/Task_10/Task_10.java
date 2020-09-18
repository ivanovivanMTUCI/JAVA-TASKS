package Task_10;

public class Task_10 {
    public static void main(String[] args)
    {
        System.out.println("Result 1: "+abcmath(42,5,10));
        System.out.println("Result 2: "+abcmath(5,2,1));
        System.out.println("Result 3: "+abcmath(1,2,3));
    }
    private static boolean abcmath(int a, int b, int c)
    {
        for (int i=0;i<b;i++)
            a+=a;
        if ((a%c)==0)
            return true;
        else
            return false;
    }
}
