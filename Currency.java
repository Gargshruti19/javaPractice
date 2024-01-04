import java.util.Scanner;

public class Currency {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float indianRupee = sc.nextFloat();
    float usd = (float) (0.012 * indianRupee);
    System.out.println(indianRupee + " indian rupees in usd is " + usd);
    sc.close();
  }
}
