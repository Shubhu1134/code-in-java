//  add the time of two workers in a single day using class and objects and methods 

class work {
  

    work(int hour, int minute) {
        this.hour = hour;
        this.minute= minute;
    }

  
    void displayInfo() {
        System.out.println("hour: " + name);
        System.out.println(" minutes : " + minute);
    }
}

public class Test {
    public static void main(String[] args) {
        // Creating two work objects
        work p1 = new work("Ravi", 2,30);
        work p2 = new work("Priya", 4, 30);

        // Display info
        System.out.println("---- work 1 ----");
        p1.displayInfo();

        System.out.println("---- work 2 ----");
        p2.displayInfo();
    }
}




