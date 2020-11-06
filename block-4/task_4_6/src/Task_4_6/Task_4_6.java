package Task_4_6;

public class Task_4_6 {
    public static void main(String[] args)
    {
        System.out.println("Multiplicative persistence 1: " + bugger(39)); //3
        System.out.println("Multiplicative persistence 2: " + bugger(999));    //4
        System.out.println("Multiplicative persistence 3: " + bugger(4));  //0
    }

    private static int bugger(int num)
    {
        //declaring multiplicative persistence counters
        int multiPost = 0, count = 1, x;
        while (num>9)
        {
            while (num>0)
            {
                x = num % 10;
                num = num / 10;
                count = count * x;
            }
            num = count;
            count = 1;
            multiPost++;
        }
        return multiPost;
    }
}
