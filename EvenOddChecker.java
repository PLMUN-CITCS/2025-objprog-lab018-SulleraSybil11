import java.util.Scanner;  //Importing a Scanner class for users input

public class EvenOddChecker {
    
    public static int getIntegerInput() {  //Defining the main method to get integer input from the user
Scanner scanner = new Scanner(System.in);
System.out.print("Enter an integer: ");
int number = scanner.nextInt();
return number;

}

public static String checkEvenOrOdd(int number){  //Method to check if the number is even or odd
           if (number % 2 == 0) {  //Calculation for even number
               return number + " is an Even number.";  //Returning a message for even number
           } else {
               return number + " is an Odd number.";  //Returning a message for odd number
           }

}

public static void main(String[] args) {
    int number = getIntegerInput();
    String result = checkEvenOrOdd(number);
    System.out.println(result);  //Printing the result

    }
}