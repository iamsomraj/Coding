import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter the number of row and column of the First Matrix:");
        a=sc.nextInt();
        b=sc.nextInt();        
        System.out.println("\n\nEnter the number of row and column of the Second Matrix:");
        c=sc.nextInt();
        d=sc.nextInt();
        
        
        if(b==c)
        {
        int m1[][] = new int[10][10];
        int m2[][] = new int[10][10];
        int res[][] = new int[10][10];
        System.out.println("\n\nEnter the elements of the First Matrix:");
        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < b; j++)
            {
                m1[i][j] = sc.nextInt();
            }
        }   
        
        System.out.println("\n\nEnter the elements of the Second Matrix:");
        for(int i = 0; i < c; i++)
        {
            for(int j = 0; j < d; j++)
            {
                m2[i][j] = sc.nextInt();
            }
        }
        
        
        
        int sum = 0;
        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < d; j++)
            {
                sum = 0;
                for(int k = 0; k < c; k++)
                {
                    sum = sum + m1[i][k]*m2[k][j];
                }
                res[i][j] = sum;
            }
        }
            
            
        System.out.println("\n\nResult of the Matrix Multiplication:\n\n\n");
        for(int i = 0; i < a; i++)
        {
            System.out.printf("|\t");
            for(int j = 0; j < d; j++)
            {
                System.out.printf("%d\t",res[i][j]);
            }
            System.out.printf("|");
            System.out.println();


        }
        
        
        
        }
        
        else
        {
            System.out.println("\n\nmatric multiplicaton cannot be done!");

        }
        
        
        
        
      
        
    }
}