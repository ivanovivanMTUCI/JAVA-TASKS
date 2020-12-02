package Task_5_6;

public class Task_5_6 {
    public static void main(String[] args)
    {
        System.out.println("Is card 1 valid? " + validateCard(1234567890123456L)); //false
        System.out.println("Is card 2 valid? " + validateCard(1234567890123452L)); //true
    }

    private static boolean validateCard(long number)
    {
        String str = Long.toString(number);
        int temp, sum = 0;
        //number must be between 14 and 19
        if (str.length() < 14 || str.length() > 19)
            return false;

        //Lun's Test:
        //step 1: removing and storing the last "control" digit
        int controlDigit = Integer.parseInt(String.valueOf(str.charAt(str.length()-1)));
        str = str.substring(0, str.length()-1);
        //step 2: reversing the string using StringBuilder
        StringBuilder strBdr = new StringBuilder(str);
        str = strBdr.reverse().toString();
        //step 3: multiplying every odd number by 2
        for (int i=0; i<str.length(); i++)
        {
            //taking current digit
            temp = Integer.parseInt(String.valueOf(str.charAt(i)));
            if (i % 2 != 0)
            {
                temp *= 2;
                //if result has more than 2 digits
                if (temp>=10)
                    //1st digit + 2nd digit
                    temp = temp/10 + temp%10;
            }
            //step 4: sum all digits up
            sum += temp;
        }
        //step 5: taking the last digit of sum and subtracting it from 10,comparing the result to "control" digit
        return 10 - sum % 10 == controlDigit;
    }
}
