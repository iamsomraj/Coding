import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Merge mer = new Merge();
        mer.getInput();
    }
}
class Merge
{
    int arr[];
    int low , high;
    int res[];
    
    Scanner sc = new Scanner(System.in);
    
    public void getInput()
    {
        System.out.println("Enter the number of the elements");
        int len = sc.nextInt();
        arr = new int[len];
        res = new int[len];
        low = 0;
        high = len - 1;
        System.out.println("Enter the elements one by one: ");
        for(int i=0; i<len; i++)
        {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,low,high);
        display();
    }
    public void mergeSort(int arr[], int low, int high)
    {
        if(low<high)
        {
            int mid = (int) ((low + high) / 2);
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
        
        
    }
    
    public void merge(int arr[], int low, int mid, int high)
    {
        int i = low;
        int j = mid+1;
        int k = low;
        while(i<=mid && j<=high)
        {
            if(arr[i] <= arr[j])
            {
                res[k] = arr[i];
                i++;
            }
            else
            {
                res[k] = arr[j];
                j++;
            }
            k++;
        }
        
        if(i>mid)
        {
            while(j<=high)
            {
                res[k] = arr[j];
                k++;
                j++;
            }
        }
        else
        {
            while(i<=mid)
            {
                res[k] = arr[i];
                k++;
                i++;
            }
        }
            
    }
    
    
    public void display()
    {
        System.out.println("\nThe sorted array using the merge sort : \n");
        for(int key: res)
        {
            System.out.println(key);
        }
    }
    
}
