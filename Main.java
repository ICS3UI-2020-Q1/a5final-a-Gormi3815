import java.util.Scanner;

/**
 * this program will ask the user for the size of a line and then print black
 * and white in alternating words for how long the number is
 *
 * @author Isaac
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number");
    int length = input.nextInt();
    for (double count = 0; count < length; count++) {
      double countRemainder = count % 2;
      if (countRemainder == 0) {
        System.out.print("black ");
      } else if (countRemainder == 1) {
        System.out.print("Yellow ");
      }

    }
  }
}
