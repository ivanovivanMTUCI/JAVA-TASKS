package Lab_1;

import java.util.*;

public class Lab_1 {
    public static void main(String[] args)
    {
        GenThread rand = new GenThread();
        SqThread sqr = new SqThread();
        CubThread cub = new CubThread();
        rand.start();
        sqr.start();
        cub.start();
        int number;
        while (true)
        {
            number = GenThread.randRun();
            try {
                rand.sleep(1000);
                if (number % 2 == 0)
                    sqr.sqrtRun(number);
                else
                    cub.cbrtRun(number);
            } catch (InterruptedException e) {
                System.out.println("There has been an exception!");
            }
        }
    }
}

class GenThread extends Thread {
    public static int randRun()
    {
        Random rand = new Random();
        int upperbound = 1001;  //generate random values from 0-1000
        return rand.nextInt(upperbound);
    }
}

class SqThread extends Thread {
    public static void sqrtRun(int x)
    {
        System.out.println("Square root of " + x + ": " + Math.sqrt(x));
    }
}

class CubThread extends Thread {
    public static void cbrtRun(int x)
    {
        System.out.println("Cube root of " + x + ": " + Math.cbrt(x));
    }
}













/*
class GenThread implements Runnable {
    Random rand = new Random();
    Thread thread;
    private final String tname;
    int randNum;
    GenThread(String name, int number)
    {
        tname = name;
        randNum = number;
    }
    public void run()
    {
        System.out.println("Thread running: " + tname);
        int upperbound = 1001;
        //generate random values from 0-1000
        randNum = rand.nextInt(upperbound);
        System.out.println("Random number: " + randNum);
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread has been interrupted!");
        }
    }
    public int getValue()
    {
        return randNum;
    }
    public void start()
    {
        System.out.println("Thread started.");
        if (thread == null)
        {
            thread = new Thread(this, tname);
            thread.start();
        }
    }
}

class SqThread implements Runnable {
    Thread thread;
    private final String tname;
    double randNum, sqrtNum;
    SqThread(String name, int number)
    {
        tname = name;
        randNum = number;
    }
    public void run()
    {
        System.out.println("Thread running: " + tname);
        if (randNum%2==0)
            sqrtNum = Math.sqrt(randNum);
        System.out.println("Square root: " + sqrtNum);
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread has been interrupted!");
        }
    }
    public void start()
    {
        System.out.println("Thread started.");
        if (thread == null)
        {
            thread = new Thread(this, tname);
            thread.start();
        }

    }
}

class CubThread implements Runnable {
    Thread thread;
    private final String tname;
    double randNum, cubeNum;
    CubThread(String name, int number)
    {
        tname = name;
        randNum = number;
    }
    public void run()
    {
        System.out.println("Thread running: " + tname);
        if (randNum%2==0)
            cubeNum = Math.cbrt(randNum);
        System.out.println("Cube root: " + cubeNum);
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread has been interrupted!");
        }
    }
    public void start()
    {
        System.out.println("Thread started.");
        if (thread == null)
        {
            thread = new Thread(this, tname);
            thread.start();
        }

    }
}
        */