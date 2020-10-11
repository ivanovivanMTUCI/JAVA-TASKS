package Task_2_10;

public class Task_2_10 {
    public static void main(String[] args)
    {
        System.out.println("Step 0: "+boxSeq(0));  //0
        System.out.println("Step 1: "+boxSeq(1));  //3
        System.out.println("Step 2: "+boxSeq(2));  //2
    }
    private static int boxSeq(int x)
    {
        int n=x, res=0;
        if (n<=0) return res;
        for (int i=1;i<n+1;i++)
            if (i%2!=0)
                res+=3;
            else res-=1;
        return res;
    }
}
