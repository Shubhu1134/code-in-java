// class Task{


// void task1() synchronization{
//   for (int i =0; i<=3;i++){
//     System.out.println("task 1 is on running ...")
//   }
// }
// }

// class Main{
//     public static void main(String args[]){


// Thread t1 = new Thread(() -> {
      



class MyTask implements Runnable {
    public void run() {
        System.out.println("Task running...");
    }
}

class Main {
    public static void main(String[] args) {
        MyTask task = new MyTask();       
        Thread t1 = new Thread(task);      
        t.start();                        
    }
}
