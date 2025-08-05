class Product {
    private int productId;
    private String name;
    private int quantity;
    private double price;

    // Setter methods
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to calculate total value
    public void calculateTotalValue() {
        double totalValue = quantity * price;
        System.out.println("Product Name: " + name);
        System.out.println("Total Value: ₹" + totalValue);
    }
}

public class Test {
    public static void main(String[] args) {
        Product obj = new Product();
        obj.setProductId(1001);
        obj.setName("Bluetooth Speaker");
        obj.setQuantity(10);
        obj.setPrice(999.99);

        obj.calculateTotalValue();
    }
}