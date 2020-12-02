package Task_5_7;

public class Task_5_7 {
    public static void main(String[] args)
    {
        //english
        System.out.println("ENGLISH");
        System.out.println("Result 1: " + numToEng(0)); //zero
        System.out.println("Result 2: " + numToEng(18)); //eighteen
        System.out.println("Result 3: " + numToEng(126)); //one hundred twenty six
        System.out.println("Result 4: " + numToEng(909)); //nine hundred nine

        System.out.println();

        //russian
        System.out.println("РУССКИЙ");
        System.out.println("Результат 1: " + numToRus(0)); //ноль
        System.out.println("Результат 2: " + numToRus(18)); //восемнадцать
        System.out.println("Результат 3: " + numToRus(126)); //сто двадцать шесть
        System.out.println("Результат 4: " + numToRus(909)); //девятьсот девять
    }

    private static String numToEng(int number)
    {
        //declaring final string
        String finStr = "";
        //declaring arrays to store strings for building
        String[] simples = new String[] { "", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] decades = new String[] {"", "", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};
        //printing zero
        if (number == 0)
            return "zero";
        //building the output final string
        if (number >= 100)
            finStr += simples[number/100] + " hundred ";
        if (number % 100 < 20 && number % 100 != 0)
            finStr += simples[number % 100];
        else
            finStr += decades[number % 100 / 10] +  " " + simples[number % 10];
        return finStr;
    }

    private static String numToRus(int number)
    {
        //declaring final string
        String finStr = "";
        //declaring arrays to store strings for building
        String[] simples = new String[] { "", "один", "два", "три", "четыре",
                "пять", "шесть", "семь", "восемь", "девять",
                "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
                "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] decades = new String[] {"", "", "двадцать", "тридцать", "сорок", "пятьдесят",
                "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] hundreds = new String[] {"", "сто", "двести", "триста", "четыреста", "пятьсот",
                "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        //printing zero
        if (number == 0)
            return "ноль";
        //building the output final string
        if (number >= 100)
            finStr += hundreds[number/100] + " ";
        if (number % 100 < 20 && number % 100 != 0)
            finStr += simples[number % 100];
        else
            finStr += decades[number % 100 / 10] +  " " + simples[number % 10];
        return finStr;
    }
}
