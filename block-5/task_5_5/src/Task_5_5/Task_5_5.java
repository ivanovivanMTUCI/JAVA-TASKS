package Task_5_5;

public class Task_5_5 {
    public static void main(String[] args)
    {
        System.out.print("Chosen words 1:");
        String[] arr1 = sameVowelGroup(new String[] {"toe", "ocelot", "maniac"}); //toe ocelot
        for (String s : arr1)
            if (s != null) System.out.print(" " + s);

        System.out.print(System.lineSeparator() + "Chosen words 2:");
        String[] arr2 = sameVowelGroup(new String[]{"many", "carriage", "emit", "apricot", "animal"}); //many
        for (String s : arr2)
            if (s != null) System.out.print(" " + s);

        System.out.print(System.lineSeparator() + "Chosen words 3:");
        String[] arr3 = sameVowelGroup(new String[]{"hoops", "chuff", "bot", "bottom"}); //hoops bot bottom
        for (String s : arr3)
            if (s != null) System.out.print(" " + s);
    }

    private static String[] sameVowelGroup(String[] arr)
    {
        //declaring a boolean array to check if vowels are present in strings
        boolean[] vowels = {false, false, false, false, false, false}; //a,e,i,o,u,y
        //declaring final array the size of the input array
        String[] finArr = new String[arr.length];
        //first element counts
        finArr[0] = arr[0];
        int current = 1;
        //checking for the presence of vowels in the first word
        for (int i=0; i<arr[0].length(); i++)
        {
            //updating the vowels array accordingly
            if (arr[0].charAt(i) == 'a') vowels[0] = true;
            else if (arr[0].charAt(i) == 'e') vowels[1] = true;
            else if (arr[0].charAt(i) == 'i') vowels[2] = true;
            else if (arr[0].charAt(i) == 'o') vowels[3] = true;
            else if (arr[0].charAt(i) == 'u') vowels[4] = true;
            else if (arr[0].charAt(i) == 'y') vowels[5] = true;
        }
        //checking if other words have those vowels
        for (int i=1; i<arr.length; i++)
        {
            if ((arr[i].indexOf('a') == -1 || vowels[0]) &&
                    (arr[i].indexOf('e') == -1 || vowels[1]) &&
                    (arr[i].indexOf('i') == -1 || vowels[2]) &&
                    (arr[i].indexOf('o') == -1 || vowels[3]) &&
                    (arr[i].indexOf('u') == -1 || vowels[4]) &&
                    (arr[i].indexOf('y') == -1 || vowels[5]))
            {
                //filling the final array with fitting words
                finArr[current] = arr[i];
                current++;
            }
        }
        return finArr;
    }
}
