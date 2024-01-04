import java.util.Scanner;

public class Circumference {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Radius : ");
    float radius = sc.nextFloat();
    System.out.println(
      "Circumference of circle with radius " +
      radius +
      " is : " +
      2 *
      radius *
      3.14
    );
    sc.close();
  }
}
