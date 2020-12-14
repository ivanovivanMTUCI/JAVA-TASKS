package Task_6_9;

import javax.script.*;
import java.util.Objects;

public class Task_6_9 {
    public static void main(String[] args) throws ScriptException
    {
        System.out.println("Is the formula correct? Result 1: " + formula("6 * 4 = 24")); //true
        System.out.println("Is the formula correct? Result 2: " + formula("18 / 17 = 2")); //false
        System.out.println("Is the formula correct? Result 3: " + formula("16 * 10 = 160 = 14 + 120")); //false
    }

    private static boolean formula(String str) throws ScriptException
    {
        //trimming the input string for calculating
        String trimStr = "";
        int i = 0;
        while (i < str.length())
        {
            //taking out all the spaces
            if (!(Objects.equals(str.charAt(i), ' ')))
                trimStr += str.charAt(i);
            i++;
        }
        //splitting the trimmed string into two parts on '=' sign
        String first = trimStr.substring(0, trimStr.indexOf('='));
        String second = trimStr.substring((trimStr.indexOf('=')) + 1);
        //second part cannot contain anything else but the result number
        i = 0;
        while (i < second.length())
        {
            if (!Character.isDigit(second.charAt(i)))
                return false;
            i++;
        }
        //built-in Javascript engine
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        //if both parts equal each other
        return(engine.eval(first)).equals(engine.eval(second));
    }
}
