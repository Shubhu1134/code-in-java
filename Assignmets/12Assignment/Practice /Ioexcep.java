import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

// class Main {

//     public static void Input() {
//         File f = new File("Shubham.txt");
//         try (FileWriter fin = new FileWriter(f);) {
//             if (!f.exists())
//                 f.createNewFile();

//             String d = "Hello";
//             fin.write(d);
//             fin.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     public static void OutPut() {
//         File f = new File("Shubham.txt");
//         try {

//             FileInputReader fout = new FileInputReader(f);
//             String data = "";
//             while (true) {
//                 int x = fout.read();
//                 if (x == -1)
//                     break;
//                 data = data + (char) x;
//             }
//             System.out.println(data);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

//     public static void main(String[] args) {
//         // Input();
//         OutPut();
//     }
// }

class Test {
    public static void Input(){
        File f = new File("Shubham.text");
        try(FileWriter fin = new FileWriter(f);){
            if(!f.exists())
            f.createNewFile();


            String d= "hello ";
            String s= "good ";
            fin.write(d+s);
            fin.close();
            
        }
        catch(IOException e){
            e.printStackTrace();
            }


    }
    public static void main(String args[]){
        Input();
    }
}
