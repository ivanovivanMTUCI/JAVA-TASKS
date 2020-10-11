package Task_3_6;

public class Task_3_6 {
    public static void main(String[] args)
    {
        double[] list1_1 = new double[] {1,3,4,4,4};
        double[] list1_2 = new double[] {2,5,7};
        double[] list2_1 = new double[] {9,8,7,6};
        double[] list2_2 = new double[] {4,4,3,1};
        double[] list3_1 = new double[] {2};
        double[] list3_2 = new double[] {3,3,3,3,3};
        System.out.println("Do arrays have the same amount of unique numbers? Result 1: "
                +same(list1_1,list1_2)); //true
        System.out.println("Do arrays have the same amount of unique numbers? Result 2: "
                +same(list2_1,list2_2)); //false
        System.out.println("Do arrays have the same amount of unique numbers? Result 3: "
                +same(list3_1,list3_2)); //true
    }
    private static boolean same(double[] list1, double[] list2)
    {
        int first = uniqueAmount(list1);
        int second = uniqueAmount(list2);
        return first == second;
    }
    private static int uniqueAmount(double[] list)
    {
        double last = Double.NaN;
        int unique = 0;
        for(int i = 0; i < list.length; i++)
            if(last != (last = list[i]))
                unique++;
        return unique;
    }
}
