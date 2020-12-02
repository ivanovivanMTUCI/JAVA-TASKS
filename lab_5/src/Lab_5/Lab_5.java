package Lab_5;

import java.util.*;

public class Lab_5 {
    public static void main(String[] args)
    {
        //declaring a "Random" object
        Random rand = new Random();
        //selecting the range
        int min = 1, max = 10;
        //inputting the names
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input player name: ");
        Player player = new Player(scanner.nextLine());
        System.out.println("Input enemy name: ");
        Enemy enemy = new Enemy(scanner.nextLine());

        int guessInt;
        while (player.lives > 0 && enemy.lives > 0)
        {
            //generating random numbers for a round
            player.num = rand.nextInt(max - min + 1) + min;
            enemy.num = rand.nextInt(max - min + 1) + min;
            //player guesses enemy's number
            System.out.println("Guess enemy's number: ");
            guessInt = scanner.nextInt();
            enemy.checkRandom(guessInt, enemy);
            //enemy guesses player's number
            player.checkRandom(player.num, enemy, player);
            //actual number output
            System.out.println("Actual player number: " + player.num);
            System.out.println("Actual enemy number: " + enemy.num);
        }
        System.out.println("Game is over!");
        //announcing the winner
        if (player.lives <= 0)
            System.out.println("Enemy " + enemy.name + " won!");
        else if (enemy.lives <= 0)
            System.out.println("Player " + player.name + "won!");
        else System.out.println("ERROR!");
    }
}

//internal class
class Enemy {
    public int num;
    public int lives;
    String name;
    public Enemy(String name)
    {
        this.name = name;
        //giving life
        this.lives = 100;
    }
    public void loseLives(Enemy enemy)
    {
        //taking life
        enemy.lives -= 10;
    }
    public void checkRandom(int guessInt, Enemy enemy)
    {
        //if player is right
        if (enemy.num == guessInt)
        {
            //enemy loses lives
            enemy.loseLives(enemy);
            System.out.println("You were right, now the enemy " + enemy.name + " has " + enemy.lives + " lives left!");
        }
        else if (enemy.num > guessInt)
            System.out.println("You were wrong! The number you're trying to guess is greater.");
        else System.out.println("You were wrong! The number you're trying to guess is smaller.");
    }
}

//internal class
class Player {
    public int num;
    public int lives;
    String name;
    public Player(String name)
    {
        this.name = name;
        //giving life
        this.lives = 100;
    }
    public void loseLives(Player player)
    {
        //taking life
        player.lives -= 10;
    }
    public void checkRandom(int guessInt, Enemy enemy, Player player)
    {
        //if enemy is right
        if (enemy.num == guessInt)
        {
            //player loses lives
            player.loseLives(player);
            System.out.println("Enemy guessed your number! " + player.name + " has " + player.lives + " lives left!");
        }
        else
            System.out.println("Enemy didn't guess your number.");
    }
}


















/*
class Char {
    public int num;
    public int lives;
    String name;
    public Char(String name)
    {
        this.name = name;
        this.lives = 100;
    }
    public static void loseLives(Char char)
    {
        char.lives -= 10;
    }
}
*/