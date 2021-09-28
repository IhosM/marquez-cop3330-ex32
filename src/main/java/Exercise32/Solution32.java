/*
 *  UCF COP3330 Fall 2021 Assignment 32 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise32;

import java.util.Scanner;
import java.util.Random;

public class Solution32
{
    public static void level1()
    {
        Random r = new Random();
        int i;
        int minimum = 1, maximum = 10;
        int guessCount = 0, randomNumber = r.nextInt(maximum - minimum + 1) + minimum;

        Scanner scan = new Scanner(System.in);
        boolean check = false;


        System.out.print("I have my number. Whats your guess? ");
        i = scan.nextInt();
        while(!check)
        {
            if(i > randomNumber)
            {
                System.out.print("Too high. Guess again? ");
                i = scan.nextInt();
                guessCount++;
            }
            else if(i < randomNumber)
            {
                System.out.print("Too low. Guess again? ");
                i = scan.nextInt();
                guessCount++;
            }
            else
            {
                System.out.print("You got it in " + (guessCount + 1) + " guesses!");
                check = true;

                replay();
            }
        }
    }

    public static void level2()
    {
        Random r = new Random();
        int i;
        int minimum = 1, maximum = 100;
        int guessCount = 0, randomNumber = r.nextInt(maximum - minimum + 1) + minimum;

        Scanner scan = new Scanner(System.in);
        boolean check = false;



        System.out.print("I have my number. Whats your guess? ");
        i = scan.nextInt();
        while(!check)
        {
            if(i > randomNumber)
            {
                System.out.print("Too high. Guess again? ");
                i = scan.nextInt();
                guessCount++;
            }
            else if(i < randomNumber)
            {
                System.out.print("Too low. Guess again? ");
                i = scan.nextInt();
                guessCount++;
            }
            else
            {
                System.out.print("You got it in " + (guessCount + 1) + " guesses!");
                check = true;

                replay();
            }
        }
    }

    public static void level3()
    {
        Random r = new Random();
        int i;
        int minimum = 1, maximum = 1000;
        int guessCount = 0, randomNumber = r.nextInt(maximum - minimum + 1) + minimum;
        Scanner scan = new Scanner(System.in);
        boolean check = false;


        System.out.print("I have my number. Whats your guess? ");
        i = scan.nextInt();

        while(!check)
        {
            if(i > randomNumber)
            {
                System.out.print("Too high. Guess again? ");
                i = scan.nextInt();
                guessCount++;
            }
            else if(i < randomNumber)
            {
                System.out.print("Too low. Guess again? ");
                i = scan.nextInt();
                guessCount++;
            }
            else
            {
                System.out.print("You got it in " + (guessCount + 1) + " guesses!");
                check = true;

                replay();
            }
        }
    }

    public static void replay()
    {

        String c, yes = "y", no = "n";
        Scanner scan = new Scanner(System.in);

        System.out.print("\n");
        System.out.print("Do you wish to play again (Y / N): ");
        c = scan.nextLine();

        if(c.equalsIgnoreCase(yes))
        {

            System.out.print("Lets play guess the Number!\n");


            boolean check = false;

            while(!check)
            {
                System.out.print("Enter the difficulty level (1, 2 or 3): ");
                String i = scan.nextLine();
                switch (i)
                {
                    case "1":

                        System.out.println("\n");
                        level1();
                        check = true;
                        break;

                    case "2":

                        System.out.println("\n");
                        level2();
                        check = true;
                        break;

                    case "3":

                        System.out.println("\n");
                        level3();
                        check = true;
                        break;

                    default:
                        System.out.println("\n");
                        System.out.print("Not a valid input. Choose difficulty level.\n");
                }
            }

        }

        if(c.equalsIgnoreCase(no)) {
            System.out.print("Game Over.");
        }

    }

    public static void main(String[] args) {



        System.out.print("Lets play guess the Number! \n");

        Scanner scan = new Scanner(System.in);

        boolean check = false;

        while(!check)
        {
            System.out.print("Enter the difficulty level (1, 2 or 3): ");
            String i = scan.nextLine();
            switch (i)
            {
                case "1":

                    System.out.println("\n");
                    level1();
                    check = true;
                    break;

                case "2":

                    System.out.println("\n");
                    level2();
                    check = true;
                    break;

                case "3":

                    System.out.println("\n");
                    level3();
                    check = true;
                    break;

                default:
                    System.out.println("\n");
                    System.out.print("Not a valid input. Choose difficulty level.\n");

            }

        }

    }
}