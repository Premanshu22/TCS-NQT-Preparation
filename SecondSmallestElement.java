import java.util.Scanner;

public class SecondSmallestElement {
    public static int findSecondSmallest(int[]arr)
    {
        if(arr.length < 2)
            return -1;
        
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int num : arr)
        {
            if(num < firstMin)
            {
                secondMin = firstMin;
                firstMin = num;
            }

            else if(num < secondMin && num != firstMin)
            {
                secondMin = num;
            }
        }

        return (secondMin == Integer.MAX_VALUE) ? -1 : secondMin;
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements : ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int secondSmallest = findSecondSmallest(arr);
        if(secondSmallest == -1)
        {
            System.out.println("No second smallest found");
        }
        else{
            System.out.println("Smallest element is : "+secondSmallest);
        }
    }

}
