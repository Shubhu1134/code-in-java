class Mobile {
    private String brand;
    private String model;
    private double price;

    // Setter methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to check if the phone is affordable
    public boolean isAffordable() {
        return price < 20000;
    }

    // Method to display phone info and affordability
    public void showMobileInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("Affordable: " + (isAffordable() ? "Yes" : "No"));
    }
}

public class Test {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.setBrand("Realme");
        obj.setModel("Narzo 60x");
        obj.setPrice(14999);

        obj.showMobileInfo();
    }
}