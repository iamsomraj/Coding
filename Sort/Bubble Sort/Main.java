class Main
{
    public static void main(String args[])
    {
        int arr[] = {20,60,71,3,1,0,98,101,5654,256,985,465,756};
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted array is as follows: ");
        System.out.println();
        for(int a: arr)
        {
            System.out.println(a);
        }
    }
}