package Task_8;

public class Task_8 {
    public static void main(String[] args)
    {
        System.out.println("Longest 3d edge 1: "+nextEdge(8,10));
        System.out.println("Longest 3d edge 2: "+nextEdge(5,7));
        System.out.println("Longest 3d edge 3: "+nextEdge(9,2));
    }
    private static int nextEdge(int x, int y)
    {
        int ans = (x+y)-1;
        return ans;
    }
}
