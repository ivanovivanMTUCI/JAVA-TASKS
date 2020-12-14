package Task_6_6;

import java.util.*;

public class Task_6_6 {
    public static void main(String[] args)
    {
        System.out.println("1st Ulam number: " + ulam(4)); //4
        System.out.println("2nd Ulam number: " + ulam(9)); //13
        System.out.println("3rd Ulam number: " + ulam(206)); //602
    }

    //vectors have a dynamic size
    static Vector<Integer> finVector = new Vector<>();

    private static int ulam(int n)
    {
        //adding first Ulam numbers
        finVector.add(1);
        finVector.add(2);
        //starting from 3rd number
        for (int i = 3; finVector.size()<n; i++)
        {
            //declaring a counter
            int count = 0;
            for (int j = 0; j < finVector.size()-1; j++)
            {
                for (int k = j+1; k < finVector.size(); k++)
                {
                    //checking if current sum fits the Ulam number rules
                    if (finVector.get(j) + finVector.get(k) == i)
                        count++;
                    //there can be only 1 fitting sum
                    if (count > 1)
                        break;
                }
                //1 sum only
                if (count > 1)
                    break;
            }
            //last check
            if (count == 1)
                finVector.add(i);
        }
        return finVector.get(n-1);
    }
}
