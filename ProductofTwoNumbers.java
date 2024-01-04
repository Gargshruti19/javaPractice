import java.util.Scanner;

public class ProductofTwoNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int Product = product(a, b);
    System.out.println("Product of " + a + " and " + b + " is : " + Product);
    sc.close();
  }

  //Define a method that returns the product of two numbers entered by user.
  public static int product(int a, int b) {
    return a * b;
  }
}
