class Main
{
   public static void main(String[] args) {
       int a[] = {52,63,41,74,85,96,14,25,36,47,58,69,84};
       for(int i=1;i< a.length;i++)
       {
           int temp = a[i];
           int j = i - 1;
           while(j>=0 && a[j] > temp)
           {
               a[j+1] = a[j];
               j--;
           }
           a[j+1] = temp;
       }

       System.out.println("The sorted array is as follows: ");
       System.out.println();
       for(int val : a)
       {
           System.out.println(val);
       }
   }
}