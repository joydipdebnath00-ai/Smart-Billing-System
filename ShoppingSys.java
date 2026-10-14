
/*2. Smart Shop Billing System
Real-life use: Grocery or stationery shops

Accept the name, price, and quantity of three products.
Requirements
- Calculate each item's subtotal.
- Apply a 10% discount if the bill exceeds ₹2,000.
- Add 5% tax after the discount.
- Print an itemized bill with the final amount.
Concepts: Variables, arithmetic, conditions, formatted output.*/

import java.util.Scanner;

public class ShoppingSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = new String[3];
        double[] price = new double[3];
        double[] quantity = new double[3];
        double[] subtotal = new double[3];
        double totalBill = 0, discount;
        int count = 0;
        double Tax ,discountedBill,finalAmount;

        System.out.println("\n==================== SMART SHOP BILLING SYSTEM ====================");

        while(count < 3){
            System.out.print("\nEnter product name: ");
            name[count] = sc.nextLine();

            System.out.print("Enter product price: ");
            price[count] = sc.nextDouble();

            System.out.print("Enter the quantity of the products: ");
            quantity[count] = sc.nextDouble();
            sc.nextLine(); // Consume the newline character

            subtotal[count] = price[count] * quantity[count];
            totalBill += subtotal[count];
            count++;

        }

        if(totalBill > 2000){
            discount = 0.1*totalBill;
            System.out.println("\nYour discount is: " +discount);
        }else {
            discount = 0;
        }

        discountedBill = totalBill - discount;
        Tax = 0.05 * discountedBill;
        finalAmount = discountedBill + Tax;

        System.out.println("\n------------------------- INVOICE -------------------------");
        System.out.printf("| %-15s | %-10s | %-8s | %-12s |%n", "Product Name", "Price", "Qty", "Subtotal");
        System.out.println("-----------------------------------------------------------");
        
    for (int i = 0; i < 3; i++) {
            System.out.printf("| %-15s | ₹%-9.2f | %-8.2f | ₹%-11.2f |%n", name[i], price[i], quantity[i], subtotal[i]);
        }
        
        System.out.println("-----------------------------------------------------------");
        System.out.printf("Gross Total:                                   ₹%-11.2f%n", totalBill);
        System.out.printf("Discount (10%% if > ₹2000):                     ₹%-11.2f%n", discount);
        System.out.printf("Tax (5%%):                                      ₹%-11.2f%n", Tax);
        System.out.println("-----------------------------------------------------------");
        System.out.printf("FINAL AMOUNT TO PAY:                           ₹%-11.2f%n", finalAmount);
        System.out.println("-----------------------------------------------------------");
        
        sc.close();
    }
}
