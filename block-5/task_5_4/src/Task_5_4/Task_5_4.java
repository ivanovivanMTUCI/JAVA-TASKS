package Task_5_4;

public class Task_5_4 {
    public static void main(String[] args)
    {
        System.out.println("Result 1: " + sumDigProd(new int[] {16, 28})); //6
        System.out.println("Result 2: " + sumDigProd(new int[] {0})); //0
        System.out.println("Result 3: " + sumDigProd(new int[] {1, 2, 3, 4, 5, 6})); //2
    }

    private static int sumDigProd(int[] numbers)
    {
        int answer = 0;
        String str;
        //getting the sum of input numbers
        for (int n: numbers)
            answer += n;
        //trying to get 1-digit number after multiplication
        while (Integer.toString(answer).length() != 1)
        {
            str = Integer.toString(answer);
            //resetting answer
            answer = 1;
            //multiplying each digit of a number
            for (int i = 0; i < str.length(); i++)
                answer *= Integer.parseInt(str.substring(i, i + 1));
        }
        return answer;
    }
}
