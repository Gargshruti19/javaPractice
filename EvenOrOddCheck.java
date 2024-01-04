import java.util.Scanner;

public class EvenOrOddCheck {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    checkEvenorOdd(num);
    boolean even = isEven(num);
    System.out.println(even);
    sc.close();
  }

  //2. Define a program to find out whether a given number is even or odd.

  public static void checkEvenorOdd(int a) {
    if (a % 2 == 0) {
      System.out.println("Number is even");
    } else {
      System.out.println("Number is odd");
    }
  }

  public static boolean isEven(int a) {
    if (a % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
}
