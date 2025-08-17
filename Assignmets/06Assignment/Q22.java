import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;

        System.out.print("Enter the number of elements for the array: ");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            System.out.print("array[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int lesser = Integer.MIN_VALUE, greater = Integer.MAX_VALUE;
        for (i = 0; i < n; i++) {
            if (arr[i] < num && arr[i] > lesser) lesser = arr[i];
            if (arr[i] > num && arr[i] < greater) greater = arr[i];
        }

        if (lesser != Integer.MIN_VALUE)
            System.out.println("Element lesser than " + num + " is: " + lesser);
        else
            System.out.println("No lesser element found");

        if (greater != Integer.MAX_VALUE)
            System.out.println("Element greater than " + num + " is: " + greater);
        else
            System.out.println("No greater element fou
