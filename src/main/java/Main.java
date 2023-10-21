//Change to push
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    String tab = "Output: ";
    String userCommand = "";
    String[] command;
    int totalComputation = 0;
    String textualComputation = "";

    Calculator calculator = new Calculator(); // Set up the Calculator object that will be used
    Scanner scanner = new Scanner(System.in); // Read input from the user

    System.out.println("Welcome to the Calculator!");
    while(!"exit".equals(userCommand)){
      System.out.print("Input: ");
      userCommand = scanner.nextLine();

      // Logic of Calculator
      command = userCommand.split(" ");
      if ("add".equals(command[0])) {
        totalComputation = calculator.add(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
      } else if ("subtract".equals(command[0])) {
        totalComputation = calculator.subtract(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
      } else if ("multiply".equals(command[0])) {
        totalComputation = calculator.multiply(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
      } else if ("binary".equals(command[0])) {
        textualComputation = calculator.intToBinaryNumber(Integer.parseInt(command[1]));
        totalComputation = 0;
      } else if ("fib".equals(command[0])) {
        totalComputation = calculator.fibonacciNumberFinder(Integer.parseInt(command[1]));
      }
      if (totalComputation == 0) {
        System.out.printf("%s%s%n%n",tab,textualComputation);
      }
      else {
        System.out.printf("%s%s%n%n",tab,totalComputation);
      }
    }
    if(userCommand == "exit"){
      scanner.close();
    }
  }
}
