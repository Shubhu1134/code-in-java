/*
27. Find the cost of tiling a dining room 
20 m long and 15 m wide at the 
rate of $5 per square m.
*/ 

class Test {
    public static void main(String args[]){
        int l = 20 ;
        int b = 15; 

        int area =  l * b ; 
        int cost = area* 5 ; 

        System.out.println("cost of tiling the total area will be : "+ cost + " $");
    }
}