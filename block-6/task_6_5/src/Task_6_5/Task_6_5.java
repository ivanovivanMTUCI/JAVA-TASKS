package Task_6_5;

public class Task_6_5 {
    public static void main(String[] args)
    {
        System.out.print("Hashtag group 1:");
        String[] arr1 = getHashTags("How the Avocado Became the Fruit of the Global Trade"); //["#avocado", "#became", "#global"]
        for (String s : arr1)
            if (s != null) System.out.print(" " + s);

        System.out.print(System.lineSeparator() + "Hashtag group 2:");
        String[] arr2 = getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year"); //["#christmas", "#probably", "#will"]
        for (String s : arr2)
            if (s != null) System.out.print(" " + s);

        System.out.print(System.lineSeparator() + "Hashtag group 3:");
        String[] arr3 = getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit"); //["#surprise", "#parents", "#fruit"]
        for (String s : arr3)
            if (s != null) System.out.print(" " + s);

        System.out.print(System.lineSeparator() + "Hashtag group 4:");
        String[] arr4 = getHashTags("Visualizing Science"); //["#visualizing", "#science"]
        for (String s : arr4)
            if (s != null) System.out.print(" " + s);
    }

    private static String[] getHashTags(String str)
    {
        //declaring variables and output string array
        String[] finArr = {"", "", ""};
        String temp = "";
        int i = 0;
        while (i<str.length())
        {
            if (str.charAt(i) < 65 || str.charAt(i) > 90 && str.charAt(i) < 97 || str.charAt(i) > 122 || i == str.length() - 1)
            {
                //if found last character
                if (i == str.length() - 1)
                    temp += str.charAt(i);
                //lowering the register
                temp = temp.toLowerCase();
                if (finArr[0].length() < temp.length())
                {
                    finArr[2] = finArr[1];
                    finArr[1] = finArr[0];
                    finArr[0] = temp;
                }
                else if (finArr[1].length() < temp.length())
                {
                    finArr[2] = finArr[1];
                    finArr[1] = temp;
                }
                else if (finArr[2].length() < temp.length())
                {
                    finArr[2] = temp;
                }
                temp = "";
            }
            else
                temp += str.charAt(i);
            i++;
        }
        //assigning the hashtag to a stored word
        for (i=0; i<3; i++)
            if (finArr[i] != "")
                finArr[i] = "#" + finArr[i];
        return finArr;
    }
}
