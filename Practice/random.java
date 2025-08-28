
class Test{
    public static void main(String args[]){
        
        Child box = new Child();
        System.out.println(box.l);
        System.out.println(box.w);
        System.out.println(box.weight);
    }
}

class  Parent{
    double l;
    double w;

    Parent(){
        this.l = -1;
        this.w = -1;
    }
}

class Child extends Parent{
    double weight;

    Child(){
        this.weight = -1;
    }
}
