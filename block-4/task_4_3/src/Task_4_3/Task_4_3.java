package Task_4_3;

public class Task_4_3 {
    public static void main(String[] args)
    {
        System.out.println("Converted to camel case 1: " + toCamelCase("hello_edabit"));    //helloEdabit
        System.out.println("Converted to snake case 1: " + toSnakeCase("helloEdabit")); //hello_edabit
        System.out.println("Converted to camel case 2: " + toCamelCase("is_modal_open"));   //isModalOpen
        System.out.println("Converted to snake case 2: " + toSnakeCase("getColor"));    //get_color
    }

    private static String toCamelCase(String str)
    {
        //declaring the output string
        String finStr = "";
        char letter;
        for (int i=0;i<str.length();i++)
        {
            //assigning the current value
            letter = str.charAt(i);
            //if char is a space - assign next char, but uppercase, as new value of letter
            if (letter=='_')
            {
                i++;
                letter = Character.toUpperCase(str.charAt(i));
            }
            //add to the final output string
            finStr += letter;
        }
        return finStr;
    }

    private static String toSnakeCase(String str)
    {
        //declaring the output string
        String finStr = "";
        char letter;
        for (int i=0;i<str.length();i++)
        {
            //assigning the current value
            letter = str.charAt(i);
            //if char is an uppercase - add a space to the final output string and assign current char, but lowercase, as new value of letter
            if ((int)letter>=65 && (int)letter<=90) {
                finStr += '_';
                letter = Character.toLowerCase(letter);
            }
            //add to the final output string
            finStr += letter;
        }
        return finStr;
    }
}
