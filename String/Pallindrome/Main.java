import java.util.*;
class Main
{
    public static void main(String ars[])
    {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the string:");
        str = sc.nextLine();
        
        int[] fre = new int[26];
        
        for(int i: fre)
        {
            i=0;
        }
        
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            
            if((ch >= 'A' && ch<= 'Z'))
            {
                fre[(int)ch-'A']++;
            }
            else if((ch >= 'a' && ch<= 'z'))
            {
                fre[(int)ch-'a']++;
            }
            
        }
        
        System.out.println("\nFrequency Given:");
        
        for(int i=0; i<fre.length; i++)
        {
            if(fre[i]!=0)
            {
                System.out.println("\nFrequency of "+(char)(i+'A')+" is : "+fre[i]);
            }
        }

        
        
        int n = str.length();
        int even = 0, odd = 0;
        
        for(int i: fre )
        {
            if(i!=0)
            {
                if(i%2==0)
                {
                    even= even + i/2;
                }
                else
                {
                    odd = odd + i;;
                }
            }
           
        }
        
        System.out.println(even);
        System.out.println(odd);


        if(n%2==0)
        {
            if(even*2==n)
            {
                System.out.println("\nCan be a pallindrome");
            }
            else
            {
                System.out.println("\nCan not be a pallindrome");

            }
        }
        else
        {
            if(even*2+odd==n)
            {
                System.out.println("\nCan be a pallindrome");
            }
            else
            {
                System.out.println("\nCan not be a pallindrome");

            }
        }
            
        
    }
}