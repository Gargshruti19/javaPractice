import java.util.Scanner;

public class calculateusingOperator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first Number :");
    int num1 = sc.nextInt();
    System.out.println("Enter any operator between \n(+, -, * , /) : ");
    char operator = sc.next().charAt(0);
    System.out.println("Enter second Number :");

    double num2 = sc.nextDouble();
    double sum = num1 + num2;
    double min = num1 - num2;
    double mul = num1 * num2;
    double div = num1 / num2;

    if (operator == '+') {
      System.out.println("Addition is : " + sum);
    } else if (operator == '-') {
      System.out.println("Substraction is : " + min);
    } else if (operator == '*') {
      System.out.println("Multiplication is : " + mul);
    } else if (operator == '/') {
      System.out.println("Division is : " + div);
    } else {
      System.out.println("Invalid operator.");
    }

    sc.close();
  }
}
