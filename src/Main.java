import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
       String name = giveName();
       // ezMath();
        harderMath(name);
    }
    //1. Create a method that returns a String named "name"  which is the userInput (your name).
    //	a) Ask the User for their name
    //	b) return their name.

    public static String giveName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = scan.nextLine();
        System.out.println("Your name is: " + name);
        return name;
    }

    //2. Create a method that prints out a variable that contains the number 1.
    //	- Int x = 20; Find a way to make x = 1.

    public static void ezMath() {
        int x = 20;
        System.out.println(x - 19);
    }

    //3. Create a method that takes in a String Parameter.
    //	-Task is to create a math problem such as "Find x, 2x = 10, What is the solution?"
    //	-Take in the User input
    //	-Check if the User Input is correct and using method 1,
    //		use their name. So " 5 is Correct, Good Job Alex (Alex is your String name from Method 1)"
    //	-If its wrong,  Tell them they were incorrect and use their name. "You were Incorrect Alex, please try again."
    public static void harderMath(String name) {
        //Present the problem
        System.out.println("Find x, 2x = 10, What is the solution?");
        // Declare variable for correct answer
        int correctAnswer = 5;
        // Takes a user input
        Scanner scan  = new Scanner(System.in);
        String userInput = scan.nextLine();
        int userParsedNum = Integer.parseInt(userInput);
        //Check if user input = correct answer
        if(userParsedNum == correctAnswer)
            System.out.println("5 is correct, Good Job! " + name);
        else{
            System.out.println("You were Incorrect " + name + ", please try again.");
            harderMath(name);
        }

    }

}