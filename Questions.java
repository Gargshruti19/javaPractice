import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Area of circle
        System.out.println("Enter Radius of circle :");
        float radius = sc.nextFloat();
        float areaCircle = 3.14F * radius * radius;
        System.out.println("Area of circle : " + areaCircle);

        //2. area of triangle also for isosceles triangle
        System.out.println("Enter breadth and height of triangle : ");
        int b = sc.nextInt();
        int h = sc.nextInt();
        int areaTria = (b * h) / 2;
        System.out.println("Area of Triangle : " + areaTria);

        //3. area of triangle same for area of parallelogram
        System.out.println("Enter breadth and length of rectangle : ");
        int leng = sc.nextInt();
        int brea = sc.nextInt();
        int areaRect = leng * brea;
        System.out.println("Area of Rectangle : " + areaRect);

        //4. area of rhombus using diagonals
        System.out.println("Enter Values of two diagonals of rhombus : ");
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int areaRhom = (d1 * d2) / 2;
        System.out.println("Area of Rhombus : " + areaRhom);

        //5. area of equilateral triangle
        System.out.println("Enter side of Equilateral Triangle : ");
        int a = sc.nextInt();
        int areaEqu = (int) (Math.sqrt(3) * a * a / 4);
        System.out.println("Area of Equilateral Triangle : " + areaEqu);

        //6. Perimeter of circle
        System.out.println("enter Radius of circle : ");
        int r = sc.nextInt();
        int perCir = (int) (2 * 3.14 * r);
        System.out.println("Perimeter Of circle :" + perCir);

        //7. Perimeter of equilateral triangle
        System.out.println("enter side of Equilateral triangle  : ");
        int side = sc.nextInt();
        int perEqu = 3 * side;
        System.out.println("Perimeter Of Equilateral Triangle : " + perEqu);
        
        //8. perimeter of parallelogram same for rectangle
        System.out.println("Enter sides of Parallelogram :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int perPara = (x + y) * 2;
        System.out.println("Perimeter of Parallelogram : " + perPara);
        sc.close();
    }
}
