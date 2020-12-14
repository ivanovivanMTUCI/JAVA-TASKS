package Task_6_4;

import java.util.*;

public class Task_6_4 {
    public static void main(String[] args)
    {
        System.out.println("Modified URL 1: " +
                stripUrlParams("https://edabit.com?a=1&b=2&a=2")); //https://edabit.com?a=2&b=2
        System.out.println("Modified URL 2: " +
                stripUrlParams("https://edabit.com?a=1&b=2&a=2", "b")); //https://edabit.com?a=2
        System.out.println("Modified URL 3: " +
                stripUrlParams("https://edabit.com", "b")); //https://edabit.com
    }

    private static String stripUrlParams (String str, String... args) //ellipsis lets you pass any number of objects of a specific type
    {
        //if a URL is plain (no parameters)
        int i = str.indexOf("?");
        if (i == -1)
            return str;
        //also marking the end of the plain part of the URL
        i++;
        //declaring final and temporary strings
        String tempParam = "", tempNum = "", finStr = str.substring(0, i);
        //declaring numbered lists to store parameters and values
        ArrayList<String> params = new ArrayList<>(args.length);
        ArrayList<Integer> values = new ArrayList<>(args.length);
        //setting the check parameter
        boolean boolParam = true;
        while (i<str.length())
        {
            //add values at the end
            if (str.charAt(i) == '&' && tempNum.length() > 0)
            {
                if (params.contains(tempParam))
                    values.set((params.indexOf(tempParam)), Integer.parseInt(tempNum));
                //resetting parameters
                boolParam = true;
                tempParam = "";
                tempNum = "";
            }
            else
            if (!boolParam)
                tempNum += str.charAt(i);
            //collecting the number after the equals sign
            if (str.charAt(i) == '=' && tempParam.length() > 0 && boolParam)
            {
                if (!params.contains(tempParam))
                {
                    boolean inArgs = false;
                    for (String j:args)
                        if (j.equals(tempParam))
                            inArgs = true;
                    //if doesn't contain
                    if (!inArgs)
                    {
                        params.add(tempParam);
                        values.add(null);
                    }
                }
                boolParam = false;
            }
            else
            if (boolParam && str.charAt(i) != '&')
                tempParam += str.charAt(i);
            i++;
        }
        //modified for the last one
        if (!boolParam && tempNum.length() > 0)
            if (params.contains(tempParam))
                values.set((params.indexOf(tempParam)), Integer.parseInt(tempNum));
        for (i=0; i<params.size(); i++)
        {
            finStr += params.get(i) + "=" + values.get(i);
            if (i<params.size() - 1)
                finStr += "&";
        }
        return finStr;
    }
}
