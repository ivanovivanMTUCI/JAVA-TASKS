package Task_2_1;

public class Task_2_1 {
    public static void main(String[] args)
    {
        System.out.println(repeat("mice",5));
        System.out.println(repeat("hello",3));
        System.out.println(repeat("stop",1));
    }
    private static String repeat(String str, int times)
    {
        int n = str.length();
        String resStr = "";
        for (int i=0;i<n;i++)
            for (int j=0;j<times;j++)
                resStr += str.charAt(i);
        return resStr;
    }
}
