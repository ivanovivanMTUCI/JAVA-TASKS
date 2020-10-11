package Task_3_4;

public class Task_3_4 {
    public static void main(String[] args)
    {
        System.out.println("Result 1: "+flipEndChars("Cat, dog, and mouse.")); //".at, dog, and mouseC"
        System.out.println("Result 2: "+flipEndChars("ada")); //"Two's a pair."
        System.out.println("Result 3: "+flipEndChars("Ada")); //"adA"
        System.out.println("Result 4: "+flipEndChars("z")); //"Incompatible."
    }
    private static String flipEndChars(String str)
    {
        if (str.length() < 2) return "Incompatible.";
        else if (str.charAt(0) == str.charAt(str.length() - 1)) return "Two's a pair.";
        else return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }
}
