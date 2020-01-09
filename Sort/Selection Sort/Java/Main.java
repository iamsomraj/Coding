class Main
{
    public static void main(String args[])
    {
        int arr[] = {15,63,58,69,14,36,47,52,63,96,41};
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            int min = i;
            for(int j = i+1; j<n; j++)
            {
                if( arr[min] > arr[j] )
                {
                    min = j;
                }
            }

            if(min!=i)
            {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

        }


        System.out.println("The sorted array is as follows: ");
        for(int i: arr)
        {
            System.out.println(i);
        }
    }
}