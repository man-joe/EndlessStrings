/*
The following program should allow the user to input as many things as they want until they stop.
Each time it is supposed to repeat with what the user said, can you fix it?
 */

import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";

        userInput = keyboard.next();

        while (!userInput.equals("stop")) { //Could run indefinitely. looking for stop
            System.out.println(userInput);
            userInput = keyboard.next(); // to fix bug. Added change
        }

    }
}