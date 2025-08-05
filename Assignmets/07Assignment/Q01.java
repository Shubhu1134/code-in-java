// | 10 20 30 |
// | 40 50 60 |
// | 70 80 90 |

// o/p -->10 50 90 or print the diagonal elements 

// class Test{
//     public static void main(String args[]){
//         int arr[][]= new int[m][n];

//         for int(r =0; r<3; r++){
//             for(int c=0; c<3 ;c++){
//                 int arr[][]= new int [][]
//             }
//         } 
//     }
// }




import java.util.Scanner;

 class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

   
        int[][] arr = new int[rows][cols];

    
        System.out.println("Enter elements:");
        for ( i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }

            System.out.print("Diagonal elements are");

             for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                while(rows == cols){
                    System.out.print(arr[i][j]);
                }
                }
            }
        }
       
        }

        }