package Task_3_10;

public class Task_3_10 {
    public static void main(String[] args)
    {
        System.out.println("Right triangle is real? Result 1: "+
                isRightTriangle(3, 4, 5)); //true
        System.out.println("Right triangle is real? Result 2: "+
                isRightTriangle(145, 105, 100)); //true
        System.out.println("Right triangle is real? Result 3: "+
                isRightTriangle(70, 130, 110)); //false
    }
    private static boolean isRightTriangle(int x, int y, int z)
    {
        if (((x*x)+(y*y)==(z*z)) ||
                ((x*x)+(z*z)==(y*y)) ||
                ((y*y)+(z*z)==(x*x)))
        {
            return true;
        }
        return false;
    }
}
