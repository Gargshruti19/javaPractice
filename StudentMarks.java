import java.util.*;

public class StudentMarks {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Name :");

    String name = sc.nextLine();
    System.out.println("Enter Your Roll No. :");
    int rollno = sc.nextInt();

    System.out.println("Enter Your Class :");

    int standard = sc.nextInt();
    System.out.println("Enter Your Marks :");
    System.out.print("Maths :");
    float m = sc.nextFloat();
    System.out.print("English :");
    float e = sc.nextFloat();
    System.out.print("Hindi :");

    float h = sc.nextFloat();
    System.out.print("Science :");

    float s = sc.nextFloat();
    System.out.print("Sst :");

    float st = sc.nextFloat();

    float totalMarksInPercent = (m + e + h + s + st) / 5;
    System.out.println("Your Total Marks : " + totalMarksInPercent);
    if (totalMarksInPercent < 33) {
      System.out.println("You Failed in exams");
    } else {
      System.out.println("You Passed in Exams ");
      if (totalMarksInPercent < 50 && totalMarksInPercent > 33) {
        System.out.println("Got 3rd Divison");
      } else if (totalMarksInPercent > 50 && totalMarksInPercent < 80) {
        System.out.println("Got 2nd Divison");
      } else if (totalMarksInPercent > 80) {
        System.out.println("Got 1st Divison");
      }
    }
    System.out.println(
      name +
      " in standard " +
      standard +
      " with roll no. " +
      rollno +
      " got " +
      totalMarksInPercent +
      " marks."
    );
    sc.close();
  }
}
