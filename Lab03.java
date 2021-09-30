/**
     * Random Number Guessing Game Program
     * Ethan St John
     * CS232 - 002
     * 
     * This program is designed as a random number generating guessing game.
     * At first it greets the user and gets a name. Then it prompts the user
     * that it's thinking of a number between the specified range and after that,
     * the user is allowed to begin guessing. The program stores the guesses and 
     * determines if it is within the range. After that the program determines
     * if the users guess is too high or too low until they eventually can 
     * narrow it down enough to solve the game. After 10 incorrect guesses without
     * getting the random number correct, the user will lose and if they can
     * get the number right, then they win. Each having a displaying message
     * at the end to the user.
     */
package lab03;


import java.util.*;


public class Lab03 {    
    
    public static void main(String[] args) {
        
        // Create Scanner object and counter for game
        Scanner userIn = new Scanner(System.in);
        int guesses = 0;
        int guessMax = 10;
        boolean gameOver = false; // Flag to end while once game is over

        
        //Generate Random number
        int randNum = (int)(Math.random() * 100) + 1;

        
        //Print greeting for User 
        System.out.println("Random Number Generation Game\n");
        System.out.println("" + "Hello, my names CodeBot. What's your name?");
        String userName = userIn.nextLine();
        System.out.println("\nWell " + userName + ", I'm looking for a number "
                + "between 1 and 100. Could you help figure it out?\n");
        
        
        //Read in number        
        do {
            System.out.print("Please guess a number: ");
            int userNum = userIn.nextInt();
            
            //Test if the user input is within the range of the game
            if (userNum < 1 || userNum > 100){
                System.out.println("Sorry, but that's not in the range." + 
                        "Remember, my number is between 1 and 100\n");
                guesses++;
            }
            
            //Determine if number is too high or low, and if the user won or lost
            if (userNum > randNum){
                System.out.println(userNum + " is too high\n");
                guesses++;
            }
            else if (userNum < randNum){
                System.out.println(userNum + " is too low\n");
                guesses++;
            }
            else if (userNum == randNum){
                guesses++;
                        
                System.out.println("Congratulations " + userName + " You guessed "
                  + "my number in " + guesses + " guess(es)");
                
                gameOver = true;
            }
            if (guesses > guessMax - 1){
                System.out.println("Sorry, but it looks like your out of guesses"
                    + " The random number was " + randNum);               
                gameOver = true;
            }
        }
        while(!gameOver);
        
        
        
        
        
    }
    
}
