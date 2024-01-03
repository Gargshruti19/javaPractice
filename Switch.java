import java.util.Scanner;

public class Switch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //        String fruit = sc.next();
    //        switch (fruit) {
    //            case "mango" -> System.out.println("King");
    //            case "apple" -> System.out.println("doctor prescribed");
    //            case "orange" -> System.out.println("Sour");
    //            case "grapes" -> System.out.println("in groups");
    //            default -> System.out.println("Any other fruit ");
    //        }
    //        int day = sc.nextInt();
    //        switch (day) {
    //            case 1 -> System.out.println("MONDAY");
    //            case 2 -> System.out.println("TUESDAY");
    //            case 3 -> System.out.println("WEDNESDAY");
    //            case 4 -> System.out.println("THURSDAY");
    //            case 5 -> System.out.println("FRIDAY");
    //            case 6 -> System.out.println("SATURDAY");
    //            case 7 -> System.out.println("SUNDAY");
    //            default -> System.out.println("INVALID DAY");
    //        }
    //Nested switch case = switch case inside switch
    int empID = sc.nextInt();
    String dept = sc.next();
    switch (empID) {
      case 1 -> System.out.println("Sg");
      case 2 -> System.out.println("RK");
      case 3 -> {
        switch (dept) {
          case "maths" -> System.out.println("MAths dept");
          case "english" -> System.out.println("Eng");
          default -> System.out.println("Invalid dept");
        }
      }
      default -> System.out.println("Invalid id");
    }
    sc.close();
  }
}
