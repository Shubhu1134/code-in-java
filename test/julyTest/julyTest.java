import java.util.Scanner;

 class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

           // Take customer details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
         //enter the gender 
        System.out.print("Enter your gender (male/female): ");
        String gender = sc.nextLine();

        int itemCount = 1;
        double grandTotal = 0;
        double actualPrice = 0;
        double discountedPrice = 0;

        
        String billDetails = "";
        String carryBag = "no";
        double carryBagCost = 0;

    
         itemCount = 1;
            System.out.println("\nEnter details for item " + itemCount + ":");

            System.out.print("Item name: ");
            String itemName = sc.nextLine();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            int price = itemCount * 10;
            double totalPrice = quantity * price;
            double discountedItemPrice = totalPrice;


            itemCount = 2;
            System.out.println("\nEnter details for item " + itemCount + ":");

            System.out.print("Item name: ");
            itemName = sc.nextLine();

            System.out.print("Quantity: ");
            int quantity2 = sc.nextInt();
            sc.nextLine();

            price = itemCount * 10;
             totalPrice = quantity2* price;
             discountedItemPrice = totalPrice;

              itemCount = 3;
            System.out.println("\nEnter details for item " + itemCount + ":");

            System.out.print("Item name: ");
            itemName = sc.nextLine();

            System.out.print("Quantity: ");
             quantity2 = sc.nextInt();
            sc.nextLine(); 

            price = itemCount * 10;
             totalPrice = quantity2* price;
             discountedItemPrice = totalPrice;

              itemCount = 4;
            System.out.println("\nEnter details for item " + itemCount + ":");

            System.out.print("Item name: ");
            itemName = sc.nextLine();

            System.out.print("Quantity: ");
             quantity2 = sc.nextInt();
            sc.nextLine(); 

            price = itemCount * 10;
             totalPrice = quantity2* price;
             discountedItemPrice = totalPrice;

              itemCount = 5;
            System.out.println("\nEnter details for item " + itemCount + ":");

            System.out.print("Item name: ");
            itemName = sc.nextLine();

            System.out.print("Quantity: ");
             quantity2 = sc.nextInt();
            sc.nextLine(); 

            price = itemCount * 10;
             totalPrice = quantity2* price;
             discountedItemPrice = totalPrice;

              itemCount = 6;
            System.out.println("\nEnter details for item " + itemCount + ":");

            System.out.print("Item name: ");
            itemName = sc.nextLine();

            System.out.print("Quantity: ");
             quantity2 = sc.nextInt();
            sc.nextLine(); 

            price = itemCount * 10;
             totalPrice = quantity2* price;
             discountedItemPrice = totalPrice;


              itemCount = 7;
            System.out.println("\nEnter details for item " + itemCount + ":");

            System.out.print("Item name: ");
            itemName = sc.nextLine();

            System.out.print("Quantity: ");
             quantity2 = sc.nextInt();
            sc.nextLine(); 

            price = itemCount * 10;
             totalPrice = quantity2* price;
             discountedItemPrice = totalPrice;


              itemCount = 8;
            System.out.println("\nEnter details for item " + itemCount + ":");

            System.out.print("Item name: ");
            itemName = sc.nextLine();

            System.out.print("Quantity: ");
             quantity2 = sc.nextInt();
            sc.nextLine(); 

            price = itemCount * 10;
             totalPrice = quantity2* price;
             discountedItemPrice = totalPrice;

              itemCount = 9;
            System.out.println("\nEnter details for item " + itemCount + ":");

            System.out.print("Item name: ");
            itemName = sc.nextLine();

            System.out.print("Quantity: ");
             quantity2 = sc.nextInt();
            sc.nextLine(); 

            price = itemCount * 10;
             totalPrice = quantity2* price;
             discountedItemPrice = totalPrice;

              itemCount = 10;
            System.out.println("\nEnter details for item " + itemCount + ":");

            System.out.print("Item name: ");
            itemName = sc.nextLine();

            System.out.print("Quantity: ");
             quantity2 = sc.nextInt();
            sc.nextLine(); 

            price = itemCount * 10;
             totalPrice = quantity2* price;
             discountedItemPrice = totalPrice;

             

            
            if (itemCount == 1 && quantity > 4) {
                discountedItemPrice = totalPrice * 0.95; // 5% discount
            } else if (itemCount == 5) {
                discountedItemPrice = totalPrice * 0.90; // 10% discount
            } else if (itemCount == 10) {
                discountedItemPrice = totalPrice * 0.85; // 15% discount
            }

            actualPrice += totalPrice;
            discountedPrice += discountedItemPrice;

           
            billDetails += "  " + itemName + "\t\t" + quantity + "\t\t" + price + "\t\t" + totalPrice + " Rs\t" + discountedItemPrice + " Rs\n";
             
  // Final bill-level discount
        double finalBillAfterDiscount = discountedPrice;

        double billDiscount = 0;
        if (discountedPrice > 10000) {
            billDiscount = discountedPrice * 0.15;
        } else if (discountedPrice > 5000) {
            billDiscount = discountedPrice * 0.10;
        }

        finalBillAfterDiscount = discountedPrice - billDiscount;

        // GST
        double gst = finalBillAfterDiscount * 0.10;

        // Ask for carry bag
        System.out.print("\nDo you want a carry bag? (yes/no): ");
        carryBag = sc.nextLine();
        if (carryBag.equalsIgnoreCase("yes")) {
            carryBagCost = 10;
        }

        // Final payable amount
        double finalPayable = finalBillAfterDiscount + gst + carryBagCost;

        // Gift
        String gift = "";
        if (gender.equalsIgnoreCase("female")) {
            gift = "Cadeberry";
        } else {
            gift = "Ledger Wallet";
        }

        // Display final bill
        System.out.println("\n\n\t\t\tD-Mart");
        System.out.println("Name: " + name + "\t\t\t\tDate: 12/09/2022");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Item Name\tQuantity \t Price\tTotal\tAfter-Discount");
        System.out.println();
        System.out.println(billDetails);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("\t\t\t  A.P\t\tD.P");
        System.out.println("\t\t\t  " + actualPrice + "\t\t" + discountedPrice);
        System.out.println("Gift :- " + gift + "\t\t0.00\t0.00");
        System.out.println("Carry Bag: " + carryBag + "\t\t" + carryBagCost + "\t\t" + carryBagCost);
        System.out.println("GST (10%):\t\t" + gst + "\t" + gst);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("\t\t\t  Final Total:\t" + finalPayable + " Rs");
        System.out.println("\n\t\tThank You\n\t\tTo Visit\n\t\tD-Mart");
        System.out.println("-----------------------------------------------------------------------");
    }
}
