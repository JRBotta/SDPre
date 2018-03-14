import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {
    double first, second, sum;
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number:");
    first = input.nextDouble();
    System.out.println("Please enter another number:");
    second = input.nextDouble();
    sum = first + second;
    System.out.println("The sum of " + first + " + " + second + " = " + sum);
    input.close();
  }
}
