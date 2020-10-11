package Task_2_6;

public class Task_2_6 {
    public static void main(String[] args)
    {
        System.out.println(fib(4)); //3
        System.out.println(fib(8)); //21
        System.out.println(fib(13)); //233
    }
    private static int fib(int n)
    {
        if (n <= 1) return n;
        else return fib(n - 1) + fib(n - 2);
    }
}
