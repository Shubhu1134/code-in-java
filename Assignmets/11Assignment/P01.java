interface DiscountApplicable{
    applyDiscount();
}

abstract class Order{
    private int orderId;
    private int ammount ;

    processOrder();
    cancelOrder();
    applyDiscount(){
        
    }

    orderSummery(){

    }
}

class OnlineOrder extends Order impliments DiscountApplicable{

}
class StorePickupOrder extends Order{

}