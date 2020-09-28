package Task_5;

public class Task_5 {
    public static void main(String[] args)
    {
        System.out.println("Result 1: "+operation(24,15,9)+"\n");
        System.out.println("Result 2: "+operation(24,26,2)+"\n");
        System.out.println("Result 3: "+operation(15,11,11)+"\n");
    }
    private static String operation(int N, int a, int b)
    {
        int add=a+b;
        int subA=a-b;
        int subB=b-a;
        int mul=a*b;
        int divA=a/b;
        int divB=b/a;

        String ans="none";
        if (N==add)
            ans="added";
        if (N==subA)
            ans="subtracted from a";
        if (N==subB)
            ans="subtracted from b";
        if (N==mul)
            ans="multiplied";
        if (N==divA)
            ans="divided by b";
        if (N==divB)
            ans="divided by a";

        return ans;
    }
}