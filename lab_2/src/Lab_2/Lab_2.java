package Lab_2;

import java.util.*;
import java.io.*;

public class Lab_2 {
    public static void main(String[] args) throws FileNotFoundException //handling a file exception
    {
        //declaring 2 info arrays
        String[] countries = {"United States", "Russia", "Germany", "Saudi Arabia", "United Arab Emirates",
                "United Kingdom", "France", "Canada", "Australia", "Spain"};
        double[][] immigrants = {{45785090, 19.8, 14.3}, {11048064, 4.8, 7.7}, {9845244, 4.3, 11.9}, {9060433, 3.9, 31.4}, {7826981, 3.4, 83.7},
                {7824131, 3.4, 12.4}, {7439086, 3.2, 11.6}, {7284069, 3.1, 20.7}, {6468640, 2.8, 27.7}, {6466605, 2.8, 13.8}};
        //calling a method with both arrays as input parameters
        setParams(countries, immigrants);
        System.out.println(System.lineSeparator());
        //calling a method to read from file as input
        fileRead(countries);
    }

    private static void setParams(String[] countries, double[][] immigrants)
    {
        //declaring variables
        int leastCountry = 0, greatestCountry = 0, totalImmigrant = 0;
        double totalPercent = 0, greatestImmigrant = 0, leastImmigrant = 100, totalPopulation = 0;
        //printing out formatted info from the input arrays
        System.out.printf("%-25s%-20s%-15s%-15s%n", "Country", "Immigrants", "% world total", "% population");
        for (int i = 0; i < immigrants.length; i++)
            System.out.printf("%-25s%-20s%-15s%-15s%n", countries[i], (int) immigrants[i][0], immigrants[i][1], immigrants[i][2]);    //можно добавить Double.toString
        //counting up total numbers of immigrants and percentages
        for (double[] value : immigrants)
        {
            for (int j = 0; j < value.length; j++)
                if (j == 0)
                    totalImmigrant += value[j];
                else if (j == 1)
                    totalPercent += value[j];
        }
        //finding a country with least immigrants
        for (int i = 0; i < immigrants.length; i++)
        {
            for (int j = 2; j < immigrants[i].length; j++)
            {
                if (immigrants[i][j] < leastImmigrant)
                {
                    leastImmigrant = immigrants[i][j];
                    leastCountry = i;
                }
            }
        }
        //finding a country with greatest immigrants
        for (int i = 0; i < immigrants.length; i++)
        {
            for (int j = 2; j < immigrants[i].length; j++)
            {
                if (immigrants[i][j] > greatestImmigrant)
                {
                    greatestImmigrant = immigrants[i][j];
                    greatestCountry = i;
                }
            }
        }
        //estimating the total population of countries
        for (double[] immigrant : immigrants)
            totalPopulation += immigrant[0] / immigrant[2] * 100;
        System.out.println("Total immigrants: " + totalImmigrant);
        System.out.println("Total percentage of world`s immigrants: " + totalPercent);
        System.out.println("Country with least immigration: " + countries[leastCountry]);
        System.out.println("Country with greatest immigration: " + countries[greatestCountry]);
        System.out.println("Total estimated population of all countries: " + (int) totalPopulation);
    }

    private static void fileRead(String[] countries) throws FileNotFoundException   //this method might get a file exception
    {
        //declaring an array to put data from the file into
        double[][] outArr;
        //reading from the txt file
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("C:\\Users\\Vanya\\Lab2.txt"))))
        {
            int rows = 10;
            int columns = 3;
            outArr = new double[rows][columns];
            while (scanner.hasNextLine())
            {
                for (int i = 0; i < outArr.length; i++)
                {
                    //splitting on every space in a row string
                    String[] line = scanner.nextLine().trim().split(" ");
                    for (int j = 0; j < line.length; j++)
                        outArr[i][j] = Double.parseDouble(line[j]);
                }
            }
        }

        //declaring lists to compare the indexes
        ArrayList<Double> orderArr = new ArrayList<>();
        ArrayList<Double> compareArr = new ArrayList<>();
        ArrayList<Integer> indexArr = new ArrayList<>();
        //filling 2 lists with same percentage info
        for (double[] percent : outArr)
        {
            orderArr.add(percent[2]);
            compareArr.add(percent[2]);
        }
        //sorting the first list in reverse order
        orderArr.sort(Collections.reverseOrder());
        //filling the indexArr list with corresponding indexes from outArr (through compareArr)
        for (Object percent : orderArr)
            indexArr.add(compareArr.indexOf(percent));
        System.out.printf("%-25s%-20s%-15s%-15s%n", "Country", "Immigrants", "% world total", "% population");
        //printing out the info from info arrays ordered by indexes from the indexArr list
        for (int index : indexArr)
            System.out.printf("%-25s%-20s%-15s%-15s%n", countries[index], (int) outArr[index][0],
                    outArr[index][1], outArr[index][2]);
    }
}
