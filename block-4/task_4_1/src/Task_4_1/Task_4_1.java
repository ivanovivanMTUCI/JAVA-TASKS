package Task_4_1;

public class Task_4_1 {
    public static void main(String[] args)
    {
        //setting the line limit
        int k=7;
        //calling the method
        System.out.println("Text processor output: "+System.lineSeparator()+
                textProcessor(k,"hello my name is Bessie and this is my essay"));
    }

    private static String textProcessor(int k, String str)
    {
        int charNum=0, lastSpace=0;
        for (int i=0;i<str.length();i++)
        {
            //looking for a space
            if (Character.isLetter(str.charAt(i)))
                charNum++;
            else if (Character.isSpaceChar(str.charAt(i)))
                lastSpace=i;
            else return "Invalid characters: ONLY letters!";

            //separating the input string on a last space
            if (charNum>k && lastSpace!=0)
            {
                charNum = i-lastSpace;
                str = str.substring(0,lastSpace)+System.lineSeparator()+str.substring(lastSpace+1);
            }
        }
        return str;
    }
}
