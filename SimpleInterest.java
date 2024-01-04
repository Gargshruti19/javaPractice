import java.util.Scanner;

public class SimpleInterest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Pricipal Amount :");
    int principal = sc.nextInt();
    System.out.println("Enter Rate in percentage");

    float rate = sc.nextFloat();
    System.out.println("Enter time in years");

    int time = sc.nextInt();
    float simpleInterest = principal * rate * time / 100;
    System.out.println("Simple Interest : " + simpleInterest);
    sc.close();
  }
}
