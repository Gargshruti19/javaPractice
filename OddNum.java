import java.util.Scanner;

public class OddNum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a digit :");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        sum = sum + i;
      }
    }
    System.out.println(
      "Sum of odd numbers between 1 and " + n + " is : " + sum
    );
    sc.close();
  }
}