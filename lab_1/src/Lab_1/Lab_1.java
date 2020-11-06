package Lab_1;

import java.util.*;

public class Lab_1 {
    public static void main(String[] args)
    {
        //declaring 3 threads
        GenThread rand = new GenThread();
        SqThread sq = new SqThread();
        CubThread cb = new CubThread();
        //starting threads
        rand.start();
        sq.start();
        cb.start();
        int number;
        while (true)
        {
            try
            {
                //getting a value
                number = GenThread.randRun();
                //waiting 1 second
                rand.sleep(1000);
                //checking if odd or even
                if (number % 2 == 0)
                    sq.sqRun(number);
                else
                    cb.cbRun(number);
            }
            catch (InterruptedException e)
            {
                System.out.println("There has been an exception!");
            }
        }
    }
}

//extends "Thread" class
class GenThread extends Thread {
    public static int randRun()
    {
        //declaring a "Random" Object
        Random rand = new Random();
        //setting an upperbound (from 0-1000) for a random number
        int upperbound = 1001;
        return rand.nextInt(upperbound);
    }
}

//extends "Thread" class
class SqThread extends Thread {
    public static void sqRun(int x)
    {
        //returning a square
        System.out.println("Square of " + x + ": " + Math.pow(x,2));
    }
}

//extends "Thread" class
class CubThread extends Thread {
    public static void cbRun(int x)
    {
        //returning a cube
        System.out.println("Cube of " + x + ": " + Math.pow(x,3));
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