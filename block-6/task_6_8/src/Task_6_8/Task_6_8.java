package Task_6_8;

public class Task_6_8 {
    public static void main(String[] args)
    {
        System.out.println("Converted roman numeral 1: " + convertToRoman(2)); //"II"
        System.out.println("Converted roman numeral 2: " + convertToRoman(12)); //"XII"
        System.out.println("Converted roman numeral 3: " + convertToRoman(15)); //"XVI"
    }

    private static String convertToRoman(int num)
    {
        //declaring final string
        String finStr = "";
        //roman numerals can't be zero or negative
        if (num <= 0)
            return "Invalid input!";

        /*
        subtracting arabic numerals from the input number
        adding resulting roman numerals to a result string
         */
        //if more than 1000
        while (num >= 1000)
        {
            num -= 1000;
            finStr += "M";
        }
        //special numeral sequence for 900
        if (num >= 900)
        {
            num -= 900;
            finStr += "CM";
        }
        //if more than 500
        else if (num >= 500)
        {
            num -= 500;
            finStr += "D";
        }
        //special numeral sequence for 400
        else if (num >= 400)
        {
            num -= 400;
            finStr += "CD";
        }
        //if more than 100
        else while (num >= 100)
        {
            num -= 100;
            finStr += "C";
        }
        //special numeral sequence for 90
        if (num >= 90)
        {
            num -= 90;
            finStr += "XC";
        }
        //if more than 50
        else if (num >= 50)
        {
            num -= 50;
            finStr += "L";
        }
        //special numeral sequence for 40
        else if (num >= 40)
        {
            num -= 40;
            finStr += "XL";
        }
        //if more than 10
        else while (num >= 10)
        {
            num -= 10;
            finStr += "X";
        }
        //special numeral sequence for 9
        if (num == 9)
        {
            num -= 9;
            finStr += "IX";
        }
        //if more than 5
        else if (num >= 5)
        {
            num -= 5;
            finStr += "V";
        }
        //special numeral sequence for 4
        else if (num == 4)
        {
            num -= 4;
            finStr += "IV";
        }
        //if more than 1
        else while (num >= 1)
        {
            num -= 1;
            finStr += "I";
        }
        return finStr;
    }
}
