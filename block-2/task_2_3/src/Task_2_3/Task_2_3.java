package Task_2_3;

public class Task_2_3 {
    public static void main(String[] args)
    {
        int[] arr1 = new int[] {1,3};
        int[] arr2 = new int[] {1,2,3,4};
        int[] arr3 = new int[] {1,5,6};
        int[] arr4 = new int[] {1,1,1};
        int[] arr5 = new int[] {9,2,2,5};
        System.out.println("Is average 1 whole? Result: "+isAvgWhole(arr1));
        System.out.println("Is average 2 whole? Result: "+isAvgWhole(arr2));
        System.out.println("Is average 3 whole? Result: "+isAvgWhole(arr3));
        System.out.println("Is average 4 whole? Result: "+isAvgWhole(arr4));
        System.out.println("Is average 5 whole? Result: "+isAvgWhole(arr5));
    }
    private static boolean isAvgWhole(int[] arr)
    {
        int res = 0;
        int div = arr.length;
        for (int num : arr)
            res+=num;
        if (res%div==0) return true;
        else return false;
    }
}
