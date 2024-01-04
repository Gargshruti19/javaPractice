import java.util.Scanner;

public class Power {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter base Value : ");
    int x = sc.nextInt();
    System.out.println("Enter exponent value : ");
    int n = sc.nextInt();
    int flag = x;
    for (int i = 0; i < n; i++) {
      flag = flag + x;
    }
    System.out.println(x + " raised to the power of " + n + " is : " + flag);
    sc.close();
  }
}

