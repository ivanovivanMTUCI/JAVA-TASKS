package Task_2;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Area of triangle 1: "+(triArea(3,2))+"\n");
        System.out.println("Area of triangle 2: "+(triArea(7,4))+"\n");
        System.out.println("Area of triangle 3: "+(triArea(10,10))+"\n");
    }
    private static int triArea(int x, int y){
        int ans = (x*y)/2;
        return ans;
    }
}
