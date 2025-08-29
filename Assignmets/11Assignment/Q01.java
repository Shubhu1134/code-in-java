// import java.util.Scanner; 

// interface Refundable{
//     Processrefund();
// }

// abstract class Pyment{
//   int ammount ;

//   pay();

//   paymentDertails();

// }

// class Creditardpayment extends Payment implements Refundable{

// }
// class DebitCard
abstract class Payment {
    double amount;
    Payment(double amount) { this.amount = amount; }
    abstract void pay();
    void paymentDetails() { System.out.println("Payment of Rs." + amount); }
}

interface Refundable {
    void processRefund();
}

class CreditCardPayment extends Payment implements Refundable { ... }
class DebitCardPayment extends Payment { ... }
class UPIPayment extends Payment implements Refundable { ... }


class Test{
    public static void main(String args[]){
    
    
    public void Payment(){

    }
    public void Refund implements Refundable(){
        void processRefund(){
            System.out.println(Test.Payment());
        }
    }
    
    }
}