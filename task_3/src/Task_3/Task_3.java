package Task_3;

public class Task_3 {
    private static int CHICKENS_LEGS = 2;
    private static int COWS_LEGS = 4;
    private static int PIGS_LEGS = 4;

    public static void main (String[] args) {
        animals(2,3,5);
        animals(1,2,3);
        animals(5,2,8);
    }
    private static void animals (int chickens, int cows, int pigs)
    {
        int allLegs = (chickens * CHICKENS_LEGS) + (cows * COWS_LEGS) + (pigs * PIGS_LEGS);
        System.out.println("Total amount of legs on the farm: "+allLegs);
    }
}
