package Task_3_1;

public class Task_3_1 {
    public static void main(String[] args)
    {
        System.out.println("Number of solutions 1: "+solution(1,0,-1)); //2
        System.out.println("Number of solutions 2: "+solution(1,0,0)); //1
        System.out.println("Number of solutions 3: "+solution(1,0,1)); //0
    }
    private static int solution(int a, int b, int c)
    {
        double result = Math.sqrt(b * b - (4 * a * c));
        if (result > 0) return 2;
        else if (result == 0) return 1;
        else return 0;
    }
}
