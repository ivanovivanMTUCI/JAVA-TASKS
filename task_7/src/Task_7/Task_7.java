package Task_7;

public class Task_7 {
    public static void main(String[] args)
    {
        System.out.println("Result 1:"+addUpTo(3)+"\n");
        System.out.println("Result 2:"+addUpTo(10)+"\n");
        System.out.println("Result 3:"+addUpTo(7)+"\n");
    }
    private static int addUpTo(int x)
    {
        int n=x;
        int ans=0;
        for (int i=1;i<n+1;i++)
        {
            ans+=i;
        }
        return ans;
    }
}
