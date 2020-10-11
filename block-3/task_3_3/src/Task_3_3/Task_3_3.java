package Task_3_3;

public class Task_3_3 {
    public static void main(String[] args)
    {
        System.out.println("Number is perfect? Result 1: "+checkPerfect(6)); //true
        System.out.println("Number is perfect? Result 2: "+checkPerfect(28)); //true
        System.out.println("Number is perfect? Result 3: "+checkPerfect(496)); //true
        System.out.println("Number is perfect? Result 4: "+checkPerfect(12)); //false
        System.out.println("Number is perfect? Result 5: "+checkPerfect(97)); //false
    }
    private static boolean checkPerfect(int num)
    {
        int sum = 0;
        for (int i=1;i<num;i++)
        {
            if (num%i==0)
                sum += i;
        }
        if (num==sum) return true;
        else return false;
    }
}