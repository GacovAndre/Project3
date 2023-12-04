import java.util.Scanner;
public class PerimetarIPlostinaNaKruznica {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Vnesi go radiusot na krugot: ");
double radius = scanner.nextDouble();
double circumference = 2 * Math.PI * radius;
double area = Math.PI * radius * radius;
System.out.println("Perimetarot na kruznicata iznesuva: " + circumference);
System.out.println("Plostinata na kruznicata iznesuva: " + area);
scanner.close();
    }
}
