package Task_2_2;

public class Task_2_2 {
    public static void main(String[] args)
    {
        int[] arr1 = new int[] {10,4,1,4,-10,-50,32,21};
        int[] arr2 = new int[] {44,32,86,19};
        System.out.println("Difference 1: "+differenceMaxMin(arr1));
        System.out.println("Difference 2: "+differenceMaxMin(arr2));
    }
    private static int differenceMaxMin(int[] arr)
    {
        int max=arr[0]; int min=arr[0];
        for (int num : arr) {
            if (num>max) {max=num;}
            else if (num<min) {min=num;}
        }
        return max-min;
    }
}
