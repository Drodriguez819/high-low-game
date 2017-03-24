/*
* Name: David Rodriguez
* Section: COSC/ITSE 1336
* Homework: Excercise 13
* Description: Loop for Hi-Low Game
*/

/*
* -------------------------------PSUDO CODE---------------------------------------------
* 1) Create a class (that is a loop) that compares a list of numbers from 1-100 to user input WHILE also asking user for their username 
*       ()Person will have ability to be able to enter player's username 
*       () make list of numbers to be randomly generated
*       () make list so that number is generated first so that the user can guess if the next generated number will be higher or lower than previous number 
*           (*) first generated number prompts user guess and println.out displays "User please guess wheather the next number will either be high or low."
*           (*) user guess prompts next number to be generated
*           (*) if user guess >= to previous number then display "Sweet sauce! Round complete!"
*           (*) if user guess =< to previous number then display "Better luck next round! Round complete!"
* 4) load class into main and call out functions
* 5) Feel satisfied with yourself
*---------------------------------------------------------------------------------------
*/

import java.util.Scanner;
import java.util.Random;
    public class Hilowloop{
            
            
              
        public static void main (String [] strArgs){
            Random rdmNumber = new Random();
            int intrdm = rdmNumber.nextInt(100)+1;
            Scanner scnnrInput= new Scanner(System.in);
            String  username = "";
            int     intNumberInput= 1;
            
            
//prompts user to enter username
             System.out.println("Welcome. Please Enter a username.");
                username = scnnrInput.next();
 //loops 
        while(intNumberInput != intrdm){

             System.out.println("The number is "+ intrdm);
             System.out.println("Will the next number be higher or lower? Please type your answer by picking any number above or below the previous one.");
             System.out.println("Please enter an integer between 1-100.");
                intNumberInput = scnnrInput.nextInt();
            if ( intNumberInput < intrdm ){
                System.out.println("Correct. Nice job "+ username);
            }
            else if ( intNumberInput > intrdm){
                System.out.println("Correct. Nice job "+ username);
            }
            System.out.println("Sorry, please try again "+username);
        }
    }
}
