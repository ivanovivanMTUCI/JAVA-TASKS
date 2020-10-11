package Task_3_9;

public class Task_3_9 {
    public static void main(String[] args)
    {
        System.out.println("Prime number 1: "+nextPrime(12)); //13
        System.out.println("Prime number 2: "+nextPrime(24)); //29
        System.out.println("Prime number 3: "+nextPrime(11)); //11
    }
    private static int nextPrime(int num)
    {
        if (isPrime(num)) return num;
        for (int i = num; ; i++)
        {
            if (isPrime(i)) return i;
        }
    }
    private static boolean isPrime(int num)
    {
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0) return false;
        }
        return true;
    }
}
