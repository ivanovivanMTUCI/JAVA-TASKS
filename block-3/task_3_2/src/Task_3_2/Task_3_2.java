package Task_3_2;

public class Task_3_2 {
    public static void main(String[] args)
    {
        System.out.println("Second entrance position 1: "+findZip("all zip files are zipped")); //18
        System.out.println("Second entrance position 2: "+findZip("all zip files are compressed")); //-1
    }
    private static int findZip(String str)
    {
        String subStr = "zip";
        return str.indexOf(subStr, str.indexOf(subStr) + 1);
    }
}
