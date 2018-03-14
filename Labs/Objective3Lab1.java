import java.util.Scanner;

public class Objective3Lab1 {
  public static void main(String[] args) {
    String userInput = "";
    Scanner input = new Scanner(System.in);

    System.out.println("Please Type a word: ");

    String userword = input.next();
    System.out.println(userword);
    input.close();
  }
}
