import java.util.Scanner;
public class priceCalculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("enter no of items: ");
int n = sc.nextInt();
double total = 0;
for (int i = 1; i <= n; i++) {
System.out.print("Enter price " + i + ": ");
double price = sc.nextDouble();
total += price;
System.out.println("Total Price = " + total);
}
}
}