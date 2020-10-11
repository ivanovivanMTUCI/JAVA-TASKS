package Task_3_7;

public class Task_3_7 {
    public static void main(String[] args)
    {
        System.out.println("Is a Kaprekar number? Result 1: "+isKaprekar(3)); //false
        System.out.println("Is a Kaprekar number? Result 2: "+isKaprekar(5)); //false
        System.out.println("Is a Kaprekar number? Result 3: "+isKaprekar(297)); //true
    }
    private static boolean isKaprekar(int num)
    {
        String number = String.valueOf(num*num);
        if (number.length() == 1) return false;
        String first = number.substring(0, number.length()/2);
        String second = number.substring(number.length()/2);
        return (Integer.parseInt(first) + Integer.parseInt(second)) == num;
    }
}
