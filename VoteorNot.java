import java.util.Scanner;

public class VoteorNot {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Age : ");
    int age = sc.nextInt();
    if (age >= 18) {
      System.out.println("You can Vote !");
    } else {
      System.out.println("You Can't Vote !");
    }
    sc.close();
  }
}
