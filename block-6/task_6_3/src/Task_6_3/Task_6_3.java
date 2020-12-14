package Task_6_3;

public class Task_6_3 {
    public static void main(String[] args) throws NumberFormatException
    {
        System.out.println("Is expression 1 valid? Result: " + validColor("rgb(0,0,0)")); //true
        System.out.println("Is expression 2 valid? Result: " + validColor("rgb(0, ,0)")); //false
        System.out.println("Is expression 3 valid? Result: " + validColor("rgb(255,256,255)")); //false
        System.out.println("Is expression 4 valid? Result: " + validColor("rgba(0,0,0,0.123456789)")); //true
    }

    private static Boolean validColor(String str) throws NumberFormatException
    {
        //valid expression check
        if (!((str.startsWith("rgb(") || str.startsWith("rgba(")) && str.endsWith(")")))
            return false;
        //starting after the open bracket
        int i = str.indexOf("(") + 1;
        //declaring the temporary field
        StringBuilder temp = new StringBuilder();
        //comma counter
        int commas = 0;
        //until the end of the string
        while (str.charAt(i) != ')' && commas < 4)
        {
            //only append if a character is a number or a decimal and so on
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57 || commas == 3 && str.charAt(i) == '.')
                temp.append(str.charAt(i));
            //if a character is a comma
            else if (str.charAt(i) == ',')
            {
                //valid check
                if (temp.toString().equals("") || Integer.parseInt(temp.toString()) > 255)
                    return false;
                //next element
                temp = new StringBuilder();
                commas++;
            }
            i++;
        }
        //final check
        return str.startsWith("rgb(") && commas == 2 || str.startsWith("rgba(") && commas == 3;
    }
}
