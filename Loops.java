import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.println("Enter nth term to print fibonacci series :");
        int n = sc.nextInt();
        int c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
        sc.close();
    }
}

