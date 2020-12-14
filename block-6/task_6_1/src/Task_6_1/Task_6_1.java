package Task_6_1;

import java.io.*;
import java.util.*;

public class Task_6_1 {
    public static void main(String[] args)
    {
        System.out.println("Bell Number for 1: " + bell(1)); //1
        System.out.println("Bell Number for 2: " + bell(2)); //2
        System.out.println("Bell Number for 3: " + bell(3)); //5
    }

    private static int bell(int input)
    {
        //declaring final array to store the sets
        int[][] finArr = new int[input+1][input+1];
        //first element control
        finArr[0][0] = 1;
        for (int i=1; i<=input; i++)
        {
            for (int j=0; j<=i; j++)
                //fill for j = 0
                if (j == 0)
                    finArr[i][0] = finArr[i-1][i-1];
                //fill for remaining values of j
                else
                    finArr[i][j] = finArr[i-1][j-1] + finArr[i][j-1];
        }
        //check
        System.out.println(Arrays.deepToString(finArr));
        return finArr[input][0];
    }
}
