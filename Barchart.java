
import java.io.*;
import java.util.Scanner;

public class Barchart {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        //find the max from the array 
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }

        //printing the stars for bar chart
        for(int floor=max; floor>=1; floor--)
        {
            for(int i=0; i<arr.length; i++)
            {
                if(arr[i]>= floor)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
    }
}
