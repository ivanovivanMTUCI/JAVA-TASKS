package Task_6;

public class Task_6 {
    public static void main(String[] args)
    {
        System.out.println("ASCII of symbol 1: "+ctoa('A')+"\n");
        System.out.println("ASCII of symbol 2: "+ctoa('m')+"\n");
        System.out.println("ASCII of symbol 3: "+ctoa(']')+"\n");
        System.out.println("ASCII of symbol 4: "+ctoa('/')+"\n");
    }
    private static int ctoa(char sym)
    {
        int ascii = (int) sym;
        return ascii;
    }
}
