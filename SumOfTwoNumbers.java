import java.util.Scanner;

public class SumOfTwoNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int Sum = sum(a, b);
    System.out.println("Sum of " + a + " and " + b + " is :" + Sum);
    sc.close();
  }

  //Write a program to print the sum of two numbers entered by user by defining your own method.
  public static int sum(int a, int b) {
    return a + b;
  }
}
