/*
   Area :-- Properties : (l,w)
            behaviour : int getArea()
   Volume :-- Properties : (l,w,h)
              behaviour :- getArea()
                           getVolume() 
*/

class Area {
    private int l, w;
    
    // Constructor for Area class
    public Area(int l, int w) {
        this.l = l;
        this.w = w;
    }
    
    public int getArea() {
        return l * w;
    }
    
    // Getter methods if needed
    public int getLength() { return l; }
    public int getWidth() { return w; }
}

class Volume extends Area {
    private int h;
    
    // Constructor for Volume class
    public Volume(int l, int w, int h) {
        super(l, w);  // Call parent constructor
        this.h = h;
    }
    
    public int getVolume() {
        return getArea() * h;
    }
    
    public int getHeight() { return h; }
}

class TestMain {
    public static void main(String args[]) {
        Volume v = new Volume(2, 3, 4);  // Direct initialization
        System.out.println("Area : " + v.getArea());
        System.out.println("Volume : " + v.getVolume());
    }
}