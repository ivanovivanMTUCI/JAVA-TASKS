package Task_9;

public class Task_9 {
    public static void main(String[] args)
    {
        int[] arr1 = new int[] {1,5,9};
        int[] arr2 = new int[] {3,4,5};
        int[] arr3 = new int[] {2};
        int[] arr4 = new int[] {};
        System.out.println("Sum 1: "+sumOfCubes(arr1));
        System.out.println("Sum 2: "+sumOfCubes(arr2));
        System.out.println("Sum 3: "+sumOfCubes(arr3));
        System.out.println("Sum 4: "+sumOfCubes(arr4));
    }
    private static int sumOfCubes(int[] arr)
    {
        int ans=0;
        for (int cube : arr)
            ans+=Math.pow(cube,3);
        return ans;
    }
}
