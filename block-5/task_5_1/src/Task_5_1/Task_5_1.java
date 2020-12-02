package Task_5_1;

public class Task_5_1 {
    public static void main(String[] args)
    {
        int[] arr1 = encrypt("Hello");
        System.out.print("Decryption result 1: ");
        for (int j : arr1)
            System.out.print(j + " "); //72 29 7 0 3

        System.out.println();
        System.out.println("Encryption result 1: " +
                decrypt(new int[]{72, 33, -73, 84, -12, -3, 13, -13, -68})); //Hi there!

        int[] arr2 = encrypt("Sunshine");
        System.out.print("Decryption result 2: ");
        for (int j : arr2)
            System.out.print(j + " "); //83 34 -7 5 -11 1 5 -9
    }

    private static int[] encrypt(String str)
    {
        //declaring an integer array the length of str
        int[] finArr = new int[str.length()];
        for (int i=0; i<str.length(); i++)
        {
            //if first character
            if (i == 0)
                //getting the character code as the first number in final array
                finArr[i] = (int) str.charAt(i);
            else
                //getting the difference between this and previous characters as next number in final array
                finArr[i] = (int) str.charAt(i) - (int) str.charAt(i-1);
        }
        return finArr;
    }

    private static String decrypt(int[] arr)
    {
        String finStr = "";
        for (int i=0; i<arr.length; i++)
        {
            //if first array element
            if (i == 0)
                //turning the code back into the character
                finStr += (char) arr[i];
            else
                //getting the current character code and turning it back into the character
                finStr += (char) (arr[i] + (int) finStr.charAt(i-1));
        }
        return finStr;
    }
}
