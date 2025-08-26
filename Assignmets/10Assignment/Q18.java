import java.util.*;

class Product {
    int pid, quantity;
    double price;

    Product(int pid, double price, int quantity) {
        this.pid = pid; this.price = price; this.quantity = quantity;
    }
}

public class XYZ {
    static double totalAmount(Product[] arr) {
        double sum = 0;
        for (Product p : arr) sum += p.price * p.quantity;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] arr = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter pid, price, qty: ");
            arr[i] = new Product(sc.nextInt(), sc.nextDouble(), sc.nextInt());
        }

        // highest price
        Product max = arr[0];
        for (Product p : arr) if (p.price > max.price) max = p;
        System.out.println("Highest price product pid = " + max.pid);

        System.out.println("Total amount spent = " + totalAmount(arr));
    }
}
