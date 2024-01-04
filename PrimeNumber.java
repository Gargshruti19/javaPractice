import java.util.Scanner;

public class PrimeNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int a = sc.nextInt();
    isPrime(a);
    sc.close();
  }

  //Define a method to find out if a number is prime or not.

  public static void isPrime(int a) {
    int i = 2;
    while (i < a) {
      if (a % i == 0) {
        System.out.println("Not prime");
        return;
      } else {
        i++;
      }
    }
    System.out.println("Prime number");
  }
}
