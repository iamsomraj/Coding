import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int n;
        System.out.println("\n\nEnter the number of the elements:\n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[]  = new int[n];
        System.out.println("\n\nEnter elements one by one:\n");

        for (int i= 0; i< n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("\n\nThe input array is - \n\n");
        for (int i= 0; i< n; i++)
        {
            System.out.println(arr[i]);
        }
        int max = arr[0];
        for(int i: arr)
        {
            if(max<i)
            {
                max = i;
            }
        }
        int lcm = 1, c;
        for(int i=1; i<=max; i++)
        {
            c=0;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[j]%i==0)
                {
                    c++;
                }
            }
            if(c>=2)
            {
                for(int j=0; j<arr.length; j++)
                {
                    if(arr[j]%i==0)
                    {
                        arr[j] = arr[j]/i;
                    }
                }
                lcm = lcm * i;
            }
            else
            {
                continue;
            }
           
        }
        for(int i:arr)
        {
            lcm = lcm * i;
        }
        
        System.out.println("\n\nThe lcm is \n"+lcm);

        

    }
}