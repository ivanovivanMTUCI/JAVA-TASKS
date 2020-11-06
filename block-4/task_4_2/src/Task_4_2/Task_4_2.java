package Task_4_2;

public class Task_4_2 {
    public static void main(String[] args)
    {
        System.out.println("Result 1: " + split("()()()"));
        System.out.println("Result 2: " + split("((()))"));
        System.out.println("Result 3: " + split("((()))(())()()(()())"));
        System.out.println("Result 4: " + split("((())())(()(()()))"));
    }

    private static String split(String str)
    {
        String finStr = "[";
        int open = 0, close = 0;
        for (int i=0;i<str.length();i++)
        {
            //creating a bracket box
            if (open==0)
                finStr += "\"";
            //determining if a bracket is opened
            if (str.charAt(i)=='(')
            {
                open++;
                finStr += '(';
            }
            //determining if a bracket is closed
            else if (str.charAt(i)==')')
            {
                close++;
                finStr += ')';
            }
            //closing a bracket box
            if (open==close)
            {
                finStr += "\"";
                if (i+1 != str.length())
                    finStr += ", ";
                open = 0;
                close = 0;
            }
        }
        finStr += "]";
        return finStr;
    }
}
