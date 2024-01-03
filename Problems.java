import java.util.Scanner;


public class Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Subtract the Product and sum of Digits of an integer
//        System.out.println("Enter an Integer : ");
//        int number = sc.nextInt();
//        int sumOfDigits = 0;
//        int productOfDigits = 1;
//
//        while (number > 0) {
//            int rem = number % 10;
//            sumOfDigits += rem;
//            productOfDigits *= rem;
//            number = number / 10;
//        }
//
//        int bothSubstraction = productOfDigits - sumOfDigits;
//        System.out.println("Sum of Digits is : " + sumOfDigits);
//        System.out.println("Product of Digits is : " + productOfDigits);
//        System.out.println("Subtraction of product and sum of Digits of an integer : " + bothSubstraction);


        //2. Input a number and print all the factors of that number
//        System.out.println("Enter a number : ");
//        int num = sc.nextInt();
//        int factor;
//        System.out.println("Factors are : ");
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                factor = i;
//
//                System.out.println(factor);
//            }
//
//        }

        //3. Take integer inputs till the user enters 0 and print the sum of all numbers
//        System.out.println("Enter an integer (0 enters program will stop) : ");
//        int n = sc.nextInt();
//        int sum = 0;
//        while (true) {
//            if (n != 0) {
//                sum += n;
//                n = sc.nextInt();
//            }
//            if (n == 0) {
//                break;
//            }
//        }
//        System.out.print("Sum of integers entered : ");
//        System.out.println(sum);

        //4. Take integer inputs till the user enters 0 and print the largest from all numbers


//        int largest = Integer.MIN_VALUE;
//        System.out.println("Enter an integer (0 enters program will stop) : ");
//        while (true) {
//            int a = sc.nextInt();
//            if (a == 0) {
//                break;
//            }
//            if (a > largest) {
//                largest = a;
//            }
//
//
//        }
//        System.out.println("The largest integer is : " + largest);

        //5. Factorial of a number
//        System.out.println("Enter any number : ");
//        int b = sc.nextInt();
//        int factorial = 1;
//
//
//        for (int i = 1; i <= b; i++) {
//            factorial *= i;
//        }
//        System.out.println("Factorial of " + b + " is : " + factorial);

        //6. HCF of two numbers
//        System.out.println("Enter two numbers to find their hcf : ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int min = Math.min(a, b);
//        int hcf = 1;
//        for (int i = 1; i <= min; i++) {
//            if (a % i == 0 && b % i == 0) {
//                hcf = i;
//            }
//        }
//        System.out.println("HCF of " + a + " and " + b + " is : " + hcf);

        //7. LCM of two numbers
//        System.out.println("Enter two numbers to find their LCM");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//
//        int lcm = 1;
//        for (int i = 1; i <= x * y; i++) {
//            if (i % x == 0 && i % y == 0) {
//                lcm = i;
//                break;
//            }
//        }
//        System.out.println("LCM of " + x + " and " + y + " is : " + lcm);

        //Armstrong Number
//        System.out.println("Enter any number to check if it is ARMSTRONG NUMBER or not : ");
//        int c = sc.nextInt();
//        int originalC = c;
//        int res = 0;
//        int numberOfDigits = 0;
//        while (originalC != 0) {
//            originalC /= 10;
//            numberOfDigits++;
//
//        }
//        originalC = c;
//        while (originalC != 0) {
//
//            int rem = originalC % 10;
//            res += Math.pow(rem, numberOfDigits);
//
//            originalC /= 10;
//
//        }
//
//        if (res == c) {
//            System.out.println(c + " is an Armstrong Number");
//        } else {
//            System.out.println("No , " + c + " is not an Armstrong Number !!");
//        }


        sc.close();
    }
}