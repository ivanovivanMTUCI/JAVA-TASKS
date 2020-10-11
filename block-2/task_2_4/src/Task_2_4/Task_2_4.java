package Task_2_4;

import java.util.Arrays;

public class Task_2_4 {
    public static void main(String[] args)
    {
        int[] arr1 = new int[] {1,2,3};
        int[] arr2 = new int[] {1,-2,3};
        int[] arr3 = new int[] {3,3,-2,408,3,3};
        //
        //в примерах для 4 задания блока 2 в документе "java_tasks.docx" ошибки в вычислениях
        //
        System.out.println("New array 1: "+cumulativeSum(arr1));
        System.out.println("New array 2: "+cumulativeSum(arr2));
        System.out.println("New array 3: "+cumulativeSum(arr3));
    }
    private static String cumulativeSum(int[] arr)
    {
        int n = arr.length;
        for (int i=0;i<n;i++) {
            for (int j=1;j<=i;j++) {
                arr[i] += arr[i - j];
            }
        }
        String arrStr = Arrays.toString(arr);
        return arrStr;
    }
}
