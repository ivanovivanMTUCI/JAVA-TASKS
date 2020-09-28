package Task_4;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Result 1: "+profitableGamble(0.2,50,9)+"\n");
        System.out.println("Result 2: "+profitableGamble(0.9,1,2)+"\n");
        System.out.println("Result 3: "+profitableGamble(0.9,3,2)+"\n");
    }
    private static boolean profitableGamble(double prob, double prize, double pay)
    {
        if (prob*prize>pay) { return true; }
        else { return false; }
    }
}
