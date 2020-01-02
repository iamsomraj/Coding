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
     

        int m1[][] = new int[10][10];
        int res[][] = new int[10][10];
        System.out.println("\n\nEnter the elements of the First Matrix:");
        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < b; j++)
            {
                m1[i][j] = sc.nextInt();
            }
        }   
     
        System.out.println("\n\nMatrix:\n\n\n");
        for(int i=0; i <a; i++)
        {
            System.out.printf("|\t");
            for(int j =0; j <b; j++)
            {
                    System.out.printf("%d\t",m1[i][j]);            
            }
            
            System.out.printf("|");
            System.out.println();


        }
        
   
    
        for(int i = a-1, m=0; i >=0 && m<a; i--,m++)
        {
            for(int j = b-1,n=0; j >=0 && n<b; j--,n++)
            {
                res[m][n] = m1[i][j];
            }

        }
          
     
     
        
                
        System.out.println("\n\nTranspose of the Matrix:\n\n\n");
        for(int i=0; i <a; i++)
        {
            System.out.printf("|\t");
            for(int j =0; j <b; j++)
            {
                    System.out.printf("%d\t",res[i][j]);            
            }
            
            System.out.printf("|");
            System.out.println();


        }
        
        
        
    }
        
       
        
        
        
      
        
}
