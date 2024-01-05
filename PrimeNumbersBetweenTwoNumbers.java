import java.util.Scanner;

public class PrimeNumbersBetweenTwoNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Prime number (between two numbers)");
    System.out.print("Enter first number : ");
    int a = sc.nextInt();
    System.out.print("Enter second number : ");
    int b = sc.nextInt();

    System.out.println("Prime numbers between " + a + " and " + b + " are : ");
    for (int i = a; i <= b; i++) {
      if (i <= 1) {
        continue;
      }

      boolean isPrime = true;
      for (int j = 2; j * j <= i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.println(i);
      }
    }
    sc.close();
  }
}
