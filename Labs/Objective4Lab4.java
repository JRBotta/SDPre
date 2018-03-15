import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int num = keyboard.nextInt();
    System.out.print("The number is ");
    if(num % 2 == 0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
  }
}
