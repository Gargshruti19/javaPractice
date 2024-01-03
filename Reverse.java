import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        System.out.print("Reverse of this number is  : ");
        int result = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            result = result * 10 + rem;

        }
        System.out.print(result);
        sc.close();
    }
}
