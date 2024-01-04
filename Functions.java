import java.util.Scanner;

public class Functions {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int greatest = max(a, b, c);
    int smallest = min(a, b, c);
    System.out.println("Greatest is :" + greatest);
    System.out.println("Smallest is : " + smallest);

    sc.close();
  }

  //1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
  public static int max(int a, int b, int c) {
    int max = a;
    if (b > max) {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    return max;
  }

  public static int min(int a, int b, int c) {
    int min = a;
    if (b < min) {
      min = b;
    }
    if (c < min) {
      min = c;
    }
    return min;
  }
}
