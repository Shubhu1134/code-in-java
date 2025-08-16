class Time1{
    private int hour;
    private int minute;
    public Time1(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    
    public Time1(){}

    public Time1 add(Time1 d){
        Time1 temp = new Time1();
        temp.hour = this.hour + d.hour;
        temp.minute = this.minute + d.minute;
        if(temp.minute >=60){
            temp.hour++;
            temp.minute %= 60; // temp.minute = temp.minute%60
        }
        return temp;
    }
    public void display(){
        System.out.println(hour+" hour "+minute+" minute");
    }
}
class TestMain{
    public static void main(String args[]){
        Time1 d1 = new Time1(5,7);
        Time1 d2 = new Time1(2,60);
        d1.display();
        d2.display();
        Time1 result =  d1.add(d2);
        result.display();
    }
}