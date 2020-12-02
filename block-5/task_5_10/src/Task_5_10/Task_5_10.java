package Task_5_10;

public class Task_5_10 {
    public static void main(String[] args)
    {
        System.out.println("Figure 1: ");
        System.out.println(hexLattice(1)); //" o "
        System.out.println("Figure 2: ");
        System.out.println(hexLattice(7)); //" o o \n o o o \n o o "
        System.out.println("Figure 3: ");
        System.out.println(hexLattice(19)); //" o o o \n o o o o \n o o o o o \n o o o o \n o o o "
        System.out.println("Figure 4: ");
        System.out.println(hexLattice(21)); //Invalid input!
    }

    private static String hexLattice(int a)
    {
        //declaring final string
        StringBuilder finStr = new StringBuilder();
        int resInt, i, j;
        //hexagonal formula
        double resDouble = (1 / 2.0) + ((1 / 6.0) * Math.sqrt(12.0 * a - 3));
        //check if result integer
        if (Math.ceil(resDouble) == Math.floor(resDouble))
        {
            resInt = (int) resDouble;
            //first half up
            i=0;
            while (i<resInt)
            {
                //spaces before
                for (j=0; j<resInt-i; j++)
                    finStr.append(" ");
                //letters "o"
                for (j=0; j<resInt+i; j++)
                    finStr.append("o ");
                //spaces after
                for (j=0; j<resInt-i-1; j++)
                    finStr.append(" ");
                //next line
                finStr.append("\n");
                i++;
            }
            //second half down
            i=resInt-2;
            while (i>=0)
            {
                //spaces before
                for (j=0; j<resInt-i; j++)
                    finStr.append(" ");
                //letters "o"
                for (j=0; j<resInt+i; j++)
                    finStr.append("o ");
                //spaces after
                for (j=0; j<resInt-i-1; j++)
                    finStr.append(" ");
                //next line
                finStr.append("\n");
                i--;
            }
        }
        //a is not a sixangle number
        else return "Invalid input!";
        return finStr.toString();
    }
}
