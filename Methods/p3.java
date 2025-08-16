class Time {
    private int hour ; 
    private int minute; 

    public Time( int hour , int minute){
        this.hour= hour ; 
        this.minute= minute; 
    }

    public Time(){}
     public Time add(Time d)
     {
        Time temp = new Time();
         temp.hour = this.hour + d.hour;
        temp.minute = this.minute + d.minute;
         if(temp.minute >=60){
          temp.hour++;
        temp.minute %= 60; // temp.minute = temp.minute%60
        }
        return temp;
     }
     public void add(Time t1, Time t2){
         this.hour = t1.hour + t2.hour;
        this.minute = t1.minute + t2.minute;
         if(this.minute >=60){
             this.hour++;
             this.minute %= 60;
       }
    }
    public void display(){
        System.out.println(hour+" hour "+minute+" minute");
   }
 
}
class Test{
    public static void main(String args[]){
        Time t1 = new Time(4,50);
        Time t2 = new Time(2,50);
        t1.display();
        t2.display();
        Time t3 = new Time();
        t3.add(t1,t2);
        System.out.println("Total Time");
        t3.display();
    }
}
